package ma.youcode.repository;

import ma.youcode.entities.Employes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeDao extends JpaRepository<Employes, Long> {
}
