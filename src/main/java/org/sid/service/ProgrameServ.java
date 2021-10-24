package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.ProgrammeRepo;
import org.sid.entites.Programme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgrameServ {
	@Autowired
	private ProgrammeRepo progRepo;

	public List<Programme> getProgmrames() {
		return progRepo.findAll();
	}

	public Optional<Programme> findProgramme(Long id) {
		return progRepo.findById(id);
	}

	public Programme save(Programme prog) {
		return progRepo.save(prog);
	}
	
	public Programme update(Programme prog) {
		return progRepo.save(prog);
	}

	public Programme findbycode(String code) {
		return progRepo.findByCodePro(code);
	}

	public Programme enregistrer(Programme prog) {
		return progRepo.save(prog);
	}
	public Programme trouver (String ch)
	{
		return progRepo.findByCodePro(ch);
	}
	public Programme rest (String ch)
	{
		return progRepo.findByNomPro(ch);
	}

}
