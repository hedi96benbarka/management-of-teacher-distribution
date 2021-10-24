package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.UntieRepris;
import org.sid.Repristory.UtiliRepristory;
import org.sid.entites.UniteEnseignement;
import org.sid.entites.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilService {
	@Autowired 
	private UtiliRepristory ute;
	 
	public List<Utilisateur> getUnite() {
		return ute.findAll();
	}
	public Optional<Utilisateur> findUnite(Long id) {
		return ute.findById(id);
	}

	public Utilisateur save(Utilisateur unite) {
		return ute.save(unite);
	}
	
	public Utilisateur update(Utilisateur unite) {
		return ute.save(unite);
	}
	public Utilisateur trouv(String pass)
	{
		return ute.findByPassword(pass);
	}



	

}
