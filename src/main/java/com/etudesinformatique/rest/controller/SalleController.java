package com.etudesinformatique.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etudesinformatique.rest.dao.SalleDao;
import com.etudesinformatique.rest.entity.Salle;


@RestController
@RequestMapping
@CrossOrigin("*")
public class SalleController {
	@Autowired
	SalleDao salleDao;
	
	@PostMapping("/salles")
	public Salle createSalle(@Validated @RequestBody(required = false)
	Salle salle) {
		return salleDao.saveSalle(salle);
	}
	
	@GetMapping("/salles")
	public List<Salle> getAllSalles() {
		return salleDao.getSalles();
	}
	
	@GetMapping("/salles/{idSalle}")
	public ResponseEntity findSalleByid(@PathVariable(name="idSalle")
	Long idSalle) {
		if(idSalle == null) {
			return ResponseEntity.badRequest().body("Cannot retrieve Salle with null ID");
		}
		Salle salle = salleDao.getSalleById(idSalle);
		
		if(salle == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(salle);
		
	}

	@PutMapping("/salle")
	public Salle updateSalle(
			@Validated @RequestBody(required = false)
			Salle salle) {
		return salleDao.saveSalle(salle);
		
	}
	
	@DeleteMapping("/salles/{id}")
	public ResponseEntity<Salle> deleteSalles(@Validated @PathVariable(name="id")
	Long idSalle) {		
		
		Salle salle = salleDao.getSalleById(idSalle);		
		if(salle == null) {
			return ResponseEntity.notFound().build();
		}
		salleDao.deleteSalle(salle);
		return ResponseEntity.ok().body(salle);
		
	}


}
