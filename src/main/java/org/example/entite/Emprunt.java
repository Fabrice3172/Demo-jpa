package org.example.entite;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="EMPRUNT")
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="DATE_DEBUT")
    private Date dateDebut;

    @Column(name="DATE_FIN")
    private Date dateFin;

    @Column(name="DELAI")
    private int delai;


    @ManyToOne
    @JoinColumn(name="ID_CLIENT")
    private Client client;

    @ManyToMany
    @JoinTable(name="COMPO",

            joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID")
    )
    private Set<Livre> livres;

    public Emprunt() {
        livres = new HashSet<Livre>();
    }


    public Emprunt(int id, Date dateDebut, Date dateFin, int delai, Client client) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.delai = delai;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", delai=" + delai +
                ", client=" + client +
                ", livres=" + livres +
                '}';
    }
}
