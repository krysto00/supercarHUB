package it.uniroma3.siw.model;

import java.util.*;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
public class Auto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String marca;
    private String modello;
    private int anno;
    private int cavalli;
    private double prezzo;
    private String immagine;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
    
    @OneToMany(mappedBy = "auto")
    private List<Valutazione> valutazioni;
    
    private Auto () {}
    
	public Auto(Long id, String marca, String modello, int anno, int cavalli, double prezzo, String immagine) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.anno = anno;
		this.cavalli = cavalli;
		this.prezzo = prezzo;
		this.immagine = immagine;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getCavalli() {
		return cavalli;
	}

	public void setCavalli(int cavalli) {
		this.cavalli = cavalli;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getImmagine() {
		return immagine;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anno, cavalli, marca, modello, prezzo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		return anno == other.anno && cavalli == other.cavalli && Objects.equals(marca, other.marca)
				&& Objects.equals(modello, other.modello)
				&& Double.doubleToLongBits(prezzo) == Double.doubleToLongBits(other.prezzo);
	}
	
	
	
}
