package com.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.ticket.entity.Ticket;

public interface RepositoryTicket extends CrudRepository <Ticket, Long> {

}
