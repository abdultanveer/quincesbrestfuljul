package com.example.quince.demo.controllers;


import com.example.quince.demo.model.Student;
import com.example.quince.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentController {
    @Autowired
    StudentService studentService;  //di will instantiate it for me

    @RequestMapping("/students")
    public List<Student> getStudents() {

        return studentService.getStudents();
    }

    @RequestMapping(method = RequestMethod.POST, value ="students")
    public void addStudent(@RequestBody Student student) {
        System.out.println("controllers add student");
       //studentService.addStudent(student);
    }



}