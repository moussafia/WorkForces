package ma.youcode.service;

import ma.youcode.entities.Departments;

import java.util.List;
import java.util.Optional;

public interface IDepartementMetier {
    Departments saveDepartement(Departments departments);
    Departments updateDepartement(Departments departments);
    List<Departments> findAllDepartement();
    Optional<Departments> findByIdDepartement(Long id);
    void deleteDepartement(Departments departments);
}
