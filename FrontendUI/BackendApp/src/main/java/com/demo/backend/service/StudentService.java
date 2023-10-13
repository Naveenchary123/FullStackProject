package com.demo.backend.service;
import java.util.List;

import com.demo.backend.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}