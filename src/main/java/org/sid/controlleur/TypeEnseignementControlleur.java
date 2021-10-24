package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Type;
import org.sid.entites.TypeEnseignement;
import org.sid.service.TypeEnseignementServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class TypeEnseignementControlleur {
	@Autowired
	private TypeEnseignementServ tpe ;
	
	
	//findall
		@GetMapping("/TypeEnseignement/liste")
		public List<TypeEnseignement> lesTypes(){
			return tpe.getTypes();
		}
		//find by id 
		@GetMapping("/TypeEnseignement/{id}")
		public Optional<TypeEnseignement> findType(@PathVariable Long id){
			return tpe.findType(id);
		}
		//insert 
		@PutMapping("/TypeEnseignement/cree")
		public TypeEnseignement creeType(@RequestBody TypeEnseignement type){
		
			return tpe.save(type);
		
		}
		//modifier
		@PutMapping("/TypeEnseignement/miseajour")
		public TypeEnseignement miseajourType(@RequestBody TypeEnseignement type){

			return tpe.update(type);
		
		}
		//chercher par type 
		@GetMapping("/TypeEnseignements/{ch}")
		public TypeEnseignement chercher(@PathVariable String ch){
			return tpe.trouver(ch);
		}

}
