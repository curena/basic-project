package org.cecil.basic.j9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TryWithResources {

  public void myMethod_Before(final FileInputStream fileInputStream){
    try (FileInputStream anotherInputStream = fileInputStream) { //have to create dummy object
      //Perform some action here
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void myMethod_After(final FileInputStream fileInputStream){
    try (fileInputStream) { // No need for dummy object
      //Perform some action here
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
