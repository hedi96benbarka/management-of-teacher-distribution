package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.TypeEnseignantRp;
import org.sid.entites.TypeEnseignement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeEnseignementServ {
	@Autowired
	private TypeEnseignantRp tp ;
	
	public List<TypeEnseignement> getTypes() {
		return  tp.findAll();
	}

	public Optional<TypeEnseignement> findType(Long id) {
		return   tp.findById(id);
	}

	public TypeEnseignement save(TypeEnseignement type) {
		return  tp.save(type);
	}
	
	public TypeEnseignement update(TypeEnseignement type) {
       return tp.save(type);
}
	public TypeEnseignement trouver(String type)
	{
		return tp.findByType(type);
	}
	
}
