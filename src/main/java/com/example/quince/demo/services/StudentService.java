package com.example.quince.demo.services;

import com.example.quince.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
   // @Autowired
    //StudentRepository studentRepository;

    List<Student> students = new ArrayList<>();

    public void createStudents() {

        students.add(new Student(1,"abdul","ansari"));
        students.add(new Student(2,"android","flutter"));
        students.add(new Student(3,"java","kotlin"));
        students.add(new Student(4,"quince ","blr"));
    }

    public List<Student> getStudents() {
        createStudents();
       // return studentRepository.findAll();
        return students;
    }

}