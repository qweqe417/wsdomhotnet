package com.ujiuye;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ujiuye.dao")
@SpringBootApplication
public class WsdomhotnetApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsdomhotnetApplication.class, args);
    }

}
