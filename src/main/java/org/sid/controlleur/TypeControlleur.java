package org.sid.controlleur;

import java.util.List;
import java.util.Optional;


import org.sid.entites.Type;
import org.sid.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class TypeControlleur {
	@Autowired
	private TypeService tpe;
	
	//findall
	@GetMapping("/Type/liste")
	public List<Type> lesTypes(){
		return tpe.getTypes();	
	}
	//find by id 
	@GetMapping("/Type/{id}")
	public Optional<Type> findType(@PathVariable Long id){
		return tpe.findType(id);
	}
	//insert 
	@PutMapping("/Type/cree")
	public Type creeType(@RequestBody Type type){
	
		return tpe.save(type);
	
	}
	//modifier
	@PutMapping("/Type/miseajour")
	public Type miseajourType(@RequestBody Type type){

		return tpe.update(type);
	
	}
	
	

}
