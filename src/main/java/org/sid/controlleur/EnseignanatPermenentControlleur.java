package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.DateRecrutement;
import org.sid.entites.EnseignantPermanent;
import org.sid.entites.Programme;
import org.sid.service.DateembaucheService;
import org.sid.service.EnsPerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class EnseignanatPermenentControlleur {
	@Autowired
	private EnsPerService progServ;
	@Autowired 
	private DateembaucheService date ; 
	
	
	//findall
		@GetMapping("/Enseignant/Permenent/liste")
		public List<EnseignantPermanent> lesProgrammes(){
			return progServ.getAllEensPerm();	
		}
		//find by id 
		@GetMapping("/Enseignant/Permenent/{id}")
		public Optional<EnseignantPermanent> findProgramme(@PathVariable Long id){
			
			return progServ.findFamille(id);
		}
		//insert
		@PutMapping("/Enseignant/Permenent/cree")
		public void creeProgramme(@RequestBody EnseignantPermanent prog){
			/*DateRecrutement d=date.findType(prog.getDte().getId()).get();
			d.getListeEnseignenets().add(prog);
			prog.setDte(d);*/
			progServ.creer(prog);
		
		}
		
		@PutMapping("/Enseignant/Permenent/misajour")
		public EnseignantPermanent modifier(@RequestBody EnseignantPermanent prog){
			return progServ.update(prog);
		
		}

}
