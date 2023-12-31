package com.ticket.service;

import org.springframework.stereotype.Service;

import com.ticket.repository.RepositoryUtenti;

@Service
public class UtentiServiceImpl implements UtentiService {
	
	public RepositoryUtenti repositoryUtenti;

	public UtentiServiceImpl(RepositoryUtenti repositoryUtenti) {

		super();

		this.repositoryUtenti = repositoryUtenti;

	}

	@Override
	public List<Utenti> getTuttiUtenti() {
		return (List<Utenti>) repositoryUtenti.findAll();
	}

	@Override
	public Utenti salvaUtente(Utenti utente) {
		return repositoryUtenti.save(utente);
	}

	@Override
	public void cancellaUtenteId(Long id) {
		repositoryUtenti.deleteById(id);
	}

	@Override
	public Utenti modificaUtente(Long id, Utenti u) {
		Utenti us = repositoryUtenti.findById(id).get();
		us.setUsername(u.getUsername());
		us.setRuolo(u.isRuolo());
		us.setPassword(u.getPassword());
		return us;
	}

	@Override
	public Utenti getUtenteSpecifico() {
		return repositoryTicket.findById(id);
		return null;
	}

}
