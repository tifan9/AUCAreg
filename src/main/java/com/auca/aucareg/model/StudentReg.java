package com.auca.aucareg.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentReg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regid;
    private LocalDate regDate;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Student student;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="acadid")
    private AcademicUnit acadunit;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="semid")
    private Semester semester;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "student_course",joinColumns = @JoinColumn(name="id")
            ,inverseJoinColumns =@JoinColumn(name="courseid"))
    private List<Course> courses =new ArrayList<>();


}
