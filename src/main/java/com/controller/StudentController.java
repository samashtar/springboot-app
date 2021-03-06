package com.controller;

import com.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.*;

import java.awt.PageAttributes.MediaType;
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

    // Get Single Student /id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    // Delete /id
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentbyId(@PathVariable("id") int id) {
        studentService.removeStudentById(id);
    }

    // @RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
    // public void deleteStudentbyId(@RequestBody Student student) {
    // studentService.updateStudent(student);
    // }

    //
    @RequestMapping(method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);

    }
}