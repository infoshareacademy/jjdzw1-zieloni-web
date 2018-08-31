package com.isa.zuswebapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int idUser;

    @Column(length = 8000, nullable = false)
    private String parts;

    @Column(length = 8000, nullable = false)
    private String address;


    @Column(nullable = false)
    private int idStatusu;
}
