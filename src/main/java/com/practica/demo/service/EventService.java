package com.practica.demo.service;

import com.practica.demo.entity.Customer;
import com.practica.demo.entity.Event;
import com.practica.demo.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
        System.out.println(eventRepository);
        System.out.println("Creating event service");
    }
    public String getEvent(int id) {
        if(id==0) {
            return "No information for this event";
        }

        Event event = eventRepository.getEvent(id);
        if(event!=null) {
            return event.toString();
        }
        else {
            return "Event does not exist";
        }
    }

    public List<Event> getEvents() {
        return eventRepository.getEvents();
    }
}
