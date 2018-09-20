package com.isa.zuswebapp.model;

import javax.ejb.Local;
import com.isa.zuswebapp.domain.Order;

import java.util.List;

public interface OrderDao {

    @Local
    public interface UsersRepositoryDao {

        List<Order> getOrdersList();
    }
}
