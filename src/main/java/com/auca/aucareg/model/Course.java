package com.auca.aucareg.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseid;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private CourseDef coursedef;
    @OneToMany(mappedBy = "courses")
    private List<Teacher> teacher;
    @ManyToOne
    @JoinColumn(name="semid")
    private Semester sems;
    @ManyToOne
    @JoinColumn(name="acaid")
    private AcademicUnit academic;
    @ManyToMany(mappedBy = "courses")
    private List<StudentReg> students=new ArrayList<>();

}
