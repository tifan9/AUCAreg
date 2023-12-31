package com.auca.aucareg.service;

import com.auca.aucareg.model.StudentRegistration;

import java.rmi.RemoteException;
import java.util.List;

public interface StudentRegService {
    StudentRegistration insertStudent(StudentRegistration student) throws RemoteException;

    StudentRegistration selectStudent(int studentId)throws RemoteException;

    List<StudentRegistration> selectAllStudents()throws RemoteException;

    boolean deleteStudent(int id)throws RemoteException;

    StudentRegistration updateStudent(StudentRegistration student)throws RemoteException;
    List<StudentRegistration>studentsPerSem(int semid) throws RemoteException;
    List<StudentRegistration>studentsPerSemAndDep(int semid,int acid) throws RemoteException;
    List<StudentRegistration>studentsPerSemCourse(int semid, int courseid) throws RemoteException;
}
