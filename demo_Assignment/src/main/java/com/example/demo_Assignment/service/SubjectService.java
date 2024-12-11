package com.example.demo_Assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo_Assignment.entity.Subject;
import com.example.demo_Assignment.repository.SubjectRepository;

@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
