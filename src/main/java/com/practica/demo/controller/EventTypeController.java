package com.practica.demo.controller;

import com.practica.demo.entity.EventType;
import com.practica.demo.service.EventTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventTypeController {
    private EventTypeService eventTypeService;

    public EventTypeController(EventTypeService eventTypeService) {
        this.eventTypeService = eventTypeService;
        System.out.println("Creating event type controller");
    }

    @GetMapping("/eventtype/{eventTypeID}")
    public String getEventType(@PathVariable int eventTypeID) {
        return eventTypeService.getEventType(eventTypeID);
    }

    @GetMapping("/eventtype/eventtypes")
    public List<EventType> getEventTypes() {
        return eventTypeService.getEventTypes();
    }
}
