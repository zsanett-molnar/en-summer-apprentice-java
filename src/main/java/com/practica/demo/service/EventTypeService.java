package com.practica.demo.service;

import com.practica.demo.entity.EventType;
import com.practica.demo.repository.EventTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventTypeService {
    private EventTypeRepository eventTypeRepository;

    public EventTypeService(EventTypeRepository eventTypeRepository) {
        this.eventTypeRepository = eventTypeRepository;
        System.out.println(eventTypeRepository);
        System.out.println("Creating EventType Service");
    }

    public String getEventType(int id) {
        if(id==0) {
            return "No information for this event type";
        }
        EventType eventType = eventTypeRepository.getEventType(id);
        if(eventType!=null) {
            return eventType.toString();
        }
        else {
            return "Event type does not exist";
        }
    }

    public List<EventType> getEventTypes() {
        return eventTypeRepository.getEventTypes();
    }
}
