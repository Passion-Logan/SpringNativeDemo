package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(proxyBeanMethods = false)
@RestController
public class SpringNativeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNativeDemoApplication.class, args);
    }

    @RequestMapping("/native/hi")
    @ResponseBody
    public String hiNative() {
        return "hi native application...";
    }

}
