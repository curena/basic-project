package org.cecil.basic.j12;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StringEnhancements {

  public static void main(String[] args) {
    final var pipes = "Juan|Pablo|Duarte";
    final var commas = "Matías,Ramón,Mella";

    final Function<String, List<String>> pipeDelimited =
        it -> Arrays.asList(it.split("\\|"));
    final Function<String, List<String>> commaDelimited =
        it -> Arrays.asList(it.split(","));

    out.println("Pipes: ");
    pipes.transform(pipeDelimited).forEach(out::println);
    out.println("Commas: ");
    commas.transform(commaDelimited).forEach(out::println);


  }
}
