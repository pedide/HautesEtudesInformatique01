package com.etudesinformatique.rest.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="College")
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IDCOLLEGE")
	private Long idCollege;

	@Column(name="ADRESSECOL")
	private String adresseCol;
	
	@Column(name="CPCOL")
	private String cpCol;
	
	@Column(name="VILLECOL")
	private String villeCol;
	
	@Column(name="TELCOL")
	private String telCol;
	
	@Column(name="EMAILCOL")
	private String emailCol;
	
	@Column(name="FAXCOL")
	private String faxCol;

	@ManyToMany(mappedBy="colleges")
	private List<Departement> departements = new ArrayList<>();
	
	public College() {
		super();
	}

	public College(Long idCollege, String adresseCol, String cpCol, String villeCol, String telCol, String emailCol,
			String faxCol) {
		super();
		this.idCollege = idCollege;
		this.adresseCol = adresseCol;
		this.cpCol = cpCol;
		this.villeCol = villeCol;
		this.telCol = telCol;
		this.emailCol = emailCol;
		this.faxCol = faxCol;
	}

	
	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	public Long getIdCollege() {
		return idCollege;
	}

	public void setIdCollege(Long idCollege) {
		this.idCollege = idCollege;
	}

	public String getAdresseCol() {
		return adresseCol;
	}

	public void setAdresseCol(String adresseCol) {
		this.adresseCol = adresseCol;
	}

	public String getCpCol() {
		return cpCol;
	}

	public void setCpCol(String cpCol) {
		this.cpCol = cpCol;
	}

	public String getVilleCol() {
		return villeCol;
	}

	public void setVilleCol(String villeCol) {
		this.villeCol = villeCol;
	}

	public String getTelCol() {
		return telCol;
	}

	public void setTelCol(String telCol) {
		this.telCol = telCol;
	}

	public String getEmailCol() {
		return emailCol;
	}

	public void setEmailCol(String emailCol) {
		this.emailCol = emailCol;
	}

	public String getFaxCol() {
		return faxCol;
	}

	public void setFaxCol(String faxCol) {
		this.faxCol = faxCol;
	}
	
	
	
	

}
