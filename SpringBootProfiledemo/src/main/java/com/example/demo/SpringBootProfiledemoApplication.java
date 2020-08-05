package com.example.demo;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.config.EnvBasedConfig;

@SpringBootApplication
public class SpringBootProfiledemoApplication implements CommandLineRunner {

	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private EnvBasedConfig envBasedConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfiledemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=================");
		System.out.println("DataSource: "+dataSource);
		System.out.println("=================");
		envBasedConfig.setup();
	}

}
