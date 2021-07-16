package com.bald.testapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bald.testapi.entities.User;
import com.bald.testapi.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> getUsers(){
		return (List<User>) userRepository.findAll();
	}
	
	@PostMapping
	public void addUsers(@RequestBody User user){
	 	userRepository.save(user);
	}
	
	

}
