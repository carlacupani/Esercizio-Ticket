package com.ticket.service;

@Service
public interface UtentiService {

    List<Utenti> getTuttiUtenti();
    
	Utenti getUtenteSpecifico();

	Utenti salvaUtente(Utenti utente);

	void cancellaUtenteId(Long id);

	Utenti modificaUtente(Long id, Utenti u);

}
