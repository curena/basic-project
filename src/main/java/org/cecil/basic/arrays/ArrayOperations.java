package org.cecil.basic.arrays;

import java.util.Arrays;

public record ArrayOperations(int[] array) {

  public void sortArray() {
    Arrays.sort(array);
  }

  public String toString() {
    return array.length + ": " + "";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayOperations that = (ArrayOperations) o;
    return Arrays.equals(array, that.array);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(array);
  }
}
