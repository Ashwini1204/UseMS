package com.infy.infycart.user.service;

import com.infy.infycart.user.dto.BuyerDTO;

public interface BuyerService {
	public String userRegister(BuyerDTO buyerdto);
	public String userLogin(BuyerDTO buyerDTO);
}