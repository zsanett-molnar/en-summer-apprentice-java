package com.practica.demo.entity;

public class Venue {

    private Integer venueID;
    private String location;

    private String type;
    private Integer capacity;

    public Venue(Integer venueID, String location, String type, Integer capacity) {
        this.venueID = venueID;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
        System.out.println("Creating venue");
    }

    public Integer getVenueID() {
        return venueID;
    }

    public void setVenueID(Integer venueID) {
        this.venueID = venueID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueID=" + venueID +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
