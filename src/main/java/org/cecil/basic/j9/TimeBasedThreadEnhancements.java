package org.cecil.basic.j9;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class TimeBasedThreadEnhancements {

  public static void main(String[] args) {
    var afterTwoSeconds = CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS);
    var completableFuture = CompletableFuture.supplyAsync(
        TimeBasedThreadEnhancements::getNumber, afterTwoSeconds)
        .orTimeout(1, TimeUnit.SECONDS);
    completableFuture.thenAccept(System.out::println).join();
  }

  public static int getNumber() {
    return new Random().nextInt();
  }

}
