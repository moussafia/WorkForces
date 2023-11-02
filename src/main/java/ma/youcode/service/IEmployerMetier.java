package ma.youcode.service;

import ma.youcode.entities.Employes;

import java.util.List;
import java.util.Optional;

public interface IEmployerMetier{
    Employes saveEmploye(Employes employes);
    Employes updateEmploye(Employes employes);
    List<Employes> findAllEmploye();
    Optional<Employes> findByIdEmploye(Long id);
    void deleteEmploye(Employes employes);
}
