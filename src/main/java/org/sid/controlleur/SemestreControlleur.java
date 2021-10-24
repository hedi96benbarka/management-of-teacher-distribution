package org.sid.controlleur;

import java.util.List;
import java.util.Optional;


import org.sid.entites.Semestre;
import org.sid.service.SemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class SemestreControlleur {
	@Autowired
	private SemestreService sem ;
	
	//findall
	@GetMapping("/Semestre/liste")
	public List<Semestre> lesSemestres(){
		return sem.getSemestres();	
	}
	//find by id 
	@GetMapping("/Semestre/{id}")
	public Optional<Semestre> findSemestre(@PathVariable Long id){
		return sem.findSemestre(id);
	}
	//insert 
	@PutMapping("/Semestre/cree")
	public Semestre creeSemestre(@RequestBody Semestre semstr){
	
		return sem.save(semstr);
	
	}
	@PutMapping("/Semestre/miseajour")
	public Semestre miseajourProgramme(@RequestBody Semestre semstr){

		return sem.update(semstr);
	
	}
	

}
