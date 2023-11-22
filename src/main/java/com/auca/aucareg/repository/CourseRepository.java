package com.auca.aucareg.repository;

import com.auca.aucareg.model.Course;
import com.auca.aucareg.model.CourseDef;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findBySemsSemidAndAcademicId(int semesterId, int academicUnitId);

    List<Course> findByStudentsStudentId(int studentId);

    List<Course> findBySemsSemid(int semesterId);
}
