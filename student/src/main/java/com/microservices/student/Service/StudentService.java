package com.microservices.student.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.student.Model.Student;
import com.microservices.student.Repo.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public void saveStudent(Student student) {
        repository.save(student);
    }

    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    public List<Student> findAllStudentsBySchool(Integer school_Id) {
        return repository.findAllBySchoolId(school_Id);
    }
}
