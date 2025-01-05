package com.vtech.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Table(name = "student_tab")
public class Student {

	@Id
	// @Column(name = "student_id")
	private Integer studId;

	// @Column(name = "student_name")
	private String studName;

	// @Column(name = "student_email_id")
	private String emailId;

	// @Column(name = "student_mobile_number")
	private String mobileNumber;

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}