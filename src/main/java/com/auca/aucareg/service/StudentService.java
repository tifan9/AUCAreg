package com.auca.aucareg.service;

import com.auca.aucareg.model.Student;

import java.rmi.RemoteException;
import java.util.List;

public interface StudentService {
    Student insertStudent(Student student)throws RemoteException;

    Student selectStudent(int studentId)throws RemoteException;

    List<Student> selectAllStudents()throws RemoteException;
    boolean deleteStudent(int id)throws RemoteException;

    Student updateStudent(Student student)throws RemoteException;
}
