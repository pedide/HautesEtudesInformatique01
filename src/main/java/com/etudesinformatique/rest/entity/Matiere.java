package com.etudesinformatique.rest.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Matiere")
public class Matiere {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="matiere_id")
	private Long idMatiere;
	
	@Column(name="LIBELLEMATIERE")
	private String libelleMatiere;

	@ManyToOne
	@JoinColumn(name="idMatiere",nullable=false)
	private Salle salle;
	
	@OneToMany(mappedBy="matiere")
	private List<Enseignant> enseignants = new ArrayList<>();
	
	@ManyToMany(mappedBy="matieres")
	private List<Etudiant> etudiants = new ArrayList<>();
	
	public Matiere() {
		super();
	}

	public Matiere(Long idMatiere, String libelleMatiere) {
		super();
		this.idMatiere = idMatiere;
		this.libelleMatiere = libelleMatiere;
	}

	
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public List<Enseignant> getEnseignants() {
		return enseignants;
	}

	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Long getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(Long idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getLibelleMatiere() {
		return libelleMatiere;
	}

	public void setLibelleMatiere(String libelleMatiere) {
		this.libelleMatiere = libelleMatiere;
	}
	
	
}
