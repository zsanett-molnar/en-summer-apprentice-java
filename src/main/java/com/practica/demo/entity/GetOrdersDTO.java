package com.practica.demo.entity;

import java.sql.Date;

public class GetOrdersDTO {

    private Integer eventID;
    private Date timeStamp;
    private Integer ticketCategoryID;
    private Integer numberOfTickets;
    private Long totalPrice;

    public GetOrdersDTO(Integer eventID, Date timeStamp, Integer ticketCategoryID, Integer numberOfTickets, Long totalPrice) {
        this.eventID = eventID;
        this.timeStamp = timeStamp;
        this.ticketCategoryID = ticketCategoryID;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Integer ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
