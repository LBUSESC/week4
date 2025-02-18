package com.mapping.mapping_demo.services;

import com.mapping.mapping_demo.entities.Student;
import com.mapping.mapping_demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudentDetailsById(String studentId){
        Student studentDetails = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student doesn't exist with ID" +studentId));
        return studentDetails;
    }
}
