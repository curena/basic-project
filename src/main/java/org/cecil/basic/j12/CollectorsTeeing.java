package org.cecil.basic.j12;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class CollectorsTeeing {

  public static void main(String[] args) {
    var employeeList = Arrays.asList(
        new Employee(1, "Juan", 100),
        new Employee(2, "Pablo", 200),
        new Employee(3, "Matías", 300),
        new Employee(4, "Ramón", 400));

    var result = employeeList.stream().collect(
        Collectors.teeing(
            Collectors.filtering(e -> e.salary() >= 200, Collectors.toList()),
            Collectors.filtering(e -> e.salary() >= 200, Collectors.counting()),
            (list, count) -> {
              HashMap<String, Object> map = new HashMap<>();
              map.put("list", list);
              map.put("count", count);
              return map;
            }
        ));

    out.println(result);
  }

  record Employee(long id, String name, double salary) {}


}
