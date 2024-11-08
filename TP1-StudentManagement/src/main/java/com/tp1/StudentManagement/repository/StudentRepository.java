package com.tp1.StudentManagement.repository;

import com.tp1.StudentManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
