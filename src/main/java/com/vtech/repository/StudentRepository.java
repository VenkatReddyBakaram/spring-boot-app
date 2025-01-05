package com.vtech.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vtech.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
