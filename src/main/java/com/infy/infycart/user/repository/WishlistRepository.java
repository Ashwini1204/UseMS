package com.infy.infycart.user.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.infycart.user.entity.Wishlist;
import com.infy.infycart.user.entity.WishlistId;

public interface WishlistRepository extends CrudRepository<Wishlist,WishlistId>{

	List<Wishlist> findByBuyerId(Integer buyerId);
	
}
