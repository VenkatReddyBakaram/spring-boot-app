package com.vtech.dtos;

public class CustomerDTO {

	private String customerName;
	private String email;
	private String address;
	private String phoneNumber;

	public CustomerDTO() {
	}

	public CustomerDTO(String customerName, String email, String address, String phoneNumber) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
