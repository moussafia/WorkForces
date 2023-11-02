package ma.youcode.service;

import ma.youcode.repository.IDepartementDao;
import ma.youcode.entities.Departments;

import java.util.List;

public class DepartementMetierImpl implements IDepartementMetier {
    private IDepartementDao iDepartementDao;

    public DepartementMetierImpl(IDepartementDao iDepartementDao) {
        this.iDepartementDao = iDepartementDao;
    }

    @Override
    public Departments saveDepartement(Departments departments) {

        return null;
    }

    @Override
    public Departments updateDepartement(Departments departments) {
        return null;
    }

    @Override
    public List<Departments> findAllDepartement() {
        return null;
    }

    @Override
    public Departments findByIdDepartement(Long id) {
        return null;
    }

    @Override
    public void deleteDepartement(Departments departments) {

    }
    void validateData(Departments departments){

    }
}
