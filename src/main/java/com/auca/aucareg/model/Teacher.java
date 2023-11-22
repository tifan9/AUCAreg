package com.auca.aucareg.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codes;
    private String names;
    @Enumerated(EnumType.STRING)
    private Qualification qualification;
    @Enumerated(EnumType.STRING)
    private Role role;
    @ManyToOne
    @JoinColumn(name = "courseid")
    private Course courses;

    public enum Qualification {
        Masters,
        PHD,
        PROFESSOR
    }
    public enum Role{
        Lecturer,
        Assistant
    }
}
