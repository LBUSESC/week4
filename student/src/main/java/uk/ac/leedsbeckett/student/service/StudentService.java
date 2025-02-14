package uk.ac.leedsbeckett.student.service;

import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import uk.ac.leedsbeckett.student.controller.StudentController;
import uk.ac.leedsbeckett.student.model.Course;
import uk.ac.leedsbeckett.student.model.CourseRepository;
import uk.ac.leedsbeckett.student.model.Student;
import uk.ac.leedsbeckett.student.model.StudentRepository;

import java.util.Set;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    public Student getStudentByIdJson(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Course with id " + id + " not found"));
        return student;
    }





}
