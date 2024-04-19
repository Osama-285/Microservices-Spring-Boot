package com.microservices.student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.student.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
