package org.cecil.basic.j16;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapMulti {

  /**
   * Using Stream::flatMap, this method will:
   * <p>
   * 1. Make multiple List<String> based on the input. 2. For each List<String> return a stream of
   * List<MyDomainObject> 3. Then convert each of those MyDomainObject into streams 4. Then collect
   * them into a List<MyDomainObject>
   *
   * @param input a list of strings
   * @return a list of domain objects after some transformation
   */
  public static List<MyDomainObject> withFlatMap(final List<String> input) {
    return input.isEmpty()
        ? Collections.emptyList() :
        input.stream()
            .map(StreamMapMulti::getDomainObjects)
            .flatMap(List::stream)
            .toList();
  }

  public static List<MyDomainObject> withMapMulti(final List<String> input) {
    return input.isEmpty()
        ? Collections.emptyList() :
        input.stream()
            .map(StreamMapMulti::getDomainObjects)
            .<MyDomainObject>mapMulti(Iterable::forEach)
            .toList();
  }

  public static void main(String[] args) {
    withFlatMap(List.of("foo", "bar", "baz")).stream().forEach(System.out::println);
//    withMapMulti(List.of("foo", "bar", "baz")).forEach(System.out::println);

    System.out.println(Stream.of(" foo ", " bar", "baz ")
        .map(String::strip).toList());
  }

  public static List<MyDomainObject> getDomainObjects(final String name) {
    return List.of(new MyDomainObject(1, name));
  }

  record MyDomainObject(int id, String name) {

  }


}
