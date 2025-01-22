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

	// Keywords related Queries
	public List<Student> getStudentByStudName(String studName);

	public List<Student> getStudentByEmailId(String emailId);

	public List<Student> getStudentByStudNameAndEmailId(String studName, String emailId);

	public List<Student> getStudentByStudNameOrEmailId(String studName, String emailId);
	
	public List<Student> findByStudIdGreaterThan(Integer studId);
	
	public List<Student> findByStudNameOrderByMobileNumber(String studName);
}
