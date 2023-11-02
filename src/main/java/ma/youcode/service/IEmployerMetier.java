package ma.youcode.service;

import ma.youcode.entities.Employes;

import java.util.List;

public interface IEmployerMetier{
    Employes saveEmploye(Employes employes);
    Employes updateEmploye(Employes employes);
    List<Employes> findAllEmploye();
    Employes findByIdEmploye(Long id);
    void deleteEmploye(Employes employes);
}
