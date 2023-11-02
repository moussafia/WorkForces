package ma.youcode.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;

    @OneToMany
    private List<Employes> employes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Employes> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employes> employes) {
        this.employes = employes;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "nom='" + nom + '\'' +
                ", employes=" + employes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departments that = (Departments) o;
        return Objects.equals(nom, that.nom) && Objects.equals(employes, that.employes);
    }

}
