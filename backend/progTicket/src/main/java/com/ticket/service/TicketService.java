package com.ticket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ticket.entity.Ticket;
import com.ticket.repository.RepositoryTicket;

@Service
public interface TicketService {

	Iterable<Ticket> getTuttiTicket();

	void save(Ticket ticket);

	void updateTicket(Ticket ticket, Long id);

	void deleteTicket(long id);

	Optional<Ticket> getTicket(long id);

}
