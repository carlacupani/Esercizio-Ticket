package com.ticket.controller;

import java.util.List;
import java.util.Optional;

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
	
	private UtentiService utenteservice;
	private TicketService ticketservice;

	public ticketController(UtentiService utenteservice, TicketService ticketservice) {
		super();
		this.utenteservice = utenteservice;
		this.ticketservice = ticketservice;
	}
	
	@GetMapping("/admin/utenti")
	public String GetTuttiUtenti(Model model) 
		model.addAttribute("utente", utenteservice.getTuttiUtenti());
		return "listaUtenti";
	}

	@GetMapping("/admin/utenti/{id}")
	Optional<Utenti> getUtenti(@PathVariable long id) {
		return utentiservice.getUtenteSpecifico(id);
	}

	@PostMapping("/admin/aggiungi/utente")
	void addUser(@RequestBody Utenti utente) {
		utenteservice.save(utente);
	}

	@GetMapping("/admin/ticket")
	public Iterable<Ticket> listaTicket() {
		return ticketservice.getTuttiTicket();
	}

	@GetMapping("/admin/ticket/{id}")
	Optional<Ticket> getTicket(@PathVariable long id) {
		return ticketservice.getTicket(id);
	}

	@PostMapping("/ticket/aggiungi")
	void addUser(@RequestBody Ticket ticket) {
		ticketservice.save(ticket);
	}

	@PutMapping("/ticket/modifica/")
	void updateTicket(@RequestBody Ticket ticket, @PathVariable Long id) {
		ticketservice.updateTicket(ticket, id);
	}

	@DeleteMapping("/ticket/{id}")
	void eliminaTicket(@PathVariable long id) {
		ticketservice.deleteTicket(id);
	}

}
