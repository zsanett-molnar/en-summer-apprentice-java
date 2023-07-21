package com.practica.demo.repository;

import com.practica.demo.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

    public List<Event> findAllByEventTypeID_NameAndLocationID_VenueID(String eventTypeName, Integer venueID);

    //public List<Event> findAllByEventTypeID_NameAndLocation_VenueID(String eventTypeName, Integer venueID);


}
