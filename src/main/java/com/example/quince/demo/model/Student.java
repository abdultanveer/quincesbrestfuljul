package com.example.quince.demo.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

@Entity
@Table(name="students")         //create table students(id int)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

   // @Column(name = "studentnae")
    String firstName;
    String lastName;

    public Student(int id ,String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
