package com.Restro_Hub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restro_Hub.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findAllByCategory_Id(int id);

}
