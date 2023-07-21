package com.practica.demo.service;

import com.practica.demo.entity.GetOrdersDTO;
import com.practica.demo.entity.Order;
import com.practica.demo.entity.OrderDTO;
import com.practica.demo.entity.TicketCategory;
import com.practica.demo.repository.OrderRepository;
import com.practica.demo.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
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

    public GetOrdersDTO addOrder(OrderDTO dto) {

        Optional<TicketCategory> category = ticketCategoryRepository.findById(dto.getTicketCategoryID());
        Long suma = dto.getNumberOfTickets() * category.get().getPrice();

        GetOrdersDTO newOrder = new GetOrdersDTO(dto.getEventID(), new Date(2023, 8, 3), dto.getTicketCategoryID(), dto.getNumberOfTickets(), suma );
        return newOrder;
    }

    public List<GetOrdersDTO> getOrderByCustomerID(int id) {
        List<Order> orders = orderRepository.findAllByCustomer_UserID(id);
        List<GetOrdersDTO> result = new ArrayList<>();
        for(Order o : orders) {
            GetOrdersDTO dto = new GetOrdersDTO(o.getTicketCategoryID().getEventID().getEventID(), o.getOrderedAt(),
                    o.getTicketCategoryID().getTicketCategoryID(), o.getNumberOfTickets(), o.getTotalPrice());
            result.add(dto);
        }
        return result;
    }


}
