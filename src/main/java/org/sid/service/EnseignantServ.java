package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.EnsiegnantRepristory;
import org.sid.Repristory.ProgrammeRepo;
import org.sid.entites.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnseignantServ{
	
	@Autowired
	private EnsiegnantRepristory progRepo;

	public List<Enseignant> getProgmrames() {
		return progRepo.findAll();
	}

	public Optional<Enseignant> findProgramme(Long id) {
		return progRepo.findById(id);
	}

	public Enseignant save(Enseignant prog) {
		return progRepo.save(prog);
	}
	
	public Enseignant update(Enseignant prog) {
		return progRepo.save(prog);
	}


}
