package ma.youcode.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employees implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Float salaire;

    @ManyToOne
    private Departements departements;

    public Employees(String name, Float salaire) {
        this.name = name;
        this.salaire = salaire;
    }

    public Employees() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalaire() {
        return salaire;
    }

    public void setSalaire(Float salaire) {
        this.salaire = salaire;
    }

    public Departements getDepartements() {
        return departements;
    }

    public void setDepartements(Departements departements) {
        this.departements = departements;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
