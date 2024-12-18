package com.example.Student_Management.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*; 
import lombok.*; 
 
@Entity 
@Table(name = "students") 
@Data 
@AllArgsConstructor 
@NoArgsConstructor

public class Student {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id; 
 
    @Column(name = "first_name", nullable = false) 
    private String firstName; 
 
    @Column(name = "last_name", nullable = false) 
    private String lastName; 
 
    @Column(name = "email", nullable = false, unique = true) 
    private String email; 
 
    @Column(name = "department", nullable = false) 
    private String department; 
 
    @Column(name = "year_of_enrollment") 
    private int yearOfEnrollment; 
}
