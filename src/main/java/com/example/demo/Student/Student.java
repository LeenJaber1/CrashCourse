package com.example.demo.Student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    @Transient //it means that this attribute need not to be a column
    private Integer age;
    private LocalDate dateofbirth;
    private String email;

    public Student() {
    }

    public Student(Long id, String name, LocalDate dateofbirth, String email) {
        this.id = id;
        this.name = name;

        this.dateofbirth = dateofbirth;
        this.email = email;
    }

    public Student(String name,  LocalDate dateofbirth, String email) {
        this.name = name;

        this.dateofbirth = dateofbirth;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return Period.between(this.dateofbirth, LocalDate.now()).getYears();
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dateofbirth=" + dateofbirth +
                ", email='" + email + '\'' +
                '}';
    }
}

