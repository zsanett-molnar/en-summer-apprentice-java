package com.practica.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.text.SimpleDateFormat;

@Entity(name="event")
@Table(name="event", schema="practica")
public class Event {
    @Id
    @Column(name="eventID", nullable = false, updatable = false)
    private Integer eventID;
    @Column(name="locationID")
    private Integer locationID;

    @Column(name="eventTypeID")
    private Integer eventTypeID;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;
    @Column(name="startDate")
    private Date startDate;

    @Column(name="endDate")
    private Date endDate;

    public Event(Integer eventID, Integer locationID, Integer eventTypeID, String name, String description, Date startDate, Date endDate) {
        this.eventID = eventID;
        this.locationID = locationID;
        this.eventTypeID = eventTypeID;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public Event() {

    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public Integer getLocationID() {
        return locationID;
    }

    public void setLocationID(Integer locationID) {
        this.locationID = locationID;
    }

    public Integer getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(Integer eventTypeID) {
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
