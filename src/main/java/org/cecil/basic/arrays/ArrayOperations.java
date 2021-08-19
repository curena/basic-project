package org.cecil.basic.arrays;

import java.io.Serializable;
import java.util.Arrays;

public class ArrayOperations implements Serializable {

  private static final long serialVersionUID = -4222507161788337528L;

  public Integer[] sortArray(Integer[] ints) {
    Arrays.sort(ints);
    return ints;
  }
}
