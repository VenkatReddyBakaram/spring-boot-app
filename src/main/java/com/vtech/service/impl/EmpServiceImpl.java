package com.vtech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtech.models.Emp;
import com.vtech.repository.EmpRepository;
import com.vtech.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepository empRepository;

	@Override
	public Emp saveEmp(Emp emp) {
		return empRepository.save(emp);
	}

	@Override
	public List<Emp> getEmps() {
		return empRepository.findAll();
	}

	@Override
	public Emp getEmpByEmpId(String empId) {
		Optional<Emp> empDB = empRepository.findById(empId);
		if (empDB.isPresent())
			return empDB.get();
		else
			return null;
	}
}