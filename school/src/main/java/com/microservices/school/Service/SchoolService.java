package com.microservices.school.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.school.Client.StudentClient;
import com.microservices.school.Model.School;
import com.microservices.school.Repo.SchoolRepository;
import com.microservices.school.Utils.FullSchoolResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository repository;
    private StudentClient client;

    public void saveSchool(School school) {
        repository.save(school);
    }

    public List<School> findAllSchools() {
        return repository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer school_ID) {
        var school = repository.findById(school_ID)
                .orElse(School.builder().name("NOT_FOUND").email("NOT_FOUND").build());
        var student = client.findAllStudentsBySchool(school_ID);

        return FullSchoolResponse.builder().name(school.getName()).email(school.getEmail()).students(student).build();
    }
}
