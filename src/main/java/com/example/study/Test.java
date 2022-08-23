package com.example.study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Test {

    @GetMapping("/test")
    public List<String> test() {
        return Arrays.asList("react java 연동", "test");
    }
}