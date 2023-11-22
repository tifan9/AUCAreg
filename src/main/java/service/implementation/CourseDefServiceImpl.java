package service.implementation;

import com.auca.aucareg.model.CourseDef;
import com.auca.aucareg.repository.CourseDefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CourseDefService;

import java.rmi.RemoteException;
import java.util.List;

@Service
public class CourseDefServiceImpl implements CourseDefService {
   @Autowired
   private CourseDefRepository courseDefRepository;
    @Override
    public CourseDef saveCourseDef(CourseDef courseDef) throws RemoteException {
        return courseDefRepository.save(courseDef);
    }

    @Override
    public CourseDef updateCourseDef(int courseId, String name, String Description) throws RemoteException {
        CourseDef course= courseDefRepository.findById(courseId).orElse(null);
        if(course != null){
            course.setName(name);
            course.setDescriptions(Description);
            courseDefRepository.save(course);
        }
        return null;
    }

    @Override
    public CourseDef selectCourseDef(int id) throws RemoteException {
        CourseDef course= courseDefRepository.findById(id).orElse(null);
        if(course != null){
            return course;
        }
        return null;
    }

    @Override
    public List<CourseDef> selectAllCourseDefs() throws RemoteException {
        return courseDefRepository.findAll();
    }

    @Override
    public boolean deleteCourseDef(int id) throws RemoteException {
        CourseDef course= courseDefRepository.findById(id).orElse(null);
        if(course != null){
            courseDefRepository.delete(course);
        }
        return false;
    }
}
