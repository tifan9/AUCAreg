package service;

import com.auca.aucareg.model.Semester;

import java.rmi.RemoteException;
import java.util.List;

public interface SemesterService {
    Semester saveSemester(Semester semester)throws RemoteException;
    Semester updateSemester(Semester semester)throws RemoteException;
    Semester selectSemester(int semesterId)throws RemoteException;
    List<Semester> getAllSemesters()throws RemoteException;
    boolean deleteSemester(int id)throws RemoteException;

}
