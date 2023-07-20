package com.practica.demo.service;

import com.practica.demo.entity.Event;
import com.practica.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;

    }
    public Optional<Event> getEvent(int id) {
        return eventRepository.findById(id);
    }

    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getSomeEvents(String eventType, Integer venueID) {
        return eventRepository.findAllByEventTypeID_NameAndLocationID_VenueID(eventType, venueID);
    }
}
