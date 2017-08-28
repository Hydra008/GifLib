package com.codeGodfather.giflib;

/**
 * Created by godfather on 2017-08-23.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
 // this annotation will autoconfigure spring application
@EnableAutoConfiguration
//scan for controllers
@ComponentScan
public class AppConfig {

    public static void main(String[] args){
        SpringApplication.run(AppConfig.class, args);
    }
}