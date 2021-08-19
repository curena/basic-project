package org.cecil.basic.j16;

public class PatternMatchingInstanceOf {

  public void before(Object myObj) {
//
    if (myObj instanceof String s && s.length() > 0) {
      System.out.println(s);
    }
  }

  public void after(Object myObj) {

  }

}
