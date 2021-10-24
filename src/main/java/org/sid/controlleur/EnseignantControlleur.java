package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Enseignant;
import org.sid.entites.EnseignantNonPermenent;
import org.sid.entites.EnseignantPermanent;
import org.sid.entites.Programme;
import org.sid.service.EnsPerService;
import org.sid.service.EnseiganantNonPermenetServ;
import org.sid.service.EnseignantServ;
import org.sid.service.ProgrameServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class EnseignantControlleur {
	@Autowired
	private  EnseignantServ progserv;
	@Autowired
	private EnsPerService ensPerServ;
	@Autowired
	private EnseiganantNonPermenetServ est;

	
	
	//findall liste des enseignant  non permenet 
		@GetMapping("/Enseignant/nonpermenant/liste")
		public List<EnseignantNonPermenent> findall(){
			return 	est.getAllEensPerm();
		}
	
	//findall liste des enseignant permenet 
	@GetMapping("/Enseignant/permenant/liste")
	public List<EnseignantPermanent> getAllEensPerm(){
		return 	ensPerServ.getAllEensPerm();
	}
	//findall
	@GetMapping("/Enseignant/liste")
	public List<Enseignant> lesProgrammes(){
		return progserv.getProgmrames();	
	}
	//find by id 
	@GetMapping("/Enseignant/{id}")
	public Optional<Enseignant> findProgramme(@PathVariable Long id){
		return progserv.findProgramme(id);
	}
	//insert
		@PutMapping("/Enseignant/cree")
		public Enseignant creeProgramme(@RequestBody Enseignant prog){
		
			return progserv.save(prog);
		
		}
		//modifier 
		@PutMapping("/Enseignant/miseajour")
		public Enseignant miseajourProgramme(@RequestBody Enseignant prog){

			return progserv.update(prog);
		
		}

}
