package com.Restro_Hub.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Restro_Hub.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User>findUserByEmail(String email);

}
