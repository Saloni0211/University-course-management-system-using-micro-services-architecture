package com.example.university.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private String code;
    private String name;
    private String instructor;

    // Getters and Setters
}

