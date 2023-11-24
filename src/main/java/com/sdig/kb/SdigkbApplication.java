package com.sdig.kb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sdig.kb.mapper")
public class SdigkbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdigkbApplication.class, args);
    }

}
