package com.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.ticket.entity.Utenti;

public interface RepositoryUtenti extends CrudRepository <Utenti, Long> {

}
