package com.petp.wam.controllers;

import com.petp.wam.models.DTOs.TicketModelDTO;
import com.petp.wam.models.TicketModel;
import com.petp.wam.services.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ticket")
public class TicketController {

    private final TicketService ticketService;

    @GetMapping("/{ticketId}")
    public ResponseEntity<TicketModel> getTicket(@PathVariable Long ticketId) {
       return ResponseEntity.ok(ticketService.getTicketById(ticketId));
    }

    @PostMapping("/create")
    public ResponseEntity<TicketModel> createTicket(@RequestBody TicketModelDTO ticketModelDTO) {
        TicketModel ticketModel = ticketService.createTicket(ticketModelDTO);
        return ResponseEntity.created(URI.create("/api/ticket/%d".formatted(ticketModel.getId()))).body(ticketModel);
    }

    @GetMapping("/get-tickets-by-season/{seasonId}")
    public ResponseEntity<List<TicketModel>> getAllTicketBySeasonId(@PathVariable long seasonId) {
        return ResponseEntity.ok(ticketService.getAllTicketBySeasonId(seasonId));
    }

    @DeleteMapping("/delete/{ticketId}")
    public ResponseEntity<String> deleteTicket(@PathVariable long ticketId) {
        ticketService.deleteTicket(ticketId);
        String msg = "Ticket with %d deleted".formatted(ticketId);
        return ResponseEntity.ok(msg);
    }

    @PutMapping("/update/{ticketId}")
    public ResponseEntity<String> updateTicket(@RequestBody TicketModel ticketModel, @PathVariable String ticketId) {
        ticketService.editTicket(ticketModel);
        String msg = "msg: Ticket with %d successfully updated".formatted(ticketId);
        return ResponseEntity.ok(msg);
    }
}
