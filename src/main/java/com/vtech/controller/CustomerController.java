package com.vtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtech.dtos.CustomerDTO;
import com.vtech.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/getMessage")
	public String getMessage() {
		return "customer data is now able to access...!";
	}

	@GetMapping("/getCustomer")
	public CustomerDTO getCustomer() {
		return customerService.getCustomer();
	}

	@GetMapping("/getCustomers")
	public List<CustomerDTO> getCustomers() {
		return customerService.getCustomers();
	}

	@PostMapping("/postCustomer")
	public CustomerDTO postCustomer(@RequestBody CustomerDTO customerDTO) {

		System.out.println(customerDTO.getCustomerName());
		System.out.println(customerDTO.getEmail());
		System.out.println(customerDTO.getAddress());
		System.out.println(customerDTO.getPhoneNumber());

		return customerDTO;
	}

	@PostMapping("/postCustomers")
	public List<CustomerDTO> postCustomers(@RequestBody List<CustomerDTO> customerList) {

		System.out.println(customerList);

		for (CustomerDTO customerDTO : customerList) {
			System.out.println(customerDTO.getCustomerName());
			System.out.println(customerDTO.getEmail());
			System.out.println(customerDTO.getAddress());
			System.out.println(customerDTO.getPhoneNumber());
		}

		return customerList;
	}

	@PutMapping("/updateCustomer")
	public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO) {

		System.out.println(customerDTO.getCustomerName());
		System.out.println(customerDTO.getEmail());
		System.out.println(customerDTO.getAddress());
		System.out.println(customerDTO.getPhoneNumber());

		customerDTO.setCustomerName("John");
		customerDTO.setEmail("John@gmail.com");
		customerDTO.setAddress("UK");
		customerDTO.setPhoneNumber("9876543211");

		return customerDTO;
	}

	@PatchMapping("/updatePartialCustomer")
	public CustomerDTO updatePartialCustomer(@RequestBody CustomerDTO customerDTO) {

		System.out.println(customerDTO.getCustomerName());
		System.out.println(customerDTO.getEmail());
		System.out.println(customerDTO.getAddress());
		System.out.println(customerDTO.getPhoneNumber());

		customerDTO.setAddress("UK");
		customerDTO.setPhoneNumber("9876543211");

		return customerDTO;
	}

	@DeleteMapping("/deleteCustomer")
	public String deleteCustomer() {
		return "Customer data is deleted..!";
	}
}