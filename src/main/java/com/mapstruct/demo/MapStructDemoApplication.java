package com.mapstruct.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class MapStructDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapStructDemoApplication.class, args);
    }

}
