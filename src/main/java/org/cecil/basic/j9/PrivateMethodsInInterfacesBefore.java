package org.cecil.basic.j9;

public interface PrivateMethodsInInterfacesBefore {

  int getSomeInt();

  void doSomeAction();

  default void myDefaultMethod() {
    System.out.println("Hello World!");
  }
}
