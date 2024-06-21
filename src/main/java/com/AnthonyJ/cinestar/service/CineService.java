package com.AnthonyJ.cinestar.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnthonyJ.cinestar.models.Cine;
import com.AnthonyJ.cinestar.repository.ICine;

@Service
public class CineService {
  
  @Autowired
  ICine icine;

  public ArrayList<Cine> getCines(){
    return (ArrayList<Cine>)icine.findAll();
  }

  public Optional<Cine> getCine(int id){
    return icine.findById(id);
  }

  public Cine createCine(Cine cine){
    return icine.save(cine);
  }

  public Cine updateCine(Cine request, int id){
    Cine cine = icine.findById(id).get();

    cine.setDistrito(request.getDistrito());
    cine.setRazonSocial(request.getRazonSocial());
    cine.setSalas(request.getSalas());
    cine.setDireccion(request.getDireccion());
    cine.setTelefonos(request.getTelefonos());

    return icine.save(cine);
  }

  public boolean deleteCine(int id){
    try {
      icine.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

}
