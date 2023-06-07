package com.etudesinformatique.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etudesinformatique.rest.entity.Salle;
import com.etudesinformatique.rest.repository.ISalle;



@Service
public class SalleDao {
	@Autowired
	ISalle salleRepository;
	
	//Liste des salle
	public List<Salle> getSalles(){
		return salleRepository.findAll();
		
	}
	
	//Save
	public Salle saveSalle(Salle salle) {
		return salleRepository.save(salle);
	}
	
	//get a Salle
	public Salle getSalleById(Long idSalle) {
		return salleRepository.findById(idSalle).get();
	}
	
	//Delete Salle
	public void deleteSalle(Salle salle) {
		salleRepository.delete(salle);
	}

}
