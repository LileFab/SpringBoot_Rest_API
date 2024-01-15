package rendu.artifact.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Equipe {
    @Id
    @GeneratedValue

    private Long id;
    private String nom;
    private String ville;

    public Equipe(){}

    public Equipe(String nom, String ville) {
        this.nom = nom;
        this.ville = ville;
    }

    public Long getId() {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille (String ville) {
        this.ville = ville;
    }

}
