package com.AnthonyJ.cinestar.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnthonyJ.cinestar.models.Genero;
import com.AnthonyJ.cinestar.repository.IGenero;

@Service
public class GeneroService {
  
  @Autowired
  IGenero iGenero;

  public ArrayList<Genero> getGeneros(){  
    return (ArrayList<Genero>) iGenero.findAll();
  }

  public Optional<Genero> getGenero(int id){  
    return  iGenero.findById(id);
  }

  public Genero createGenero(Genero genero){
    return iGenero.save(genero);
  }

  public String updateGenero(Genero request, int id){

    try {
      Genero genero = iGenero.findById(id).get();
      genero.setDetalle(request.getDetalle());
      iGenero.save(genero);
      return "se actualizo";
    } catch (Exception e) {
      return "no se encontro genero";
    }


  }

  public boolean deleteGenero(int id){
    try {
      iGenero.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

}
