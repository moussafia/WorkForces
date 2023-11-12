package ma.youcode.dao;

import ma.youcode.entities.Departements;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IDepartementsDao extends JpaRepository<Departements, Long> {
    Optional<Departements> findByName(String departement_name);
}
