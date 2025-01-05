package com.vtech.service;

import java.util.List;

import com.vtech.models.Student;

public interface StudentService {

	public Student save(Student student);

	public List<Student> getStudents();

	public Student getStudentByStudId(Integer studId);

	public String deleteStudentByStudId(Integer studId);

	public Student updateStudent(Integer studId, Student student);

	public Student patchStudent(Integer studId, Student student);
}
