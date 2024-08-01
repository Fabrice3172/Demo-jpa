package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entite.Client;
import org.example.entite.Emprunt;
import org.example.entite.Livre;

import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emFact = Persistence.createEntityManagerFactory("persitUnit");
        EntityManager em = emFact.createEntityManager();

       // Livre liv = em.find(Livre.class,5);  //TP1
       // System.out.println(liv);

        //Client cli = em.find(Client.class,2);   //TP2
        //System.out.println(cli.getEmprunts());

        //Emprunt emp = em.find(Emprunt.class,2);    //TP3 -1
        //if (null != emp) System.out.println(emp.getLivres());

        Client cli = em.find(Client.class,2);   //TP3 -2
        if (null != cli) System.out.println(cli.getEmprunts());


        em.close();
        emFact.close();

    }
}