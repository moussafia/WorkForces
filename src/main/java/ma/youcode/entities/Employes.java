package ma.youcode.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Employes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom_employe;
    private Float salaire;

    @ManyToOne()
    private Departments departments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_employe() {
        return nom_employe;
    }

    public void setNom_employe(String nom_employe) {
        this.nom_employe = nom_employe;
    }

    public Float getSalaire() {
        return salaire;
    }

    public void setSalaire(Float salaire) {
        this.salaire = salaire;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employes{" +
                ", nom_employe='" + nom_employe + '\'' +
                ", salaire=" + salaire +
                ", departments=" + departments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employes employes = (Employes) o;
        return Objects.equals(nom_employe, employes.nom_employe) && Objects.equals(salaire, employes.salaire) && Objects.equals(departments, employes.departments);
    }
}
