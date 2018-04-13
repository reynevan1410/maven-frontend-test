package no.kantega.springandreact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.Instant;

@RestController
public class HelloController {
    public static void main(String[] args) {

    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello :) the time at the server is now " + Instant.now().plus(Duration.ofHours(5)) + "\n";
    }
}
