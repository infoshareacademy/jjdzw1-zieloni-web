package com.isa.zuswebapp.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "orders")
@NamedQueries({
        @NamedQuery(name = "Order.getOrders", query = "select  parts from orders")
})
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String parts;

    @NotNull
    private String address;

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

    public short getOrders() {
        return stock;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "id=" + id +
                ", czesci='" + parts + '\'' +
                ", adresDostawy='" + address + '\'' +
                '}';
    }
}
