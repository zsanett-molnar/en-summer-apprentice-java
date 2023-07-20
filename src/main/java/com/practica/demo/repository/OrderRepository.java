package com.practica.demo.repository;

import com.practica.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    public List<Order> findAllByCustomer_UserID(int id);

}
