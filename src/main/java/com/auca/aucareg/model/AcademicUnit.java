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
public class AcademicUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String name;
    @Enumerated(EnumType.STRING)
    private UnityType unityType;
    @ManyToOne
    @JoinColumn(name = "parent_unit_id",referencedColumnName = "id",nullable = true)
    private AcademicUnit parentUnit;

    public enum UnityType {
        PROGRAMME,
        FACULTY,
        DEPARTMENT
    }
}
