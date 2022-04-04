package com.Restro_Hub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restro_Hub.model.Category;

 
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

   

}
