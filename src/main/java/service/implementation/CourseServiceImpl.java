package service.implementation;

import com.auca.aucareg.model.Course;
import com.auca.aucareg.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CourseService;

import java.rmi.RemoteException;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course saveCourse(Course course) throws Exception {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) throws Exception {
        return null;
    }

    @Override
    public Course selectCourse(Course courseId) throws Exception {
        Course course=courseRepository.findById(id).orElse(null);
        if(course!=null){
            return  course;
        }
        return null;
    }

    @Override
    public List<Course> getAllCourse(String id) throws Exception {
        return courseRepository.findAll();
    }

    @Override
    public boolean deleteCourse(int id) throws RemoteException {
        Course course=courseRepository.findById(id).orElse(null);
        if(course!=null) {
            courseRepository.delete(course);
            return true;
        }
        return false;
    }

    @Override
    public Course updateAcademicUnit(Course course) throws RemoteException {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getCourseByDepAndSemester(int acaid, int semid) {
        return null;
    }

    @Override
    public List<Course> getCoursePerStudent(int studentId) {
        return null;
    }
}
