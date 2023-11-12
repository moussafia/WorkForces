package ma.youcode.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Departements implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "departements", fetch = FetchType.LAZY)
    private List<Employees> employees = new ArrayList<>();

    public Departements(String name) {
        this.name = name;
    }

    public Departements() {
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

    @Override
    public String toString() {
        return "Departements{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
