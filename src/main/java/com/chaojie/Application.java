package com.chaojie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Starting up");
        SpringApplication.run(Application.class, args);

    }
}

