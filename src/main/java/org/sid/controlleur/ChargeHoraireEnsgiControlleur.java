package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.ChargeHoraireEnsgi;
import org.sid.entites.ElementConstitutif;
import org.sid.service.ChargeHoraireEnsgiService;
import org.sid.service.ElementConsectuifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class ChargeHoraireEnsgiControlleur {
	@Autowired
	private ChargeHoraireEnsgiService elc ;
	
	//findall
		@GetMapping("/ChargeHoraireEnsgi/liste")
		public List<ChargeHoraireEnsgi> lesProgrammes(){
			return elc.getElementConsectuif();	
		}
		//find by id 
		@GetMapping("/ChargeHoraireEnsgi/{id}")
		public Optional<ChargeHoraireEnsgi> findProgramme(@PathVariable Long id){
			return elc.findElementConsectuif(id);
		}
		
		//insert
			@PutMapping("/ChargeHoraireEnsgi/cree")
			public ChargeHoraireEnsgi creeProgramme(@RequestBody ChargeHoraireEnsgi eltc){
				
				return elc.save(eltc);
			
			}
			//modifier 
			@PutMapping("/ChargeHoraireEnsgi/miseajour")
			public ChargeHoraireEnsgi miseajourProgramme(@RequestBody ChargeHoraireEnsgi eltc){

				return elc.update(eltc);
			
			}

}
