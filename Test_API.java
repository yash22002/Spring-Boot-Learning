package com.Yash.Learning_Spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test_API {
    @GetMapping("/")
    public String Testing(){
        return "Hello This Is The Test API";
    }
}
