package com.auca.aucareg.service;

import com.auca.aucareg.model.Teacher;

import java.rmi.RemoteException;
import java.util.List;

public interface TeacherService {
    Teacher insertTeacher(Teacher teacher)throws RemoteException;

    Teacher selectTeacher(int teacherId)throws RemoteException;

    List<Teacher> selectAllTeachers()throws RemoteException;

    boolean deleteTeacher(int id)throws RemoteException;

    Teacher updateTeacher(Teacher teacher)throws RemoteException;
}
