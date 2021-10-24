package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Programme;
import org.sid.entites.Semestre;
import org.sid.entites.Titre;
import org.sid.service.TitreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class TitreControlleur {
	@Autowired
	private TitreService tit;
	@GetMapping("/Titre/liste")
	public List<Titre> lestitres(){
		return tit.getProgmrames();	
	}
	//find by id 
	@GetMapping("/Titre/{id}")
	public Optional<Titre> findtitre(@PathVariable Long id){
		return tit.findProgramme(id);
	}
	
	//insert
		@PutMapping("/Titre/cree")
		public void creerTitre(@RequestBody Titre prog){
		tit.save(prog);
		
		}
		
		//modifier 
		@PutMapping("/Titre/miseajour")
		public Titre miseajourTitre(@RequestBody Titre prog){
		
			return tit.update(prog);
		
		}
		//chercher par nom
		@GetMapping("/Titrenom/{ch}")
		public Titre findbynomtitre(@PathVariable String ch){
			return tit.find(ch);
		}

}
