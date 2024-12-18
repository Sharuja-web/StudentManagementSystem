package com.example.Student_Management.service;

import java.util.List;

import com.example.Student_Management.model.Student;

public interface StudentService {
     Student saveStudent(Student student); 
    List<Student> getAllStudents(); 
    Student getStudentById(long id); 
    Student updateStudent(Student student, long id); 
    void deleteStudent(long id); 

}
