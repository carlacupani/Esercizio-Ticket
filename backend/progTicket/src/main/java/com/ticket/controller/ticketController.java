package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ticket.entity.*;
import com.ticket.service.TicketService;

@Controller
public class ticketController {

	private TicketService ticketservice;

	@GetMapping("/admin/ticket")
	public Iterable<Ticket> listaTicket(Model model) {
		return ticketservice.getTuttiTicket();
	}

	@PostMapping("/utenti/aggiungi")
	void addUser(@RequestBody Ticket ticket) {
		ticketservice.save(ticket);
	}

	@PutMapping("/utenti/modifica/")
	void updateTicket(@RequestBody Ticket ticket, @PathVariable Long id) {
		ticketservice.updateTicket(ticket, id);
	}

	@DeleteMapping("/utenti/{id}")
	void eliminaTIcket(@PathVariable long id) {
		ticketservice.deleteTicket(id);
	}

}
