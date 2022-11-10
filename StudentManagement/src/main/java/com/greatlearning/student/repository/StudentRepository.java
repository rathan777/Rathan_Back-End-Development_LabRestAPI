package com.greatlearning.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}