package com.infy.infycart.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.infycart.user.entity.Buyer;

public interface BuyerRepository extends CrudRepository<Buyer,Integer>{

	Buyer findByEmail(String email);
	
}
