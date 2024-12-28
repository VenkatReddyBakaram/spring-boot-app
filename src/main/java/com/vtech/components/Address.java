package com.vtech.components;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Address {

	public Address() {
		System.out.println("Address object is created...!");
	}

	public void printAddress() {
		System.out.println("Employee Address is printing...!");
	}
}
