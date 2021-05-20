package com.infy.infycart.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.infycart.user.entity.Seller;

public interface SellerRepository extends CrudRepository<Seller,Integer>{

	Seller findByEmail(String email);

}