package com.AnthonyJ.cinestar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CineTarifa {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Para autoincrementar
  @Column(unique = true, nullable = false)
  private int id;

  @ManyToOne
  @JoinColumn(name = "idCine", referencedColumnName = "id")
  private Cine cine;
  private String DiasSemana;
  private Float Precio;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

  public Cine getCine() {
    return cine;
  }
  public void setCine(Cine cine) {
    this.cine = cine;
  }
  public String getDiasSemana() {
    return DiasSemana;
  }
  public void setDiasSemana(String diasSemana) {
    DiasSemana = diasSemana;
  }
  public Float getPrecio() {
    return Precio;
  }
  public void setPrecio(Float precio) {
    Precio = precio;
  }
  
}
