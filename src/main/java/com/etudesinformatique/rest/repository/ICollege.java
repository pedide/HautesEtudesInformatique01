package com.etudesinformatique.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etudesinformatique.rest.entity.College;

public interface ICollege extends JpaRepository<College, Long>{

}
