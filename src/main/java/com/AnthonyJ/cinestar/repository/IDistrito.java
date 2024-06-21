package com.AnthonyJ.cinestar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AnthonyJ.cinestar.models.Distrito;

@Repository
public interface IDistrito extends JpaRepository<Distrito,Integer>{
  
}
