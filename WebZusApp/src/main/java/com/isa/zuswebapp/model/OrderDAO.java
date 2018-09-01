package com.isa.zuswebapp.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Optional;

public class OrderDAO {
    private EntityManager entityManager =
            Persistence.createEntityManagerFactory("primary").createEntityManager();

    public Optional<Order> read(int id) {
        return Optional.ofNullable(entityManager.find(Order.class, id));
    }

}
