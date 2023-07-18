package com.app.expirytracker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.app.expirytracker.mapper")
public class ExpiryTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpiryTrackerApplication.class, args);
	}

}
