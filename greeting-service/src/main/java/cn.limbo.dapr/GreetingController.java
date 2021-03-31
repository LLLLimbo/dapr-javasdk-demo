package cn.limbo.dapr;

import io.dapr.client.DaprClient;
import io.dapr.client.domain.HttpExtension;
import java.util.Objects;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private final DaprClient daprClient;

  public GreetingController(DaprClient daprClient) {
    this.daprClient = daprClient;
  }

  @GetMapping("/greet")
  public String greet() {
    byte[] response = daprClient
        .invokeMethod("hello-service", "hello", null, HttpExtension.POST, null, byte[].class)
        .block();
    return new String(Objects.requireNonNull(response));
  }

}
