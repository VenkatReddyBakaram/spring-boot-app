package com.vtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vtech.models.Students;
import com.vtech.service.StudentsService;

@RestController
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	private StudentsService studentsService;

	@GetMapping("/getStudents")
	public List<Students> getStudents() {
		return studentsService.getStudents();
	}

	@GetMapping("/getStudentByStudId")
	public Students getStudentByStudId(@RequestParam Integer studId) {
		return studentsService.getStudentByStudId(studId);
	}

	@PostMapping("/saveStudent")
	public Students postMethodName(@RequestBody Students student) {
		return studentsService.saveStudent(student);
	}
}