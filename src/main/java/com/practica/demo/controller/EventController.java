package com.practica.demo.controller;

import com.practica.demo.entity.Customer;
import com.practica.demo.entity.Event;
import com.practica.demo.entity.EventDTO;
import com.practica.demo.entity.Venue;
import com.practica.demo.service.EventService;
import com.practica.demo.service.VenueService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private VenueService venueService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
        System.out.println("Creating event controller");
    }

    @GetMapping("/event/{eventID}")
    public Optional<Event> getEvent(@PathVariable int eventID) {
        return eventService.getEvent(eventID);
    }

    @GetMapping("/event/events")
    public List<Event> getEvents() {
        return eventService.getEvents();
    }

    @PostMapping("/event/addEvent")
    public Event insertEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }

    @GetMapping("/events")
    public List<EventDTO> getSomeEvents(@RequestParam String eventType, @RequestParam Integer venueID) {
        return eventService.getSomeEvents(eventType, venueID);
    }

    //ALA BASIC
//    @GetMapping("/events")
//    public List<Event> getSomeEvents(@RequestParam String eventType, @RequestParam Integer venueID) {
//        return eventService.getEventsBy(eventType, venueID);
//    }


}
