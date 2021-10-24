package org.sid.controlleur;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.sid.entites.DateRecrutement;
import org.sid.entites.Programme;
import org.sid.service.DateembaucheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class DateRecrutementControlleur {
	@Autowired 
	private DateembaucheService date ; 
	
	//findall 
	@GetMapping("/Date/liste")
	public List<DateRecrutement> lesProgrammes(){
		return date.getTypes();	
	}
	
	//find by id 
	@GetMapping("/Date/{id}")
	public Optional<DateRecrutement> findDateRecurtement(@PathVariable Long id){
		return date.findType(id);
	}
	//insert
		@PutMapping("/Date/cree")
		public void creeDate(@RequestBody DateRecrutement prog){
			date.save(prog);
		
		}
		//trouver 
		@GetMapping("/DateCherche/{dates}")
		public DateRecrutement find(@PathVariable String  dates){
			return date.chercher(dates);
		}
		//modifier 
		@PutMapping("/Date/miseajour")
		public void modifier(@RequestBody DateRecrutement prog){
			date.save(prog);
		
		}
		

}
