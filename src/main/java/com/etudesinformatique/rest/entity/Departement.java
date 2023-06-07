package com.etudesinformatique.rest.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="Departement")
public class Departement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IDDEPARTEMENT")
	private Long idDepartement;

	@Column(name="NOMDEPT")
	private String nomDept;
	
	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	@JoinTable(name ="CollegDept",joinColumns = {@JoinColumn(name="idDepartement")},
	inverseJoinColumns = {@JoinColumn(name="idCol")	}
			)
	private List<College> colleges = new ArrayList<>();

	
	@OneToMany(mappedBy="departement", fetch = FetchType.LAZY)
	private List<Enseignant> enseignants = new ArrayList<>();
	
	
	public Departement() {
		super();
	}

	public Departement(Long idDepartement, String nomDept, List<College> colleges) {
		super();
		this.idDepartement = idDepartement;
		this.nomDept = nomDept;
		this.colleges = colleges;
	}
	

	public Long getIdDepartement() {
		return idDepartement;
	}

	public void setIdDepartement(Long idDepartement) {
		this.idDepartement = idDepartement;
	}

	public String getNomDept() {
		return nomDept;
	}

	public void setNomDept(String nomDept) {
		this.nomDept = nomDept;
	}

	public List<College> getColleges() {
		return colleges;
	}

	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}
	
	
}
