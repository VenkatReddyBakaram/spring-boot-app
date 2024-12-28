package com.vtech.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vtech.dtos.CustomerDTO;
import com.vtech.service.CustomerService;

@Service
public class CustomerImpl implements CustomerService {

	@Override
	public CustomerDTO getCustomer() {

		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerName("Scott");
		customerDTO.setEmail("Scott@Gmail.com");
		customerDTO.setAddress("US");
		customerDTO.setPhoneNumber("123456789");

		return customerDTO;
	}

	@Override
	public List<CustomerDTO> getCustomers() {

		List<CustomerDTO> listOfCustomers = new ArrayList<CustomerDTO>();

		CustomerDTO customerDTO1 = new CustomerDTO();
		customerDTO1.setCustomerName("Scott");
		customerDTO1.setEmail("Scott@Gmail.com");
		customerDTO1.setAddress("US");
		customerDTO1.setPhoneNumber("123456789");

		CustomerDTO customerDTO2 = new CustomerDTO();
		customerDTO2.setCustomerName("Smith");
		customerDTO2.setEmail("Smith@Gmail.com");
		customerDTO2.setAddress("UK");
		customerDTO2.setPhoneNumber("983745857");

		listOfCustomers.add(customerDTO1);
		listOfCustomers.add(customerDTO2);

		return listOfCustomers;
	}
}
