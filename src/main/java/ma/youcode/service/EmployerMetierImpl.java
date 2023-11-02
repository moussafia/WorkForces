package ma.youcode.service;

import ma.youcode.repository.IEmployeDao;
import ma.youcode.entities.Employes;

import java.util.List;

public class EmployerMetierImpl implements IEmployerMetier {
    private IEmployeDao iEmployeDao;

    public EmployerMetierImpl(IEmployeDao iEmployeDao) {
        this.iEmployeDao = iEmployeDao;
    }

    @Override
    public Employes saveEmploye(Employes employes) {
        return null;
    }

    @Override
    public Employes updateEmploye(Employes employes) {
        return null;
    }

    @Override
    public List<Employes> findAllEmploye() {
        return null;
    }

    @Override
    public Employes findByIdEmploye(Long id) {
        return null;
    }

    @Override
    public void deleteEmploye(Employes employes) {

    }
    void validateData(Employes employes){

    }
}
