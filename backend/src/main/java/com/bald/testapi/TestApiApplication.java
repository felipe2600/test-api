package com.bald.testapi;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bald.testapi.entities.User;
import com.bald.testapi.repositories.UserRepository;

@SpringBootApplication
public class TestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);
	}
	/*
	 @Bean
	    CommandLineRunner init(UserRepository userRepository) {
	        return args -> {
	            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
	                User user = new User(null, name, name.toLowerCase() + "@domain.com");
	                userRepository.save(user);
	            });
	            userRepository.findAll().forEach(System.out::println);
	        };
	    }*/
}
