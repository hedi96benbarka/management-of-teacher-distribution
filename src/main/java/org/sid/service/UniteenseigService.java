package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.UntieRepris;
import org.sid.entites.UniteEnseignement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniteenseigService {
	@Autowired 
	private UntieRepris ute;
	 
	public List<UniteEnseignement> getUnite() {
		return ute.findAll();
	}
	public Optional<UniteEnseignement> findUnite(Long id) {
		return ute.findById(id);
	}

	public UniteEnseignement save(UniteEnseignement unite) {
		return ute.save(unite);
	}
	
	public UniteEnseignement update(UniteEnseignement unite) {
		return ute.save(unite);
	}
	public UniteEnseignement genereuniteCode() {
		return ute.findFirstByOrderByIdDesc();
	}
	public UniteEnseignement findbycode(String codeUnit) {
		
		return ute.findByNomunite(codeUnit);
	}

	

}
