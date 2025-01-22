package com.vtech.service;

import java.util.List;

import com.vtech.models.Students;

public interface StudentsService {

	public Students saveStudent(Students student);

	public List<Students> getStudents();

	public Students getStudentByStudId(Integer studId);
}
