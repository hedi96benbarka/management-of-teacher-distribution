package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Grade;
import org.sid.entites.Programme;
import org.sid.entites.Semestre;
import org.sid.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class GradeControlleur {
	@Autowired
	private GradeService grade ;
	//findall
		@GetMapping("/Grade/liste")
		public List<Grade> lesProgrammes(){
			return grade.getParcours()	;
		}
		//find by id 
		@GetMapping("/Grade/{id}")
		public Optional<Grade> findProgramme(@PathVariable Long id){
			return grade.findParcours(id);
		}
		//insert
		@PutMapping("/Grade/cree")
		public void creeProgramme(@RequestBody Grade prog){
			grade.save(prog);
		
		}
		//trouver 
		@GetMapping("/Gradetrouve/{ch}")
		public Grade find(@PathVariable String ch){
			return grade.trouve(ch);
		}
		
		//modifier 
		@PutMapping("/Grade/miseajour")
		public Grade miseajourProgramme(@RequestBody Grade prog){
		return grade.update(prog);
		
		}
		

}
