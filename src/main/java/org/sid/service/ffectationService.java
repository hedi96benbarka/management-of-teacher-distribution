package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.AffectationRepris;
import org.sid.entites.Affectation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ffectationService {
	@Autowired
	private AffectationRepris ars;
	
	public List<Affectation> getAffectation() {
		return ars.findAll();
	}
	public Optional<Affectation> findAffectation(Long id) {
		return ars.findById(id);
	}

	public Affectation save(Affectation aff) {
		return ars.save(aff);
	}
	
	public Affectation update(Affectation aff) {
		return ars.save(aff);
	}
	public Affectation trouver(int aff) {
		return ars.findByAnnéeuniversitaire(aff);
	}
	public void supprimer(Long  id) {
		 ars.deleteById(id);
	}
	
}
