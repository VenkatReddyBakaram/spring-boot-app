package com.vtech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.vtech.repository.EmployeeRepository;
import com.vtech.service.EmployeeService;

@Service
@Lazy
public class EmployeeServiceImpl implements EmployeeService {

	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl Object is created..!");
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void displayEmployeeDetails() {
		System.out.println("Employee business logic is executing...!");
		System.out.println("display Employee Details Service...!");

		employeeRepository.fetchEmpDetails();
	}
}
