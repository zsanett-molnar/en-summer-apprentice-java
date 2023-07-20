package com.practica.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity(name="ticket_category")
@Table(name="ticket_category", schema="practica")
public class TicketCategory {

    @Id
    @Column(name="ticketCategoryID", nullable = false, updatable = false)
    private Integer ticketCategoryID;

    @Column(name="eventID")
    private Integer eventID;

    @Column(name="description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    public TicketCategory() {

    }

    public Integer getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Integer ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketCategory{" +
                "ticketCategoryID=" + ticketCategoryID +
                ", eventID=" + eventID +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
