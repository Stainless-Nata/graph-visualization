package com.bardlind.graph;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Visualization {

    public static void main(String[] args) {
        SpringApplication.run(Visualization.class, args);
    }
}