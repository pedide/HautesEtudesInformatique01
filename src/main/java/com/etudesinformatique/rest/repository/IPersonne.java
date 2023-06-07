package com.etudesinformatique.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etudesinformatique.rest.entity.Personne;

public interface IPersonne extends JpaRepository<Personne, Long>{

}
