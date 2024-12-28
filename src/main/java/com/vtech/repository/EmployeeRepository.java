package com.vtech.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;


@Lazy
@Repository
public class EmployeeRepository {

	public EmployeeRepository() {
		System.out.println("EmployeeRepository Object is created..!");
	}

	public void fetchEmpDetails() {
		System.out.println("Employee Data we captured from database...!");
	}
}
