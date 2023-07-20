package com.practica.demo.controller;

import com.practica.demo.entity.Venue;
import com.practica.demo.service.VenueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VenueController {

    private VenueService venueService;

    public VenueController(VenueService venueService) {
        this.venueService = venueService;
        System.out.println("Creating venue controller");
    }

    @GetMapping("/venue/{venueID}")
    public String getVenue(@PathVariable int venueID) {
        return venueService.getVenue(venueID);
    }

    @GetMapping("/venue/venues")
    public List<Venue> getVenues() {
        return venueService.getVenues();
    }
}
