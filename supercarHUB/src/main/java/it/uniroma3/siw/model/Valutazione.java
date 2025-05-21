package it.uniroma3.siw.model;

import jakarta.persistence.*;

@Entity
public class Valutazione {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int design;
    private int prestazioni;
    private int tecnologia;
    private int esclusivita;
    
    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "id_auto")
    private Auto auto;
    
    public Valutazione() {}
    
	public Valutazione(Long id, int design, int prestazioni, int tecnologia, int esclusivita) {
		super();
		this.id = id;
		this.design = design;
		this.prestazioni = prestazioni;
		this.tecnologia = tecnologia;
		this.esclusivita = esclusivita;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDesign() {
		return design;
	}

	public void setDesign(int design) {
		this.design = design;
	}

	public int getPrestazioni() {
		return prestazioni;
	}

	public void setPrestazioni(int prestazioni) {
		this.prestazioni = prestazioni;
	}

	public int getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(int tecnologia) {
		this.tecnologia = tecnologia;
	}

	public int getEsclusivita() {
		return esclusivita;
	}

	public void setEsclusivita(int esclusivita) {
		this.esclusivita = esclusivita;
	}
    
    
}
