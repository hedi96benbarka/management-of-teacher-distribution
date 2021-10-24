package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.FamilleElementRepristory;
import org.sid.entites.FamilleElementConstitutif;
import org.sid.entites.Programme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilleElementConsectuifServ {
	@Autowired
	private FamilleElementRepristory fer;
	//findall
	public List<FamilleElementConstitutif> getFamille() {
		return fer.findAll();
	}
//find by id 
	public Optional<FamilleElementConstitutif> findFamille(Long id) {
		return fer.findById(id);
	}
//insert
	public FamilleElementConstitutif save(FamilleElementConstitutif fec) {
		return fer.save(fec);
	}
	//modifier
	public FamilleElementConstitutif update(FamilleElementConstitutif fec) {
		return fer.save(fec);
	}
	public FamilleElementConstitutif findbynom(String ch) {
	
		return fer.findByNomfamille(ch);
	}

}
