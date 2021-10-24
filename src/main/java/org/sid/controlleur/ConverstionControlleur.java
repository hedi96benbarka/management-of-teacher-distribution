package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Converstion;
import org.sid.entites.ElementConstitutif;
import org.sid.service.ConverstionServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class ConverstionControlleur {
	@Autowired
	private ConverstionServ elc ;
	
	
	//findall
		@GetMapping("/Converstion/liste")
		public List<Converstion> lesProgrammes(){
			return elc.getElementConsectuif();	
		}
		//find by id 
		@GetMapping("/Converstion/{id}")
		public Optional<Converstion> findProgramme(@PathVariable Long id){
			return elc.findElementConsectuif(id);
		}
		
		//insert
			@PutMapping("/Converstion/cree")
			public Converstion creeProgramme(@RequestBody Converstion eltc){
			
				return elc.save(eltc);
			
			}
			//modifier 
			@PutMapping("/Converstion/miseajour")
			public Converstion miseajourProgramme(@RequestBody Converstion eltc){

				return elc.update(eltc);
			
			}
}
