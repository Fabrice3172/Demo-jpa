package org.example.entite;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name = "NOM")
    private String nom;

    @Column(name = "PRENOM")
    private String prenom;


    @OneToMany(mappedBy = "client")
    private Set<Emprunt> emprunts;


    public Client() {
        emprunts = new HashSet<Emprunt>();

    }


    public Client(int id, String nom, String prenom, Set<Emprunt> emprunts) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.emprunts = emprunts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
