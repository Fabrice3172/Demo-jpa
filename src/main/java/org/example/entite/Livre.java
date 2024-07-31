package org.example.entite;

import jakarta.persistence.*;

@Entity
@Table(name="LIVRE")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Livre() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                '}';
    }
}
