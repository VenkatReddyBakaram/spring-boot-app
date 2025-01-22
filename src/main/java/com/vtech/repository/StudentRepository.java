package com.vtech.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vtech.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	public List<Student> getStudentByStudName(String studName);

	public List<Student> getStudentByEmailId(String emailId);

	public List<Student> getStudentByStudNameAndEmailId(String studName, String emailId);

	public List<Student> getStudentByStudNameOrEmailId(String studName, String emailId);

	public List<Student> findByStudIdGreaterThan(Integer studId);

	public List<Student> findByStudNameOrderByMobileNumber(String studName);
}
