package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.FamilleElementConstitutif;

import org.sid.service.FamilleElementConsectuifServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class FamilleElementConsectuifControlleur {
	@Autowired
	private FamilleElementConsectuifServ fes;
	

	//findall
		@GetMapping("/FamilleElement/liste")
		public List<FamilleElementConstitutif> lesFamillesElementConsectuif(){
			return fes.getFamille();	
		}
		//find by id 
		@GetMapping("/FamilleElement/{id}")
		public Optional<FamilleElementConstitutif> findFamille(@PathVariable Long id){
			return fes.findFamille(id);
		}
		
		//insert
		@PutMapping("/FamilleElement/cree")
		public FamilleElementConstitutif creeFamille(@RequestBody FamilleElementConstitutif famille){
		
			return fes.save(famille);
		
		}
		//modifier 
		@PutMapping("/FamilleElement/miseajour")
		public FamilleElementConstitutif miseajourFamille(@RequestBody FamilleElementConstitutif famille){

			return fes.update(famille);
		 
		}
		
		//find by nom famille
	@GetMapping("/FamilleElements/{ch}")
		public FamilleElementConstitutif findFamille(@PathVariable String ch){
			return fes.findbynom(ch);
		}
		
	
}
