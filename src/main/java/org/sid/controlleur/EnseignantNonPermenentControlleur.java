package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.EnseignantNonPermenent;
import org.sid.entites.EnseignantPermanent;
import org.sid.entites.Titre;
import org.sid.service.EnseiganantNonPermenetServ;
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
public class EnseignantNonPermenentControlleur {
	@Autowired
	private EnseiganantNonPermenetServ pers ;
	@Autowired
	private TitreService tit;
	
	

	//findall
		@GetMapping("/EnseignantNonPermenent/liste")
		public List<EnseignantNonPermenent> lesProgrammes(){
			return pers.getAllEensPerm();	
		}
		//find by id 
		@GetMapping("/EnseignantNonPermenent/{id}")
		public Optional<EnseignantNonPermenent> findProgramme(@PathVariable Long id){
			return pers.findFamille(id);
		}
		//insert
		@PutMapping("/EnseignantNonPermenent/cree")
		public void creeProgramme(@RequestBody EnseignantNonPermenent prog){
			Titre t=tit.findProgramme(prog.getTitre().getId()).get();
			t.getLesenseginents().add(prog);
			
		//	Titre t=tit.findProgramme(prog.getTitre().getId()).get();
			//System.out.println("7el 3inik  ");
			prog.setTitre(t);			
			//System.out.println(prog.getTitre());
			pers.creer(prog);
	
			
		}
		//insert
				@PutMapping("/EnseignantNonPermenent/miseajour")
				public EnseignantNonPermenent modifier(@RequestBody EnseignantNonPermenent prog){
			return pers.update(prog);
			
					
				}



}
