package org.cecil.basic.j16.recordclasses;

import java.util.List;

public class RecordClassesExpanded {
  private record Merchant(String name) {

    record Nested(String fooBar) {}

//    This won't compile
//    String myString = "Hello";

//    But this will
//    static String myString = "Hello";

    public String getName() {
      System.out.println("Performing some action aside from access");
      return this.name;
    }
  }
  private record Sale(Merchant merchant, double amount) {}

  public List<Merchant> findTopMerchants(List<Merchant> merchants, List<Sale> sales) {
    record MerchantSales(Merchant merchant, double sales) {}

    //perform some logic to compute sales;
    return null;
  }
}
