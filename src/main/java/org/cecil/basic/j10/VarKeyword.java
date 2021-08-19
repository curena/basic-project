package org.cecil.basic.j10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class VarKeyword {

  public void before() {
    String hello = "Hello World!";
    Map<String, List<String>> myMap = new HashMap<>();
    myMap.put("hello", List.of(hello));
    SomeType myType = new SomeType();

    for (Entry<String, List<String>> entry : myMap.entrySet()) {
      System.out.println("key: " + entry.getKey());
    }
  }

  public void after() {
    var hello = "Hello World!";
    var myMap = new HashMap<String, List<String>>();
    myMap.put("hello", List.of(hello));
    var myType = new SomeType();

    for (var entry : myMap.entrySet()) {
      System.out.println("key: " + entry.getKey());
    }
  }

}
