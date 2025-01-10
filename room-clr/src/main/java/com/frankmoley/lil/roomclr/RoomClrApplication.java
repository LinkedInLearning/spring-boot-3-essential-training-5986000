package com.frankmoley.lil.roomclr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@SpringBootApplication
public class RoomClrApplication {

  public static void main(String[] args) {
    SpringApplication.run(RoomClrApplication.class, args);
  }

  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder builder){
    return builder.build();
  }

  @Bean
  public CommandLineRunner run(RestTemplate restTemplate) {
    return args -> {
      ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8080/api/rooms",
          HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
          });
      rooms.getBody().forEach(System.out::println);
    };
  }

}
