package service.implementation;

import com.auca.aucareg.model.AcademicUnit;
import com.auca.aucareg.repository.AcademicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AcademicService;

import java.rmi.RemoteException;
import java.util.List;
@Service
public class AcademicServiceImpl implements AcademicService {
    @Autowired
    private AcademicRepository academicRepository;
    @Override
    public AcademicUnit saveAcademicUnit(AcademicUnit academicUnit) throws RemoteException {
        return academicRepository.save(academicUnit);
    }

    @Override
    public AcademicUnit updateAcademicUnit(int id, String name) throws RemoteException {
        AcademicUnit academic = academicRepository.findById(id).orElse(null);
        if(academic != null){
            academic.setName(name);
            return academicRepository.save(academic);
        }
        else{
            return null;
        }
    }
    @Override
    public AcademicUnit selectAcademicUnit(int academicUnitId) throws RemoteException {
        AcademicUnit academics=academicRepository.findById(academicUnitId).orElse(null);
        if(academics !=null){
            return  academics;
        }
        else{
            return null;
        }
    }

    @Override
    public List<AcademicUnit> getAllAcademicUnits() throws RemoteException {
        return academicRepository.findAll();
    }

    @Override
    public boolean deleteAcademicUnit(int id) throws RemoteException {
        AcademicUnit academic=academicRepository.findById(id).orElse(null);
        if(academic !=null){
            academicRepository.delete(academic);
            return true;
        }
        return false;
    }
}
