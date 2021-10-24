package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.ProgMentInterface;
import org.sid.entites.ProgMention;
import org.sid.entites.Programme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgMentionServ {
	@Autowired 
	private ProgMentInterface progRepo ;
	
	public List<ProgMention> getProgmrames() {
		return progRepo.findAll();
	}

	public Optional<ProgMention> findProgramme(Long id) {
		return progRepo.findById(id);
	}

	public ProgMention save(ProgMention prog) {
		return progRepo.save(prog);
	}
	
	public ProgMention update(ProgMention prog) {
		return progRepo.save(prog);
	}

	

	public ProgMention enregistrer(ProgMention prog) {
		return progRepo.save(prog);
	}

}
