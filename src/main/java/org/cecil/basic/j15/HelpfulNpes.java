package org.cecil.basic.j15;

import lombok.Getter;
import lombok.Setter;

public class HelpfulNpes {
  @Getter
  @Setter
  private String myString = null;

  public static void main(String[] args) {

    HelpfulNpes helpfulNpes = new HelpfulNpes();
//    helpfulNpes.setMyString("Foobar");
    System.out.println("MyString: " + helpfulNpes.getMyString());
    System.out.println("myString length: " + helpfulNpes.getMyString().length());
  }
}
