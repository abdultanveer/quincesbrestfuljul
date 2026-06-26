package com.example.quince.demo.services;

import com.example.quince.demo.StudentRepository;
import com.example.quince.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;

    // CREATE
    public Student createStudent(Student student) {
        return repository.save(student);
    }

    // READ ALL
    public List<Student> getAllStudentz() {
        return repository.findAll();
    }

    // READ ONE
    public Student getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    // UPDATE
    public Student updateStudent(Long id, Student student) {

        Student existing = getStudentById(id);

        existing.setFirstName(student.getFirstName());
        existing.setLastName(student.getLastName());


        return repository.save(existing);
    }

    // DELETE
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}


