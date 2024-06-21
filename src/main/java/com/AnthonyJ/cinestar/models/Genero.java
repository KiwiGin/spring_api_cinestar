package com.AnthonyJ.cinestar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Genero {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  @Column(unique = true, nullable = false)
  private int id;
  private String Detalle;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getDetalle() {
    return Detalle;
  }
  public void setDetalle(String detalle) {
    Detalle = detalle;
  }

}
