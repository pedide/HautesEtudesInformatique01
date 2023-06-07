package com.etudesinformatique.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etudesinformatique.rest.entity.Matiere;

public interface IMatiere extends JpaRepository<Matiere, Long>{

}
