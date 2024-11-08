package com.tp1.StudentManagement;

import com.tp1.StudentManagement.entity.Professor;
import com.tp1.StudentManagement.entity.Student;
import com.tp1.StudentManagement.repository.ProfessorRepository;
import com.tp1.StudentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagementApplication {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ProfessorRepository professorRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			// Create students
			Student student1 = new Student();
			student1.setName("John Doe");
			student1.setEmail("john.doe@example.com");

			Student student2 = new Student();
			student2.setName("Jane Smith");
			student2.setEmail("jane.smith@example.com");

			studentRepository.save(student1);
			studentRepository.save(student2);

			// Create professors
			Professor professor1 = new Professor();
			professor1.setName("Dr. Emily Brown");
			professor1.setSpeciality("Computer Science");

			Professor professor2 = new Professor();
			professor2.setName("Dr. Michael Green");
			professor2.setSpeciality("Mathematics");

			professorRepository.save(professor1);
			professorRepository.save(professor2);

			System.out.println("Sample data inserted into the database");
		};
	}
}
