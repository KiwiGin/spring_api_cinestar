package com.AnthonyJ.cinestar.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AnthonyJ.cinestar.models.Pelicula;
import com.AnthonyJ.cinestar.repository.IPelicula;

@Service
public class PeliculaService {
  
  @Autowired
  IPelicula iPelicula;

  public ArrayList<Pelicula> getPeliculas(int idEstado){
    return (ArrayList<Pelicula>) iPelicula.findByIdEstado(idEstado);
  }

  public Optional<Pelicula> getPelicula(int id){
    return iPelicula.findById(id);
  }

  public Pelicula createPelicula(Pelicula pelicula){
    return iPelicula.save(pelicula);
  }

  public String updatePelicula(Pelicula request, int id){
    
    try {
      Pelicula pelicula = iPelicula.findById(id).get();

      pelicula.setTitulo( request.getTitulo() );
      pelicula.setFechaEstreno( request.getFechaEstreno() );
      pelicula.setDirector( request.getDirector() );
      pelicula.setGeneros( request.getGeneros() );
      pelicula.setIdClasificacion( request.getIdClasificacion() );
      pelicula.setIdEstado( request.getIdEstado() );
      pelicula.setDuracion( request.getDuracion() );
      pelicula.setLink( request.getLink() );
      pelicula.setReparto( request.getReparto() );
      pelicula.setSinopsis( request.getSinopsis() );

      iPelicula.save(pelicula);
      
      return "se actualizo";
    } catch (Exception e) {
      System.out.println(e);
      return "no se encotro pelicula";
    }

  }

  public boolean deletePelicula(int id){
    try {
      iPelicula.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

}
