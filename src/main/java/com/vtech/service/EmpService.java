package com.vtech.service;

import java.util.List;

import com.vtech.models.Emp;

public interface EmpService {

	Emp saveEmp(Emp emp);

	public List<Emp> getEmps();

	public Emp getEmpByEmpId(String empId);
}
