package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.EnseigPermRepository;
import org.sid.entites.Enseignant;
import org.sid.entites.EnseignantPermanent;
import org.sid.entites.FamilleElementConstitutif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnsPerService {
	@Autowired
	private EnseigPermRepository ensPerRepo;

	public List<EnseignantPermanent> getAllEensPerm() {
		return  ensPerRepo.findAll();
	}

	public EnseignantPermanent creer(EnseignantPermanent ens)
	{
		return ensPerRepo.save(ens);
	}
	public Optional<EnseignantPermanent> findFamille(Long id) {
		return ensPerRepo.findById(id);
	}
	public EnseignantPermanent update(EnseignantPermanent fec) {
		return ensPerRepo.save(fec);
	}
	
}
