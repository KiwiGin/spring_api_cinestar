package com.AnthonyJ.cinestar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(unique = true, nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idDistrito", referencedColumnName = "id")
    private Distrito distrito;

	private String RazonSocial;
	private int Salas;
	private String Direccion;
	private String Telefonos;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Distrito getDistrito() {
        return distrito;
    }
    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
    public String getRazonSocial() {
        return RazonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        RazonSocial = razonSocial;
    }
    public int getSalas() {
        return Salas;
    }
    public void setSalas(int salas) {
        Salas = salas;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public String getTelefonos() {
        return Telefonos;
    }
    public void setTelefonos(String telefonos) {
        Telefonos = telefonos;
    }
    
}
