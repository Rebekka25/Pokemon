package de.pokemon.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.pokemon.repository.UserRepository;
@Component
public class UserEntityLogic {
	@Autowired
	UserRepository userRepository;

	public boolean userAvailable(User user) {
		User existUser = userRepository.findUserByEmail(user.getEmail());
		if(existUser!=null)
			return true;
		return false;
	}
	
	public boolean proofDoubleUser(User user) {
		boolean userExist= userAvailable(user);
		if(userExist)
			System.out.println("User wurde schon angelegt und wird darum nicht abgespeichert");
		else {
			System.out.println("user wird abgespeichert");
		return false;
		}
		return true;
	}

}
