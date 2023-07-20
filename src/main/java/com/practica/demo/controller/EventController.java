package com.practica.demo.controller;

import com.practica.demo.entity.Customer;
import com.practica.demo.entity.Event;
import com.practica.demo.entity.Venue;
import com.practica.demo.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {

    private EventService eventService;

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
}
