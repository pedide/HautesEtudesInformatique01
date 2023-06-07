package com.etudesinformatique.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etudesinformatique.rest.entity.Departement;

public interface IDepartement extends JpaRepository<Departement, Long>{

}
