package com.etudesinformatique.rest.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Salle")
public class Salle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IDSALLE")
	private Long idSalle;

	@Column(name="NOMSALLE")
	private String nomSalle;
	
	@Column(name="CAPACITESALLE")
	private int capaciteSalle;

	@OneToMany(mappedBy="salle", fetch = FetchType.LAZY)
	private List<Matiere> matieres = new ArrayList<>();
	
	
	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

	public Long getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(Long idSalle) {
		this.idSalle = idSalle;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public int getCapaciteSalle() {
		return capaciteSalle;
	}

	public void setCapaciteSalle(int capaciteSalle) {
		this.capaciteSalle = capaciteSalle;
	}
	
	
}
