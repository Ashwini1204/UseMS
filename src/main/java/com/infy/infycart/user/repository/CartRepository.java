package com.infy.infycart.user.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.infycart.user.entity.Cart;
import com.infy.infycart.user.entity.CartId;

public interface CartRepository extends CrudRepository<Cart,CartId>{
	
	List<Cart> findByBuyerId(Integer buyerId);
}