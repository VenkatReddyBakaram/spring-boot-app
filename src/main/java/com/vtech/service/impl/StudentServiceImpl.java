package com.vtech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtech.models.Student;
import com.vtech.repository.StudentRepository;
import com.vtech.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Integer studId, Student student) {

		Optional<Student> studentDB = studentRepository.findById(studId);

		if (studentDB.isPresent()) {
			Student updateStudent = studentDB.get();
			updateStudent.setEmailId(student.getEmailId());
			updateStudent.setMobileNumber(student.getMobileNumber());
			updateStudent.setStudName(student.getStudName());
			return studentRepository.save(updateStudent);
		}
		return null;
	}

	@Override
	public Student getStudentByStudId(Integer studId) {
		Optional<Student> studentDB = studentRepository.findById(studId);
		if (studentDB.isPresent())
			return studentDB.get();
		else
			return null;
	}

	@Override
	public String deleteStudentByStudId(Integer studId) {
		studentRepository.deleteById(studId);
		return "Record(s) succesfully Deleted";
	}

	@Override
	public Student patchStudent(Integer studId, Student patchStudent) {
		Optional<Student> studentDB = studentRepository.findById(studId);

		if (studentDB.isPresent()) {

			Student updateStudent = studentDB.get();

			if (patchStudent.getEmailId() != null)
				updateStudent.setEmailId(patchStudent.getEmailId());

			if (patchStudent.getMobileNumber() != null)
				updateStudent.setMobileNumber(patchStudent.getMobileNumber());

			if (patchStudent.getStudName() != null)
				updateStudent.setStudName(patchStudent.getStudName());

			return studentRepository.save(updateStudent);
		}
		return null;
	}

	@Override
	public List<Student> getStudentByStudName(String studName) {
		return studentRepository.getStudentByStudName(studName);
	}

	@Override
	public List<Student> getStudentByEmailId(String emailId) {
		return studentRepository.getStudentByEmailId(emailId);
	}

	@Override
	public List<Student> getStudentByStudNameAndEmailId(String studName, String emailId) {
		return studentRepository.getStudentByStudNameAndEmailId(studName, emailId);
	}

	@Override
	public List<Student> getStudentByStudNameOrEmailId(String studName, String emailId) {
		return studentRepository.getStudentByStudNameOrEmailId(studName, emailId);
	}

	@Override
	public List<Student> findByStudIdGreaterThan(Integer studId) {
		return studentRepository.findByStudIdGreaterThan(studId);
	}

	@Override
	public List<Student> findByStudNameOrderByMobileNumber(String studName) {
		return studentRepository.findByStudNameOrderByMobileNumber(studName);
	}
}