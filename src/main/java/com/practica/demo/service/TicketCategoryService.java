package com.practica.demo.service;

import com.practica.demo.entity.TicketCategory;
import com.practica.demo.entity.TicketCategoryDTO;
import com.practica.demo.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketCategoryService {

    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;

    public TicketCategoryService(TicketCategoryRepository ticketCategoryRepository) {
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    List<TicketCategoryDTO> getTicketCategoriesByEventID(int id) {
        return ticketCategoryRepository.findAllByEventID_EventID(id);
    }
}
