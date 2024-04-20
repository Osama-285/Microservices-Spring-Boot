package com.microservices.school.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.school.Model.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {

}
