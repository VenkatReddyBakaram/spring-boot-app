package com.vtech.service;

import java.util.Set;

import com.vtech.dtos.StudRequest;
import com.vtech.models.Stud;

public interface StudService {

	public Stud createStudentWithCourses(StudRequest request, Set<Long> courseIds);
}
