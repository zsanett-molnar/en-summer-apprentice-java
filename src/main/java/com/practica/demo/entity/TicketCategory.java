package com.practica.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name="ticket_category")
@Table(name="ticket_category", schema="practica")
public class TicketCategory {

    @Id
    @Column(name="ticketCategoryID", nullable = false, updatable = false)
    private Integer ticketCategoryID;

    @ManyToOne
    @JoinColumn(name="eventID")
    private Event eventID;

    @Column(name="description")
    private String description;

    @Column(name = "price")
    private Long price;

    public TicketCategory() {

    }

    public Integer getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Integer ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Event getEventID() {
        return eventID;
    }

    public void setEventID(Event eventID) {
        this.eventID = eventID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
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
