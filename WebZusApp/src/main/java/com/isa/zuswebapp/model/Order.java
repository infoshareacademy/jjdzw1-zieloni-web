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

    public Order(){}

    public Order(int idUser, String parts, String address, int idStatusu) {
        this.idUser = idUser;
        this.parts = parts;
        this.address = address;
        this.idStatusu = idStatusu;
    }

    public int getId() {
        return id;
    }


    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdStatusu() {
        return idStatusu;
    }

    public void setIdStatusu(int idStatusu) {
        this.idStatusu = idStatusu;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", parts='" + parts + '\'' +
                ", address='" + address + '\'' +
                ", idStatusu=" + idStatusu +
                '}';
    }
}
