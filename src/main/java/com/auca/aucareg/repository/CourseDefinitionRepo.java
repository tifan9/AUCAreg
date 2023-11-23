package com.auca.aucareg.repository;

import com.auca.aucareg.model.CourseDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDefinitionRepo extends JpaRepository<CourseDefinition,Integer> {
}
