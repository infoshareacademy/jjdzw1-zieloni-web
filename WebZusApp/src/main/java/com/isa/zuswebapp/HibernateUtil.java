package com.isa.zuswebapp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    //private static final SessionFactory sessionFactory = buildSessionFactory();

/*    private static SessionFactory buildSessionFactory() {
        try {
            // Domyślnie weźmie hibernate.cfg.xml
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }*/

 /*   public static void shutdown() {
        // Czyści cache i connection poole
        getSessionFactory().close();
    }

  //  public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }*/

}
