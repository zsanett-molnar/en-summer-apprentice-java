package com.practica.demo.service;

import com.practica.demo.entity.Event;
import com.practica.demo.entity.EventDTO;
import com.practica.demo.repository.EventRepository;
import com.practica.demo.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;

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

//    public List<Event> getEventsBy(String eventType, Integer venueID) {
//        List<Event> events = eventRepository.findAllByEventTypeID_NameAndLocationID_VenueID(eventType, venueID);
//        return events;
//    }

    public List<EventDTO> getSomeEvents(String eventType, Integer venueID) {
        List<Event> events = eventRepository.findAllByEventTypeID_NameAndLocationID_VenueID(eventType, venueID);
        for(Event e : events) {
            System.out.println(e.toString());
        }
        List<EventDTO> result = new ArrayList<>();

        TicketCategoryService ticketService = new TicketCategoryService(ticketCategoryRepository);

        for(Event e : events) {
            EventDTO eventDTO = new EventDTO(e.getEventID(), e.getLocationID(), e.getEventTypeID().getName(), e.getDescription(),
                    e.getName(), e.getStartDate(), e.getEndDate(), ticketService.getTicketCategoriesByEventID(e.getEventID()));
            result.add(eventDTO);
        }

        return result;
    }
}
