package com.barbell.decorating;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.barbell.decorating.dao")
public class DecoratingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoratingApplication.class, args);
    }

}
