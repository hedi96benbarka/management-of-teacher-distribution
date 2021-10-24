package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Affectation;
import org.sid.entites.Programme;
import org.sid.service.ffectationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class AffectationControlleur {
	@Autowired
	private ffectationService afs;
	
	//findall
		@GetMapping("/Affectation/liste")
		public List<Affectation> lesAffectation(){
			return afs.getAffectation();	
		}
		//find by id 
		@GetMapping("/Affectation/{id}")
		public Optional<Affectation> findProgramme(@PathVariable Long id){
			return afs.findAffectation(id);
		}
		//insert
		@PutMapping("/Affectation/cree")
		public Affectation creeProgramme(@RequestBody Affectation aff){
		
			return afs.save(aff);
		
		}
		
		@PostMapping("/Affectation/crees")
		public Affectation ajouter(@RequestBody Affectation aff){
		
			return afs.save(aff);
		
		}
		//modifier 
		@PutMapping("/Affectation/miseajour")
		public Affectation miseajourProgramme(@RequestBody Affectation aff){

			return afs.update(aff);
		
		}
		//trouvee
		
		@GetMapping("/Affectations/{id}")
		public Affectation trouve(@PathVariable int id){
			return afs.trouver(id);
		}
		
		//supprimer	
				@DeleteMapping("/Affectationsdelete/{id}")
				public void supprimer(@PathVariable Long id){
					afs.supprimer(id);
				}
		
	
}
