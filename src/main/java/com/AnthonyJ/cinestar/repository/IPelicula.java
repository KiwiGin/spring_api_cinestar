package com.AnthonyJ.cinestar.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AnthonyJ.cinestar.models.Pelicula;

@Repository
public interface IPelicula extends JpaRepository<Pelicula,Integer>{
  public abstract ArrayList<Pelicula> findByIdEstado(int idEstado);
}
