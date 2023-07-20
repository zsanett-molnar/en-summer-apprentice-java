package com.practica.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.sql.Date;

@Entity(name = "orders")
@Table(name = "orders", schema = "practica")
public class Order {

    @Id
    @Column(name="orderID", nullable = false, updatable = false)
    private Integer orderID;

    @Column(name="userID")
    private Integer userID;

    @Column(name="ticketCategoryID")
    private Integer ticketCategoryID;

    @Column(name="orderedAt")
    private Date orderedAt;

    @Column(name="numberOfTickets")
    private Integer numberOfTickets;

    @Column(name="totalPrice")
    private BigDecimal totalPrice;

    public Order(Integer orderID, Integer userID, Integer ticketCategoryID, Date orderedAt, Integer numberOfTickets, BigDecimal totalPrice) {
        this.orderID = orderID;
        this.userID = userID;
        this.ticketCategoryID = ticketCategoryID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Order() {

    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Integer ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
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
