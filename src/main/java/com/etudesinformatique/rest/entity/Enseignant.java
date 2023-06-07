package com.etudesinformatique.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Enseignant")
public class Enseignant extends Personne {

	@Column(name="DATEPRISEFONCTION")
	private String datePriseFn;
	
	@Column(name="INDICE")
	private int indice;

	@ManyToOne
	@JoinColumn(name="idDepartement",nullable=false)
	private Departement departement;
	
	@ManyToOne
	@JoinColumn(name="idMatiere",nullable=false)
	private Matiere matiere;
	
	public Enseignant() {
		super();
	}

	public Enseignant(String datePriseFn, int indice) {
		super();
		this.datePriseFn = datePriseFn;
		this.indice = indice;
	}

	public String getDatePriseFn() {
		return datePriseFn;
	}

	public void setDatePriseFn(String datePriseFn) {
		this.datePriseFn = datePriseFn;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	
}
