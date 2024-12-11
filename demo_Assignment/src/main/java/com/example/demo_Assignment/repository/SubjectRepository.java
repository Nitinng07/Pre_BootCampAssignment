package com.example.demo_Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_Assignment.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long> {
    
}
