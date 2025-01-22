package com.vtech.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	private Long id;
	private String title;

	@ManyToMany(mappedBy = "courses")
	private Set<Stud> students = new HashSet<>();

	// getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Stud> getStudents() {
		return students;
	}

	public void setStudents(Set<Stud> students) {
		this.students = students;
	}
}