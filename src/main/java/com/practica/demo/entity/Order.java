package com.practica.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;


@Entity(name = "orders")
@Table(name = "orders", schema = "practica")
public class Order {

    @Id
    @Column(name="orderID", nullable = false, updatable = false)
    private Integer orderID;

    @ManyToOne
    @JoinColumn(name="userID")
    private Customer customer;

//    @Column(name="ticketCategoryID")
//    private Integer ticketCategoryID;

    @ManyToOne
    @JoinColumn(name="ticketCategoryID")
    private TicketCategory ticketCategoryID;

    @Column(name="orderedAt")
    private Date orderedAt;

    @Column(name="numberOfTickets")
    private Integer numberOfTickets;

    @Column(name="totalPrice")
    private BigDecimal totalPrice;

    public Order() {

    }

    public TicketCategory getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(TicketCategory ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
