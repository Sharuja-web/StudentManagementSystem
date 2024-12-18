package com.example.Student_Management.repository;

import com.example.Student_Management.model.Student; 
import org.springframework.data.jpa.repository.JpaRepository; 
public interface StudentRepository extends JpaRepository<Student,Long> 
{
         // JPA provides basic CRUD operations here 
}
