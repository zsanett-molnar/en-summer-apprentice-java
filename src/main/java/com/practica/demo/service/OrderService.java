package com.practica.demo.service;

import com.practica.demo.entity.Order;
import com.practica.demo.entity.OrderDTO;
import com.practica.demo.entity.TicketCategory;
import com.practica.demo.repository.OrderRepository;
import com.practica.demo.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Optional<Order> getOrder(int id) {
        return orderRepository.findById(id);
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order addOrder(OrderDTO dto) {

        Optional<TicketCategory> category = ticketCategoryRepository.findById(dto.getTicketCategoryID());
        Long suma = dto.getNumberOfTickets() * category.get().getPrice();

        Order order = new Order(12,null, category.get(), new Date(2023, 8, 3), dto.getNumberOfTickets(), suma);

        return order;
    }

    public List<Order> getOrderByCustomerID(int id) {
        return orderRepository.findAllByCustomer_UserID(id);
    }
}
