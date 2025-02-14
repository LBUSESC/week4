package uk.ac.leedsbeckett.student.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
