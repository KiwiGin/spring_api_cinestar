package com.AnthonyJ.cinestar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AnthonyJ.cinestar.models.Cine;

@Repository
public interface ICine extends JpaRepository<Cine,Integer> {
  
}
