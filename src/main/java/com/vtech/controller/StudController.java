package com.vtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtech.dtos.StudRequest;
import com.vtech.models.Stud;
import com.vtech.service.StudService;

@RestController
@RequestMapping("/stud")
public class StudController {

	@Autowired
	private StudService studentService;

	@PostMapping("/add")
	public Stud addStudentWithCourses(@RequestBody StudRequest request) {
		return studentService.createStudentWithCourses(request, request.getCourseIds());
	}
}
