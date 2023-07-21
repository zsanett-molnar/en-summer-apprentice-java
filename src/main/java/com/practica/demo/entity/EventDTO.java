package com.practica.demo.entity;

import java.sql.Date;
import java.util.List;

public class EventDTO {
    private Integer eventID;
    private Venue venue;
    private String eventTypeName;
    private String eventDescription;
    private String eventName;
    private Date startDate;
    private Date endDate;
    private List<TicketCategoryDTO> ticketCategories;

    public EventDTO(Integer eventID, Venue venue, String eventTypeName, String eventDescription, String eventName, Date startDate, Date endDate, List<TicketCategoryDTO> ticketCategories) {
        this.eventID = eventID;
        this.venue = venue;
        this.eventTypeName = eventTypeName;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.ticketCategories = ticketCategories;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<TicketCategoryDTO> getTicketCategories() {
        return ticketCategories;
    }

    public void setTicketCategories(List<TicketCategoryDTO> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }
}
