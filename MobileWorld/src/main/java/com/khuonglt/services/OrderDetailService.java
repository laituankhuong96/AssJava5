package com.khuonglt.services;

import java.util.List;

import com.khuonglt.entities.OrderDetail;

public interface OrderDetailService {

	List<OrderDetail> findByOrderID(int id);
	
	void save(OrderDetail orderDetail);
	
	void update(OrderDetail orderDetail);

}
