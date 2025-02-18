package uk.ac.leedsbeckett.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.ac.leedsbeckett.student.model.Course;
import uk.ac.leedsbeckett.student.model.Student;
import uk.ac.leedsbeckett.student.model.StudentRepository;

import java.util.Set;

@Configuration
public class MiscellaneousBeans {

    @Bean
    CommandLineRunner initDatabase( StudentRepository studentRepository) {
        return args -> {



            Course course1 = new Course();
            course1.setTitle("SESC");
            course1.setDescription("Software Engineering for Service Computing");
            course1.setFee(10.00);

            Course course2 = new Course();
            course2.setTitle("ASE");
            course2.setDescription("Advanced Software Engineering Software Engineering");
            course2.setFee(10.00);

            Student myStudent = new Student();
            myStudent.setExternalStudentId("c101");
            myStudent.setForename("Satish");
            myStudent.setSurname("Kumar");


            Set<Course> courses = myStudent.getCourses();
            courses.add(course1);
            courses.add(course2);


            studentRepository.save(myStudent);


        };
    }
}
