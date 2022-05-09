package org.cecil.basic.arrays;

import java.util.Arrays;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Getter
public class ArrayOperations {
  private final int[] array;

  public void sortArray() {
    Arrays.sort(array);
  }
}
