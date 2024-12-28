package com.vtech.service.impl;

import org.springframework.stereotype.Service;

import com.vtech.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	public String doLogin(String email,String password) {
		
		if (email.equals(password))
			return "success";
		else
			return "failure";
	}
}
