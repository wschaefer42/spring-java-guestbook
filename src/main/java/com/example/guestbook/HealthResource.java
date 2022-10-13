package com.example.guestbook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import static java.lang.System.nanoTime;

@RestController
@RequestMapping("/health")
public class HealthResource {
    @GetMapping("/ping")
    public String pint() {
        return "pong";
    }

    @GetMapping("/processing")
    public String processing() throws InterruptedException {
        var startTime = nanoTime();
        Thread.sleep(new Random().nextLong(2_000));
        var elapsedTimeInMS = (nanoTime() - startTime) / 1000_000.0;
        return String.format("Slept for %4f seconds", elapsedTimeInMS / 1000.0);
    }
}
