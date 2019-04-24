package com.controller;

import com.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
// routes starting with /students
public class StudentController {

    @Autowired
    private StudentService studentService;

    // '/' route after /students
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}