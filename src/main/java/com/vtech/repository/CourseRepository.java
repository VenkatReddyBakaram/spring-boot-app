package com.vtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtech.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
