package com.chaerim.accountbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableJpaAuditing
@SpringBootApplication
@RestController
@PropertySource("classpath:/env.properties")
public class AccountBookApplication {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }
    public static void main(String[] args) {
        SpringApplication.run(AccountBookApplication.class, args);
    }

}
