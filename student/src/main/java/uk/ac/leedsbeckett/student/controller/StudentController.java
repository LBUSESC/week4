package uk.ac.leedsbeckett.student.controller;

import lombok.Getter;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uk.ac.leedsbeckett.student.model.Student;
import uk.ac.leedsbeckett.student.service.StudentService;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/student")

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentJson(@PathVariable Long id) {
        Student student = studentService.getStudentByIdJson(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }


    // HATEOAS Implementation
//    @GetMapping("/{id}")
//    public EntityModel<Student> getStudentJson(@PathVariable Long id) {
//        Student student = studentService.getStudentByIdJson(id);
//        return EntityModel.of(student,linkTo(methodOn(StudentController.class)
//                .getStudentJson(id)).withSelfRel());
//    }

}

