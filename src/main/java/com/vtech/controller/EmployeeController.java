package com.vtech.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vtech.dtos.EmployeeDTO;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping(value = "/getEmp", method = RequestMethod.GET)
	@ResponseBody
	public String getEmp() {
		return "response from get employee web service";
	}

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public EmployeeDTO getEmployee() {

		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpId(1234);
		employeeDTO.setEmpName("John");
		employeeDTO.setEmailId("john@gmail.com");
		employeeDTO.setSalary(45000.40);

		/*
		 * employeeDTO.setEmpId(1235); employeeDTO.setEmpName("scott");
		 * employeeDTO.setEmailId("scott@gmail.com"); employeeDTO.setSalary(55000.40);
		 */

		return employeeDTO;
	}

	@RequestMapping(value = "/employeeList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public java.util.List<EmployeeDTO> employeeList() {

		java.util.List<EmployeeDTO> listOfEmployees = new java.util.ArrayList<EmployeeDTO>();

		EmployeeDTO employeeDTO1 = new EmployeeDTO();
		employeeDTO1.setEmpId(1234);
		employeeDTO1.setEmpName("John");
		employeeDTO1.setEmailId("john@gmail.com");
		employeeDTO1.setSalary(45000.40);

		EmployeeDTO employeeDTO2 = new EmployeeDTO();
		employeeDTO2.setEmpId(1235);
		employeeDTO2.setEmpName("scott");
		employeeDTO2.setEmailId("scott@gmail.com");
		employeeDTO2.setSalary(55000.40);

		listOfEmployees.add(employeeDTO1);
		listOfEmployees.add(employeeDTO2);

		return listOfEmployees;
	}

	@RequestMapping(value = "/postEmp", method = RequestMethod.POST)
	@ResponseBody
	public String postEmp() {
		return "Data is created...!";
	}

	@RequestMapping(value = "/putEmp", method = RequestMethod.PUT)
	@ResponseBody
	public String putEmp() {
		return "Data Updated...!";
	}

	@RequestMapping(value = "/patchEmp", method = RequestMethod.PATCH)
	@ResponseBody
	public String patchEmp() {
		return "Data is partially updated...!";
	}

	@RequestMapping(value = "/deleteEmp", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteEmp() {
		return "Data is Deleted...!";
	}

}
