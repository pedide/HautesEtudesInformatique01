package com.etudesinformatique.rest.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Etudiant")
public class Etudiant extends Personne{
	

	@Column(name="ANNEEENTREECOLLEGE")
	private String anneeEntreeCollege;

	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="MatiereEtudiant",
			joinColumns = @JoinColumn(name="idEtudiant"),
			inverseJoinColumns= @JoinColumn(name="idMatiere"))
	private List<Matiere> matieres = new ArrayList<>();
	
	public Etudiant() {
		super();
	}

	public Etudiant(String anneeEntreeCollege) {
		super();
		this.anneeEntreeCollege = anneeEntreeCollege;
	}

	public String getAnneeEntreeCollege() {
		return anneeEntreeCollege;
	}

	public void setAnneeEntreeCollege(String anneeEntreeCollege) {
		this.anneeEntreeCollege = anneeEntreeCollege;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}
	
	
}
