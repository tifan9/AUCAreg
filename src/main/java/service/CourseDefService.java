package service;

import com.auca.aucareg.model.CourseDef;

import java.rmi.RemoteException;
import java.util.List;

public interface CourseDefService {
    CourseDef saveCourseDef(CourseDef CourseDef) throws RemoteException;
    CourseDef updateCourseDef(int courseId, String name,String Description) throws RemoteException;

    CourseDef selectCourseDef(int id) throws RemoteException;

    List<CourseDef> selectAllCourseDefs()throws RemoteException;

    boolean deleteCourseDef(int id) throws RemoteException;

}
