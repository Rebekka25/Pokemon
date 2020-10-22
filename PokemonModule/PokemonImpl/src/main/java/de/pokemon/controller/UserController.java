package de.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.pokemon.entity.User;
import de.pokemon.entity.UserEntityLogic;
import de.pokemon.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserEntityLogic userEntityLogic;
	@Autowired
	UserRepository userRepository;
	
	
	@CrossOrigin(origins="http://localhost:4200", allowedHeaders ="*") 
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		boolean isUserDouble = userEntityLogic.proofDoubleUser(user);
		if(isUserDouble==false)
			userRepository.save(user);
		return user;
}
	
	
	@CrossOrigin(origins="http://localhost:4200", allowedHeaders ="*") 
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		System.out.println("hier sich angemeldet"+user.getEmail());
		return user;
	}
	}