package com.practica.demo.entity;

import jakarta.persistence.*;

@Entity(name="event_type")
@Table(name="event_type", schema="practica")
public class EventType {
    @Id
    @Column(name="eventTypeID", nullable = false, updatable = false)
    private Integer eventTypeID;
    @Column(name="name")
    private String name;


    public EventType(Integer eventTypeID, String name) {
        this.eventTypeID = eventTypeID;
        this.name = name;
        System.out.println("Creating event type.");
    }

    public EventType() {

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

    @Override
    public String toString() {
        return "EventType{" +
                "eventTypeID=" + eventTypeID +
                ", name='" + name + '\'' +
                '}';
    }
}
