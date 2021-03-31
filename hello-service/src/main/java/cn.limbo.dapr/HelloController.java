package cn.limbo.dapr;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @PostMapping("/hello")
  public String greet() {
    return "Hello!";
  }

}
