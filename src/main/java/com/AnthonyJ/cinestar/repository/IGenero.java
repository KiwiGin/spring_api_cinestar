package com.AnthonyJ.cinestar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AnthonyJ.cinestar.models.Genero;

@Repository
public interface IGenero extends JpaRepository<Genero,Integer> {
  
}
