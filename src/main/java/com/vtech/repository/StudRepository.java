package com.vtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtech.models.Stud;

@Repository
public interface StudRepository extends JpaRepository<Stud, Long> {
}
