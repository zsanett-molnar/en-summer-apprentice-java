package com.practica.demo.controller;

import com.practica.demo.entity.Event;
import com.practica.demo.entity.Venue;
import com.practica.demo.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    private EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
        System.out.println("Creating event controller");
    }

    @GetMapping("/event/{eventID}")
    public String getEvent(@PathVariable int eventID) {
        return eventService.getEvent(eventID);
    }

    @GetMapping("/event/events")
    public List<Event> getEvents() {
        return eventService.getEvents();
    }
}
