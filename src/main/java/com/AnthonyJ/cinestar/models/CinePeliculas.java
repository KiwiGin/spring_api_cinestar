package com.AnthonyJ.cinestar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CinePeliculas {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Para autoincrementar
  @Column(unique = true, nullable = false)
  private int id;

  @ManyToOne
  @JoinColumn(name = "idCine", referencedColumnName = "id")
  private Cine Cine;

  @ManyToOne
  @JoinColumn(name = "idPelicula", referencedColumnName = "id")
  private Pelicula Pelicula;

  private int Sala;
  private String Horarios;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public Cine getCine() {
    return Cine;
  }
  public void setCine(Cine cine) {
    Cine = cine;
  }
  public Pelicula getPelicula() {
    return Pelicula;
  }
  public void setPelicula(Pelicula pelicula) {
    Pelicula = pelicula;
  }
  public int getSala() {
    return Sala;
  }
  public void setSala(int sala) {
    Sala = sala;
  }
  public String getHorarios() {
    return Horarios;
  }
  public void setHorarios(String horarios) {
    Horarios = horarios;
  }


}

// idPelicula int references Cine(id),
// idPelicula int references Pelicula(id),
// Sala int not null,
// Horarios char(150) not null );
