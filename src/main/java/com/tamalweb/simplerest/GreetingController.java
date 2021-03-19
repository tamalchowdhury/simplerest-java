package com.tamalweb.simplerest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private long num = 1;

    @GetMapping("/greeting")
    public Greeting greetTheAudience() {
        return new Greeting(num, "Hello");
    }

    @GetMapping("/color")
    public Colors getColor(@RequestParam(value = "color", defaultValue = "No Color") String color) {
        return new Colors(color);
    }
    
}
