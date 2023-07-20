package com.practica.demo.service;

import com.practica.demo.entity.Venue;
import com.practica.demo.repository.VenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService {

    private VenueRepository venueRepository;

    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
        System.out.println(venueRepository);
        System.out.println("Creating Venue Service");
    }

    public String getVenue(int id) {
        if(id==0) {
            return "No information for this venue";
        }

        Venue venue = venueRepository.getVenue(id);
        if(venue!=null){
            return venue.toString();
        }
        else {
            return "Venue does not exist";
        }
    }

    public List<Venue> getVenues() {
        return venueRepository.getVenues();
    }

}
