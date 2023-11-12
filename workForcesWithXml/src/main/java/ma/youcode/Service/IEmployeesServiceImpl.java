package ma.youcode.Service;

import ma.youcode.dao.IDepartementsDao;
import ma.youcode.dao.IEmployeesDao;
import ma.youcode.entities.Departements;
import ma.youcode.entities.Employees;

import java.util.List;

public class IEmployeesServiceImpl implements IEmployeesService {
    private IEmployeesDao employeesDao;
    private IDepartementsDao departementsDao;

    public IEmployeesServiceImpl(IEmployeesDao employeesDao, IDepartementsDao departementsDao) {
        this.employeesDao = employeesDao;
        this.departementsDao = departementsDao;
    }


    @Override
    public Employees ajouterEmployee(Employees employees, Departements departement) {
        Departements departements = departementsDao.findByName(departement.getName())
                .orElse(null);
        if (departements == null){
            departements = departementsDao.save(departement);
        }
        employees.setDepartements(departements);
        return employeesDao.save(employees);
    }

    @Override
    public Employees modifierEmployee(Employees employees,Long departement_id) {
        Departements departements = departementsDao.findById(departement_id)
                .orElse(null);
        Employees employees1 =employeesDao.findById(employees.getId())
                .orElse(null);
        if (departements != null){
            if (employees1 !=null){
                employees.setDepartements(departements);
                return employeesDao.save(employees);
            }
            throw new RuntimeException("employe does not exsit");
        }
        throw new RuntimeException("department does not exist");
    }

    @Override
    public void supprimerEmployee(Long id) {
        employeesDao.findById(id).ifPresent(
                employees -> employeesDao.delete(employees));
    }

    @Override
    public List<Employees> afficherEmployees() {
        return employeesDao.findAll();
    }
}
