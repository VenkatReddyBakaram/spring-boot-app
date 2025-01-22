package com.vtech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtech.models.Students;
import com.vtech.repository.StudentsRepository;
import com.vtech.service.StudentsService;

@Service
public class StudentsServiceImpl implements StudentsService {

	@Autowired
	private StudentsRepository studentsRepository;

	@Override
	public Students saveStudent(Students student) {
		return studentsRepository.save(student);
	}

	@Override
	public List<Students> getStudents() {
		return (List<Students>) studentsRepository.findAll();
	}

	@Override
	public Students getStudentByStudId(Integer studId) {
		Optional<Students> studentDB = studentsRepository.findById(studId);
		if (studentDB.isPresent())
			return studentDB.get();
		else
			return null;
	}
}