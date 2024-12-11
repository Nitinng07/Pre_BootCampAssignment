package com.example.demo_Assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo_Assignment.entity.Student;
import com.example.demo_Assignment.repository.StudentRepository;

@Service
public class StudentService {
    private StudentRepository studentRepository ;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository ;
    }
    
    public Student saveStudent(Student student){
        return studentRepository.save(student) ;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll() ;
    }
}
