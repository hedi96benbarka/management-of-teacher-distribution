package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.SmestreRepristor;
import org.sid.entites.Programme;
import org.sid.entites.Semestre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemestreService {
	@Autowired
	private SmestreRepristor sem ;

	public List<Semestre> getSemestres() {
		return sem.findAll();
	}

	public Optional<Semestre> findSemestre(Long id) {
		return sem.findById(id);
	}
	
	public Semestre save(Semestre semestre) {
		return sem.save(semestre);
	}
	
	public 	Semestre update(Semestre semestre) {
		return sem.save(semestre);
	}
	
	
	

}
