package com.vtech.dtos;

public class EmployeeDTO {

	private Integer empId;
	private String empName;
	private String emailId;
	private Double salary;

	public EmployeeDTO() {
	}

	public EmployeeDTO(Integer empId, String empName, String emailId, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}