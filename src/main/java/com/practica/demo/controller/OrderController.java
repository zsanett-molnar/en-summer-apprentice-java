package com.practica.demo.controller;

import com.practica.demo.entity.Customer;
import com.practica.demo.entity.Order;
import com.practica.demo.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order/addOrder")
    public Order insertOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @GetMapping("/order/{orderID}")
    public Optional<Order> getOrder(@PathVariable int orderID) {
        return orderService.getOrder(orderID);
    }

    @GetMapping("/order/orders")
    public List<Order> getCustomer() {
        return orderService.getOrders();
    }
}
