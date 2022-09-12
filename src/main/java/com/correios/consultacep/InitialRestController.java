package com.correios.consultacep;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialRestController {

    @GetMapping("/hello")
    public String hello() {
        return String.format("Hello World!!");
    }
}
