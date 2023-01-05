package com.petp.wam.services;

import com.petp.wam.models.TicketModel;
import com.petp.wam.repositories.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketModel getTicketById(Long ticketId) {
        return ticketRepository.findById(ticketId).orElseThrow(
                ()-> new NoSuchElementException("Ticket with ticket id %d not found!".formatted(ticketId)));
    }
}
