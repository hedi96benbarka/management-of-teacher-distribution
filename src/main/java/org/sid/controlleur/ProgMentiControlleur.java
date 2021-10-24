package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.ProgrammeRepo;
import org.sid.entites.ProgMention;
import org.sid.entites.Programme;
import org.sid.entites.UniteEnseignement;
import org.sid.service.ProgMentionServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class ProgMentiControlleur {
	@Autowired
	private ProgMentionServ progServ;
	private ProgrammeRepo progc;
	
	//findall
		@GetMapping("/ProgMention/liste")
		public List<ProgMention> lesProgrammes(){
			return progServ.getProgmrames();	
		}
		//find by id 
		@GetMapping("/ProgMention/{id}")
		public Optional<ProgMention> findProgramme(@PathVariable Long id){
			return progServ.findProgramme(id);
		}
		//insert
		@PutMapping("/ProgMention/cree")
		public void creeProgramme(@RequestBody ProgMention prog){
			//prog.setProg(progc.findByCodePro(prog.getProg().geCodePro()));
			ProgMention p = progServ.save(prog);
		
		}
		//modifier 
		@PutMapping("/ProgMention/miseajour")
		public ProgMention miseajourProgramme(@RequestBody ProgMention prog){

			return progServ.update(prog);
		
		}
		
		
		

}
