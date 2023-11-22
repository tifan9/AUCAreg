package service;

import com.auca.aucareg.model.StudentReg;

import java.rmi.RemoteException;
import java.util.List;

public interface StudentRegService {
    StudentReg saveStudent(StudentReg student) throws RemoteException;
    StudentReg updateStudent(StudentReg student)throws RemoteException;
    StudentReg selectStudent(int studentId)throws RemoteException;
    List<StudentReg> getAllStudents()throws RemoteException;
    boolean deleteStudent(int id)throws RemoteException;
    List<StudentReg>studentsPerSem(int semid) throws RemoteException;
    List<StudentReg>studentsPerSemAndDep(int semid,int acid) throws RemoteException;
    List<StudentReg>studentsPerSemCourse(int semid, int courseid) throws RemoteException;
}
