package com.practica.demo.repository;

import com.practica.demo.entity.Event;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class EventRepository {

    private List<Event> events;

    public EventRepository() {
        System.out.println("Creating EventRepository");
        events = new ArrayList<>();
        events.add(new Event(1,1,1, "Untold", "Distractie", null, null));
        events.add(new Event(2,2,1, "Electric", "Distractie", null, null));
    }

    public List<Event> getEvents() {
        return events;
    }

    public Event getEvent(int id) {
        Optional<Event> event = events.stream().filter(a->id==a.getEventID()).findFirst();
        if(event.isPresent()) {
            return event.get();
        }
        return null;
    }
}
