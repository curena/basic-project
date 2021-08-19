package org.cecil.basic.j9;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class ProcessApi {

  public static void main(String[] args) {
//    processBefore();
    processAfter();
  }

  public static void processBefore() {
    try {
      Process process = Runtime.getRuntime()
          .exec(new String[]{"ls", "-la"},
              new String[]{"MY_ENV=myvalue"});
      BufferedReader bufferedReader = new BufferedReader(
          new InputStreamReader(process.getInputStream()));
      bufferedReader.lines().forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void processAfter() {
    try {
      ProcessBuilder processBuilder = new ProcessBuilder();
      processBuilder.environment().put("MY_ENV", "myval");
      Process process = processBuilder.command("ls", "-la").start();
      BufferedReader bufferedReader = new BufferedReader(
          new InputStreamReader(process.getInputStream()));
      bufferedReader.lines().forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
