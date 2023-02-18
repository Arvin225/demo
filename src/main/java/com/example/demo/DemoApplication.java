package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        int i = 1;
        while (i < 8) {
            if (i == 7) {
                System.out.println("Hello centos" + i + "!!!");
            }else {
                System.out.println("Hello centos" + i + "!");
            }
            i++;
        }
        System.out.println("--------------------------");
        return "Congratulation! You are success to deploy your project named demo.";
    }

}
