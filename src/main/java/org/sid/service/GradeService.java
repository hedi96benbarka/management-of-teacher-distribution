package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.AffectationRepris;
import org.sid.Repristory.GradeRepristory;
import org.sid.entites.Grade;
import org.sid.entites.Parcours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
	@Autowired
	private GradeRepristory ars;
	
	
	public List<Grade> getParcours() {
		return ars.findAll();
	}

	public Optional<Grade> findParcours(Long id) {
		return ars.findById(id);
	}
	public Grade trouve(String ch )
	{
		return ars.findByNomgrade(ch);
	}

	public Grade save(Grade part) {
		return ars.save(part);
	}
	
	public Grade update(Grade part) {
		return ars.save(part);
	}
}
