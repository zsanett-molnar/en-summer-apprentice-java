package com.practica.demo.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity(name="event")
@Table(name="event", schema="practica")
public class Event {
    @Id
    @Column(name="eventID", nullable = false, updatable = false)
    private Integer eventID;
    @ManyToOne
    @JoinColumn(name="locationID")
    private Venue locationID;

    @ManyToOne
    @JoinColumn(name="eventTypeID")
    private EventType eventTypeID;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;
    @Column(name="startDate")
    private Date startDate;

    @Column(name="endDate")
    private Date endDate;


    public Event() {

    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public Venue getLocationID() {
        return locationID;
    }

    public void setLocationID(Venue locationID) {
        this.locationID = locationID;
    }

    public EventType getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(EventType eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", locationID=" + locationID +
                ", eventTypeID=" + eventTypeID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
