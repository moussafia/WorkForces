package ma.youcode.Service;

import ma.youcode.entities.Departements;
import ma.youcode.entities.Employees;

import java.util.List;
import java.util.Optional;

public interface IEmployeesService {
    Employees ajouterEmployee(Employees employees, Departements departement);

    Employees modifierEmployee(Employees employees, Long departement_id);
    void supprimerEmployee(Long id);
    List<Employees> afficherEmployees();
}
