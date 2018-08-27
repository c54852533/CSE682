package com.su.cse682;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.su.cse682")
@MapperScan(basePackages = "com.su.cse682.infrastructure.persistent")
public class Cse682Application {

	public static void main(String[] args) {
		SpringApplication.run(Cse682Application.class, args);
	}
}
