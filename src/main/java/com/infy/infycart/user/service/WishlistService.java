package com.infy.infycart.user.service;

import java.util.List;

import com.infy.infycart.user.dto.WishlistDTO;

public interface WishlistService {
	public String addWishlist(WishlistDTO wishlistDTO);
	public String deleteWishlist(WishlistDTO wishlistDTO);
	public List<WishlistDTO> getAllWishlist();
	public List<WishlistDTO> getAllWishlistByBuyerId(Integer buyerId);
}