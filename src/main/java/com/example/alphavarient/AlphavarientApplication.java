package com.example.alphavarient;

import com.example.alphavarient.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlphavarientApplication {

    Logger logger = new Logger();

    public static void main(String[] args) {

        SpringApplication.run(AlphavarientApplication.class, args);

    }

}
