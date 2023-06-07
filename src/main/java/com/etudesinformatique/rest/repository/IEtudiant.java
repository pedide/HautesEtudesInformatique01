package com.etudesinformatique.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etudesinformatique.rest.entity.Etudiant;

public interface IEtudiant extends JpaRepository<Etudiant, Long>{

}
