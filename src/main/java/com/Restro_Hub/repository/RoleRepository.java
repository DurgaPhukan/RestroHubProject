package com.Restro_Hub.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Restro_Hub.model.Role;
import com.Restro_Hub.model.User;

public interface RoleRepository extends JpaRepository<Role, Integer>{

 


}
