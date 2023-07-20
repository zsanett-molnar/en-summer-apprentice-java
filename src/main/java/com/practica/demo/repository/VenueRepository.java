package com.practica.demo.repository;

import com.practica.demo.entity.Customer;
import com.practica.demo.entity.Venue;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class VenueRepository {

    private List<Venue> venues;

    public VenueRepository() {
        System.out.println("Creating venueRepository");
        venues = new ArrayList<>();
        venues.add(new Venue(1,"Aleea Stadionului 2", "Stadion", 1000));
        venues.add(new Venue(2,"Bontida Castle", "Castle", 4000));
    }

    public List<Venue> getVenues() {
        return venues;
    }

    public Venue getVenue(int id) {
        Optional<Venue> venue = venues.stream().filter(a->id==a.getVenueID()).findFirst();
        if(venue.isPresent()){
            return venue.get();
        }
        return null;
    }


}
