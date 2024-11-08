package com.tp1.StudentManagement.controller;

import com.tp1.StudentManagement.entity.Professor;
import com.tp1.StudentManagement.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/professors")
    public String displayProfessors(Model model) {
        List<Professor> professors = professorRepository.findAll();
        model.addAttribute("professors", professors);
        return "professors";
    }
}