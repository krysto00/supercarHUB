package it.uniroma3.siw.model;

import java.util.*;

import jakarta.persistence.*;

@Entity
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	private String email;
	private String password;
	private String ruolo;
	
	@ManyToMany
    @JoinTable(
        name = "preferiti",
        joinColumns = @JoinColumn(name = "utente_id"),
        inverseJoinColumns = @JoinColumn(name = "id_auto")
    )
    private Set<Auto> preferiti = new HashSet<>();
	
	public Utente() {}
	
	public Utente(Long id, String username, String email, String password, String ruolo) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.ruolo = ruolo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	

}
