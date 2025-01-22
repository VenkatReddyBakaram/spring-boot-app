package com.vtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtech.models.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {

}
