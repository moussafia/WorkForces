package ma.youcode.service;

import ma.youcode.repository.IDepartementDao;
import ma.youcode.entities.Departments;

import java.util.List;
import java.util.Optional;

public class DepartementMetierImpl implements IDepartementMetier {
    private IDepartementDao iDepartementDao;

    public DepartementMetierImpl(IDepartementDao iDepartementDao) {

        this.iDepartementDao = iDepartementDao;
    }

    @Override
    public Departments saveDepartement(Departments departments) {

        return iDepartementDao.save(departments);
    }

    @Override
    public Departments updateDepartement(Departments departments) {

        return null;
    }

    @Override
    public List<Departments> findAllDepartement() {

        return iDepartementDao.findAll();
    }

    @Override
    public Optional<Departments> findByIdDepartement(Long id) {

        return iDepartementDao.findById(id);
    }

    @Override
    public void deleteDepartement(Departments departments) {
            iDepartementDao.delete(departments);
    }
    void validateData(Departments departments){

    }
}
