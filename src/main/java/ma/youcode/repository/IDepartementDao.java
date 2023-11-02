package ma.youcode.repository;

import ma.youcode.entities.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartementDao extends JpaRepository<Departments, Long> {
}
