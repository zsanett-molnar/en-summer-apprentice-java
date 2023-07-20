package com.practica.demo.repository;

import com.practica.demo.entity.EventType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EventTypeRepository {

    private List<EventType> eventTypes;

    public EventTypeRepository() {
        System.out.println("Creating EventTypeRepository");
        eventTypes = new ArrayList<>();
        eventTypes.add(new EventType(1, "Festival de muzica"));
        eventTypes.add(new EventType(2, "Sport"));
        eventTypes.add(new EventType(3, "Bauturi"));
    }

    public List<EventType> getEventTypes() {
        return eventTypes;
    }

    public EventType getEventType(int id) {
        Optional<EventType> eventType = eventTypes.stream().filter(a->id==a.getEventTypeID()).findFirst();
        if(eventType.isPresent()) {
            return eventType.get();
        }
        return null;
    }


}
