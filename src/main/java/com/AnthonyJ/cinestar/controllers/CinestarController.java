package com.AnthonyJ.cinestar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.AnthonyJ.cinestar.models.Cine;
import com.AnthonyJ.cinestar.models.Distrito;
import com.AnthonyJ.cinestar.models.Genero;
import com.AnthonyJ.cinestar.models.Pelicula;
import com.AnthonyJ.cinestar.service.CineService;
import com.AnthonyJ.cinestar.service.DistritoService;
import com.AnthonyJ.cinestar.service.GeneroService;
import com.AnthonyJ.cinestar.service.PeliculaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping
@CrossOrigin
@Configuration

public class CinestarController {

	//Servicios
	@Autowired
	private DistritoService distritoService;
	@Autowired
	private GeneroService generoService;
	@Autowired
	private PeliculaService peliculaService;
	@Autowired
	private CineService cineService;

	// Rutas
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**");
  }

	// Distrito
	@GetMapping("/distrito")
	public ArrayList<Distrito> getDistritos() {
		return distritoService.getDistritos();
	}

	@GetMapping("/distrito/{id}")
	public Optional<Distrito> getDistrito(@PathVariable int id) {
		return distritoService.getDistrito(id);
	}
	
	@PostMapping("/distrito/create")
	public Distrito createDistrito(@RequestBody Distrito distrito) {
		return distritoService.createDistrito(distrito);
	}

	@PutMapping("distrito/update/{id}")
	public Distrito updateDistrito(@PathVariable int id, @RequestBody Distrito request) {
		return distritoService.updateDistrito(request,id);
	}
	
	@DeleteMapping("/distrito/delete/{id}")
	public String deleteDistrito(@PathVariable int id){
		boolean bool = distritoService.deleteDistrito(id);

		if(bool){
			return "Se elimino ";
		}else{
			return "No se pudo eliminar";
		}
	}

	// Generos
	@GetMapping("/genero")
	public ArrayList<Genero> getGeneros() {
		return generoService.getGeneros();
	}

	@GetMapping("/genero/{id}")
	public Optional<Genero> getGenero(@PathVariable int id) {
		return generoService.getGenero(id);
	}
	
	@PostMapping("/genero/create")
	public Genero createGenero(@RequestBody Genero genero) {
		return generoService.createGenero(genero);
	}

	@PutMapping("/genero/update/{id}")
	public String updateGenero(@PathVariable int id, @RequestBody Genero request) {
		return generoService.updateGenero(request,id);
	}
	
	@DeleteMapping("/genero/delete/{id}")
	public String deleteGenero(@PathVariable int id){
		boolean bool = generoService.deleteGenero(id);

		if(bool){
			return "Se elimino ";
		}else{
			return "No se pudo eliminar";
		}
	}

	// Pelicula
	@GetMapping("/peliculas/{id}")
	public ArrayList<Pelicula> getPeliculas(@PathVariable int id) {
		return peliculaService.getPeliculas(id);
	}

	@GetMapping("/pelicula/{id}")
	public Optional<Pelicula> getPelicula(@PathVariable int id) {
		return peliculaService.getPelicula(id);
	}
	
	@PostMapping("/pelicula/create")
	public Pelicula createPelicula(@RequestBody Pelicula pelicula) {
		return peliculaService.createPelicula(pelicula);
	}

	@PutMapping("/pelicula/update/{id}")
	public String updatePelicula(@PathVariable int id, @RequestBody Pelicula request) {
		return peliculaService.updatePelicula(request,id);
	}
	
	@DeleteMapping("/pelicula/delete/{id}")
	public String deletePelicula(@PathVariable int id){
		boolean bool = peliculaService.deletePelicula(id);

		if(bool){
			return "Se elimino ";
		}else{
			return "No se pudo eliminar";
		}
	}
	
	// Cine
	@GetMapping("/cine")
	public ArrayList<Cine> getCines(@PathVariable int id) {
		return cineService.getCines();
	}

	@GetMapping("/cine/{id}")
	public Optional<Cine> getCine(@PathVariable int id) {
		return cineService.getCine(id);
	}
	
	@PostMapping("/cine/create")
	public Cine createCine(@RequestBody Cine cine) {
		return cineService.createCine(cine);
	}

	@PutMapping("/cine/update/{id}")
	public Cine updateCine(@PathVariable int id, @RequestBody Cine request) {
		return cineService.updateCine(request,id);
	}
	
	@DeleteMapping("/cine/delete/{id}")
	public String deleteCine(@PathVariable int id){
		boolean bool = cineService.deleteCine(id);

		if(bool){
			return "Se elimino ";
		}else{
			return "No se pudo eliminar";
		}
	}
	




}

