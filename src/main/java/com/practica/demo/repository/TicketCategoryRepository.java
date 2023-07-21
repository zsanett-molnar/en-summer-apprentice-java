package com.practica.demo.repository;

import com.practica.demo.entity.TicketCategory;
import com.practica.demo.entity.TicketCategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
    List<TicketCategoryDTO> findAllByEventID_EventID(int id);


}
