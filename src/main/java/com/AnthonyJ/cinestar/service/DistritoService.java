package com.AnthonyJ.cinestar.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnthonyJ.cinestar.models.Distrito;
import com.AnthonyJ.cinestar.repository.IDistrito;

@Service
public class DistritoService {
  
  @Autowired
  IDistrito idistrito;

  public ArrayList<Distrito> getDistritos(){
    return (ArrayList<Distrito>)idistrito.findAll();
  }

  public Optional<Distrito> getDistrito(int id){
    return idistrito.findById(id);
  }

  public Distrito createDistrito(Distrito distrito){
    return idistrito.save(distrito);
  }

  public Distrito updateDistrito(Distrito request,int id){
    Distrito distrito = idistrito.findById(id).get();

    distrito.setDetalle(request.getDetalle());

    return idistrito.save(distrito);
  }

  public boolean deleteDistrito(int id) {

    try {
      idistrito.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }

  }

}
