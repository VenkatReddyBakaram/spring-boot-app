package com.vtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vtech.models.Student;
import com.vtech.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

	@GetMapping("/getStudentByStudId")
	public Student getStudentByStudId(@RequestParam Integer studId) {
		return studentService.getStudentByStudId(studId);
	}

	@PostMapping("/saveStudent")
	public Student postMethodName(@RequestBody Student student) {
		return studentService.save(student);
	}

	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestParam Integer studId, @RequestBody Student student) {
		return studentService.updateStudent(studId, student);
	}

	@PatchMapping("/patchStudent")
	public Student patchStudent(@RequestParam Integer studId, @RequestBody Student student) {
		return studentService.patchStudent(studId, student);
	}

	@DeleteMapping("/deleteStudentByStudId")
	public String deleteStudentByStudId(@RequestParam Integer studId) {
		return studentService.deleteStudentByStudId(studId);
	}
}