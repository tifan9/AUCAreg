package com.auca.aucareg.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String regNo;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String dob;
    private String password;
    @OneToMany(mappedBy="student")
    private List<StudentReg> students;
}
