package com.tp1.StudentManagement.repository;

import com.tp1.StudentManagement.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}