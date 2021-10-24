package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.TitreRepristory;
import org.sid.entites.Titre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitreService {
	@Autowired
	private TitreRepristory titre ;
	public List<Titre> getProgmrames() {
		return titre.findAll();
	}

	public Optional<Titre> findProgramme(Long id) {
		return titre.findById(id);
	}

	public Titre save(Titre prog) {
		return titre.save(prog);
	}
	
	public Titre update(Titre prog) {
		return titre.save(prog);
	}
	public Titre find(String ch)
	{
		return titre.findByNomtitre(ch);
	}

}
