package org.cecil.basic.arrays;

import java.util.Arrays;
import lombok.Value;
import org.springframework.stereotype.Component;

@Component
@Value
public class ArrayOperations {

  int[] array;

  public void sortArray() {
    Arrays.sort(array);
  }
}
