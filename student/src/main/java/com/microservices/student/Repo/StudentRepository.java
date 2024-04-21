package com.microservices.student.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.student.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllBySchoolId(Integer school_Id);

}
