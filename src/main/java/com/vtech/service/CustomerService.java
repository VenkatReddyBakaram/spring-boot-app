package com.vtech.service;

import java.util.List;

import com.vtech.dtos.CustomerDTO;

public interface CustomerService {

	public CustomerDTO getCustomer();

	public List<CustomerDTO> getCustomers();

}
