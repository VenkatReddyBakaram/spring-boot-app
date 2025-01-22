package com.vtech.dtos;

import java.util.Set;

public class StudRequest {

	private Long id;
	private String studentName;
	private Set<Long> courseIds;

	// Getters and Setters

	public String getStudentName() {
		return studentName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set<Long> getCourseIds() {
		return courseIds;
	}

	public void setCourseIds(Set<Long> courseIds) {
		this.courseIds = courseIds;
	}
}
