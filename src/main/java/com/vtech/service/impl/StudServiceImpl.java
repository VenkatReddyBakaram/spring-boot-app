package com.vtech.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtech.dtos.StudRequest;
import com.vtech.models.Course;
import com.vtech.models.Stud;
import com.vtech.repository.CourseRepository;
import com.vtech.repository.StudRepository;
import com.vtech.service.StudService;

@Service
public class StudServiceImpl implements StudService {

	@Autowired
	private StudRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	public Stud createStudentWithCourses(StudRequest request, Set<Long> courseIds) {
		Stud student = new Stud();

		student.setId(request.getId());
		student.setName(request.getStudentName());

		Set<Course> courses = new HashSet<>();
		for (Long courseId : courseIds) {
			Course course = courseRepository.findById(courseId)
					.orElseThrow(() -> new RuntimeException("Course not found"));
			courses.add(course);
		}

		student.setCourses(courses);
		return studentRepository.save(student);
	}
}