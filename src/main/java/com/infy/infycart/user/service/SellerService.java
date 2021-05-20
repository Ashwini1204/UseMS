package com.infy.infycart.user.service;

import javax.validation.Valid;

import com.infy.infycart.user.dto.SellerDTO;

public interface SellerService {
	public String userRegister(SellerDTO sellerDTO);
	public String userLogin(@Valid SellerDTO sellerDTO);
}
