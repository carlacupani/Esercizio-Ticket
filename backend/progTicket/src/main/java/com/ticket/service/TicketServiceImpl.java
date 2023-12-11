package com.ticket.service;

import java.util.List;

import com.ticket.entity.Ticket;
import com.ticket.repository.RepositoryTicket;
import com.ticket.repository.RepositoryUtenti;

public class TicketServiceImpl implements TicketService {
	public RepositoryTicket repositoryTicket;

	@Override
	public Iterable<Ticket> getTuttiTicket() {
		return repositoryTicket.findAll();
	}

}
