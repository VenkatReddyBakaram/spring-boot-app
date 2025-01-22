package com.vtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtech.models.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, String> {

}
