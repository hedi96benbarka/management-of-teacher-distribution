package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.EnseigPermRepository;
import org.sid.Repristory.EnseignNonPerment;
import org.sid.entites.EnseignantNonPermenent;
import org.sid.entites.EnseignantPermanent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnseiganantNonPermenetServ {
	@Autowired
	private EnseignNonPerment ensPerRepo;
	
	
	public List<EnseignantNonPermenent> getAllEensPerm() {
		return  ensPerRepo.findAll();
	}
	public EnseignantNonPermenent creer(EnseignantNonPermenent ens)
	{
		return ensPerRepo.save(ens);
	}
	public Optional<EnseignantNonPermenent> findFamille(Long id) {
		return ensPerRepo.findById(id);
	}
	public EnseignantNonPermenent update(EnseignantNonPermenent fec) {
		return ensPerRepo.save(fec);
	}

}
