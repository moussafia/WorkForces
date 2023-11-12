package ma.youcode.dao;

import ma.youcode.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeesDao extends JpaRepository<Employees, Long> {
}
