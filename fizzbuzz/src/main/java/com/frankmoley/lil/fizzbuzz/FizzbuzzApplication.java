package com.frankmoley.lil.fizzbuzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return args->{
			for (int i=1; i<=100; i++){
				String result = "";
				result += (i % 3) == 0 ? "Fizz": "";
				result += (i % 5) == 0 ? "Buzz": "";
				System.out.println(!result.isEmpty()?result: i);
			}
		};
	}

}
