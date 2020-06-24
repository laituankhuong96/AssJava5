package com.khuonglt.services;

import java.util.List;

import com.khuonglt.entities.Product;

public interface ProductService {

	Iterable<Product> findAll();

	List<Product> search(String q);
	
	List<Product> searchByCateID(int id);
	
	List<Product> SearchByPriceRange(long from, long to);
	
	List<Product> SearchByCateAndPriceRange(int id, long from, long to);

	Product findOne(int id);
	
	Product findByName(String name);
	
	List<Object> getByBestSeller(int topNumber);
	
	List<Product> getByMostViews(int topNumber);

	void save(Product product);
	
	void update(Product product);

	void delete(int id);

}
