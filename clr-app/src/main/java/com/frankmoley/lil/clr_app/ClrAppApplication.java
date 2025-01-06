package com.frankmoley.lil.clr_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClrAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClrAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception{
		return args -> {
			for(int i=1; i<=100; i++){
				System.out.println("Counting: " + i);
			}
		};
	}
}
