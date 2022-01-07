package com.test;

import com.test.model.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Player.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();


        try {

            // create player object
            Player player = new Player("amir","karimi");

            // start transaction
            session.beginTransaction();

            // save the player object
            session.save(player);

            // commit the transaction
            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
