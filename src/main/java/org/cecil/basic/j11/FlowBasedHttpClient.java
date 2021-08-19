package org.cecil.basic.j11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class FlowBasedHttpClient {

  public HttpResponse<String> doSomething()
      throws InterruptedException, ExecutionException {
    var httpClient = HttpClient.newHttpClient();

    HttpRequest request =
        HttpRequest.newBuilder()
            .uri(URI.create("http://localhost/foo"))
            .GET()
            .build();

    return httpClient
        .sendAsync(request, BodyHandlers.ofString())
        .orTimeout(1, TimeUnit.SECONDS)
        .get();
  }


}
