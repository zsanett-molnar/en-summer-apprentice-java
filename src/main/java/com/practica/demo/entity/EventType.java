package com.practica.demo.entity;

public class EventType {
    private Integer eventTypeID;
    private String name;

    public EventType(Integer eventTypeID, String name) {
        this.eventTypeID = eventTypeID;
        this.name = name;
        System.out.println("Creating event type.");
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
