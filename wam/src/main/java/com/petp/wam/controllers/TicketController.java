package com.petp.wam.controllers;

import com.petp.wam.models.TicketModel;
import com.petp.wam.services.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ticket")
public class TicketController {

    private final TicketService ticketService;

    @GetMapping("/{ticketId}")
    public ResponseEntity<TicketModel> getTicket(@PathVariable Long ticketId) {
       return ResponseEntity.ok(ticketService.getTicketById(ticketId));
    }
}
