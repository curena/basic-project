package org.cecil.basic.j9;

public interface PrivateMethodsInInterfacesAfter {

  int getSomeInt();

  void doSomeAction();

  default void myDefaultMethod() {
    myPrivateMethod();
  }

  private void myPrivateMethod() {
    System.out.println("Hello World!");
  };
}
