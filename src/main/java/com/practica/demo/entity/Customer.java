package com.practica.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;


import java.math.BigDecimal;

@Entity(name = "customer")
@Table(name="customer", schema = "practica")
public class Customer {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID", nullable=true, updatable = false)
    private Integer userID;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    public Customer(Integer userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        System.out.println("Creating customer");
    }

    public Customer() {

    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
