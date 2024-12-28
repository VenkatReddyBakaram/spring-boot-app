package com.vtech.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.vtech.service.EmployeeService;
import com.vtech.service.GreetingMessage;

import jakarta.inject.Inject;

//@Component("myEmployee")
@Component
@Lazy
public class Employee {

	@Autowired
	private Address address;

	@Autowired
	private EmployeeService employeeService;

	// @Autowired
	// @Qualifier("french")
	// @Resource(name = "english")
	@Inject
	@Qualifier("french")
	// @Qualifier("french")
	private GreetingMessage greetingMessage;

	public Employee() {
		System.out.println("Employee object is created...!");
	}

	public void employeeDetails() {

		System.out.println("Employee Details Method is executing ...!");
		address.printAddress();

		employeeService.displayEmployeeDetails();
	}

	public void greeting() {
		greetingMessage.greeting();
	}
}