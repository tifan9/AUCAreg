package com.auca.aucareg.repository;

import com.auca.aucareg.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
