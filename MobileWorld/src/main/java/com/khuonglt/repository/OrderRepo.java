package com.khuonglt.repository;

import org.springframework.data.repository.CrudRepository;

import com.khuonglt.entities.Order;

public interface OrderRepo extends CrudRepository<Order, Integer>  {

}
