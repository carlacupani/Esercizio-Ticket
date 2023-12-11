package com.ticket.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.ticket.entity.Ticket;
import com.ticket.repository.RepositoryTicket;
import com.ticket.repository.RepositoryUtenti;

public class TicketServiceImpl implements TicketService {
	public RepositoryTicket repositoryTicket;

	@Override
	public Iterable<Ticket> getTuttiTicket() {
		return repositoryTicket.findAll();
	}

	@Override
	public void save(Ticket ticket) {
		repositoryTicket.save(ticket);

	}

	@Override
	public void updateTicket(Ticket ticket, Long id) {
		Optional<Ticket> existingTicketOptional = repositoryTicket.findById(id);

		// Estrai il ticket esistente
		Ticket existingTicket = existingTicketOptional.get();

		// Aggiorna i campi del ticket esistente con i dati forniti dal frontend
		existingTicket.setDescrizione(ticket.getDescrizione()); // Sostituisci "Campo1" con il nome del campo
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		existingTicket.setDate(date);

		// Salva il ticket aggiornato nel database
		repositoryTicket.save(existingTicket);

	}

	@Override
	public void deleteTicket(long id) {
		repositoryTicket.deleteById(id);
	}

	@Override
	public Optional<Ticket> getTicket(long id) {
		return repositoryTicket.findById(id);

	}

}
