package ma.youcode.service;

import ma.youcode.repository.IEmployeDao;
import ma.youcode.entities.Employes;

import java.util.List;
import java.util.Optional;

public class EmployerMetierImpl implements IEmployerMetier {
    private IEmployeDao iEmployeDao;

    public EmployerMetierImpl(IEmployeDao iEmployeDao) {

        this.iEmployeDao = iEmployeDao;
    }

    @Override
    public Employes saveEmploye(Employes employes) {

        return iEmployeDao.save(employes);
    }

    @Override
    public Employes updateEmploye(Employes employes) {

        return null;
    }

    @Override
    public List<Employes> findAllEmploye() {

        return iEmployeDao.findAll();
    }

    @Override
    public Optional<Employes> findByIdEmploye(Long id) {

        return iEmployeDao.findById(id);
    }

    @Override
    public void deleteEmploye(Employes employes) {

        iEmployeDao.delete(employes);
    }
    void validateData(Employes employes){

    }
}
