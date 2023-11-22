package service;

import com.auca.aucareg.model.Course;

import java.rmi.RemoteException;
import java.util.List;

public interface CourseService {
    Course saveCourse(Course course) throws Exception;
    Course updateCourse(Course course) throws Exception;
    Course selectCourse(Course courseId) throws Exception;
    List<Course> getAllCourse(String id) throws Exception;
    boolean deleteCourse(int id) throws RemoteException;
    Course updateAcademicUnit(Course course)throws RemoteException;
    List<Course> getCourseByDepAndSemester(int acaid, int semid);
    List<Course> getCoursePerStudent(int studentId);
}
