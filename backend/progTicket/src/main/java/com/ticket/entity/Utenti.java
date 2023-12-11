package com.ticket.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utenti {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private boolean ruolo;

	public Utenti(long id, String username, String password, boolean ruolo) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRuolo() {
		return ruolo;
	}

	public void setRuolo(boolean ruolo) {
		this.ruolo = ruolo;
	}

}
