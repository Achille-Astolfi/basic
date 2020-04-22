package com.example.basic.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.basic")
public class BasicBoot {
	public static void main(String[] args) {
		SpringApplication.run(BasicBoot.class);
	}
}
