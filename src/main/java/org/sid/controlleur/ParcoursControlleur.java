package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Parcours;
import org.sid.entites.Programme;
import org.sid.service.ParcoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class ParcoursControlleur {
	@Autowired
	private ParcoursService prs;
	
	//findall
		@GetMapping("/Parcours/liste")
		public List<Parcours> lesParcours(){
			return prs.getParcours();	
		}
		//find by id 
		@RequestMapping ("/Parcours/{id}")
		public Optional<Parcours> findParcours(@PathVariable int id){
			return prs.findParcours(id);
		}
		//insert
		@PutMapping("/Parcours/cree")
		public Parcours creeParcours(@RequestBody Parcours prog){
		
			return prs.save(prog);
		
		}
		//modifier 
		@PutMapping("/Parcours/miseajour")
		public Parcours miseajourProgramme(@RequestBody Parcours prog){

			return prs.update(prog);
		
		}
		
		//trouver par nom 
		
		@RequestMapping ("/ParcoursN/{id}")
		public @ResponseBody Parcours findParcours(@PathVariable String id){
			return prs.trouve(id);
		}
	
}
