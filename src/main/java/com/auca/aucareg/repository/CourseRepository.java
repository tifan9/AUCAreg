package com.auca.aucareg.repository;

import com.auca.aucareg.model.Course;
import com.auca.aucareg.model.CourseDef;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
