package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Programme;
import org.sid.entites.UniteEnseignement;
import org.sid.entites.Utilisateur;
import org.sid.service.ProgrameServ;
import org.sid.service.UtilService;
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
public class UtilControlleur {
	@Autowired
	private UtilService progServ;
	
	//findall
		@GetMapping("/Utilisateur/liste")
		public List<Utilisateur> lesProgrammes(){
			return progServ.getUnite();	
		}
		//find by id 
		@GetMapping("/Utilisateur/{id}")
		public Optional<Utilisateur> findProgramme(@PathVariable Long id){
			return progServ.findUnite(id);
		}
		//insert
		@PutMapping("/Utilisateur/cree")
		public Utilisateur creeProgramme(@RequestBody Utilisateur prog){
			return progServ.save(prog);
			//System.out.println("*************************************");
			//System.out.println(p.toString());
		
		}
		//modifier 
		@PutMapping("/Utilisateur/miseajour")
		public Utilisateur miseajourProgramme(@RequestBody Utilisateur prog){

			return progServ.update(prog);
		
		}
		//trouverpassword
		@GetMapping("/Utilisateurtd/{ch}")
		public Utilisateur trouves(@PathVariable String ch){
			return progServ.trouv(ch);
		}
		
		
		
		
}
