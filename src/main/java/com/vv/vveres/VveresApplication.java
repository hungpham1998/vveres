package com.vv.vveres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class VveresApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(VveresApplication.class, args);
    }
}
