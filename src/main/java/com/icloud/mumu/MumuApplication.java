package com.icloud.mumu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.icloud.mumu.*.mapper")
public class MumuApplication {
    public static void main(String[] args) {
        SpringApplication.run(MumuApplication.class, args);
    }
}
