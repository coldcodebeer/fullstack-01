package com.spencercode.springbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// for testing cd
// modify this as what you want
// 12

@RestController
public class PingPongController {
    private static int COUNTER = 0;
    record PingPong(String result) {};

    @GetMapping("/ping")
    public PingPong getPingPong() {
        return new PingPong("Pong %s".formatted(++COUNTER));
    }
}
