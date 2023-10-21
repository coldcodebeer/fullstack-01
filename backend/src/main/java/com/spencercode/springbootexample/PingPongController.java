package com.spencercode.springbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// for testing cd

@RestController
public class PingPongController {
    record PingPong(String result) {};

    @GetMapping("/ping")
    public PingPong getPingPong() {
        return new PingPong("Pong");
    }
}
