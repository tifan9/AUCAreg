package service;

import com.auca.aucareg.model.AcademicUnit;
import org.w3c.dom.stylesheets.LinkStyle;

import java.rmi.RemoteException;
import java.util.List;

public interface AcademicService {
    AcademicUnit saveAcademicUnit(AcademicUnit academicUnit) throws RemoteException;
    AcademicUnit updateAcademicUnit(int id,String name) throws RemoteException;
    AcademicUnit selectAcademicUnit(int academicUnitId)throws RemoteException;
    List<AcademicUnit> getAllAcademicUnits() throws RemoteException;
    boolean deleteAcademicUnit(int id) throws RemoteException;
}
