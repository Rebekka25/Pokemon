package de.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import de.pokemon.entity.User;

public interface UserRepository  extends JpaRepository<User, String>{
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	User findUserByEmail(String email);
}
