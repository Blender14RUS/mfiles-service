package com.test;

import com.test.service.impl.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MfilesServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MfilesServiceApplication.class, args);
        context.getBean(Test.class).test();
    }

}
