package com.mapping.mapping_demo;

import com.mapping.mapping_demo.entities.Address;
import com.mapping.mapping_demo.entities.Student;
import com.mapping.mapping_demo.repositories.AddressRepository;
import com.mapping.mapping_demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MappingDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MappingDemoApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private AddressRepository addressRepository;



	@Override
	public void run(String... args) throws Exception {

	Address address = new Address();
	address.setHouseNumber("LE101");
	address.setStreet("Leeds Beckett");
	address.setCity("Leeds");
	address.setPostalCode("LS1 2EZ");

	Student student = new Student();
	student.setStudentId("c111");
	student.setStudentName("Satish Kumar");
	student.setStudentCourse("MSc ACS");
	student.setAddress(address);

	studentRepository.save(student);
	}
}
