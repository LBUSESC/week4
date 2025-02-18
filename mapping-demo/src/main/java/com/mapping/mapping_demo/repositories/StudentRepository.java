package com.mapping.mapping_demo.repositories;

import com.mapping.mapping_demo.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {
}
