package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entite.Livre;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emFact = Persistence.createEntityManagerFactory("persitUnit");
        EntityManager em = emFact.createEntityManager();

        Livre liv = em.find(Livre.class,5);
        System.out.println(liv);

        em.close();
        emFact.close();

    }
}