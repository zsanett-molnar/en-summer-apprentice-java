package com.practica.demo.entity;

public class TicketCategoryDTO {

    private Integer ticketCategoryID;
    private String description;
    private Long price;

    public TicketCategoryDTO(Integer ticketCategoryID, String description, Long price) {
        this.ticketCategoryID = ticketCategoryID;
        this.description = description;
        this.price = price;
    }

    public Integer getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Integer ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
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
}
