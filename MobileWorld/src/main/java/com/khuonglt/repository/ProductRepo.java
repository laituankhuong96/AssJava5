package com.khuonglt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.khuonglt.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {

	List<Product> findByNameContaining(String q);
	
	List<Product> findByPrice(long from, long to);

}
