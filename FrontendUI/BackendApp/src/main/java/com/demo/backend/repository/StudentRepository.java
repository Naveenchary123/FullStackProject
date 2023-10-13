package com.demo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.backend.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}