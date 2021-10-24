package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.ChargeHoraireRepristory;
import org.sid.entites.ChargeHoraireEnsgi;
import org.sid.entites.ElementConstitutif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChargeHoraireEnsgiService {
	@Autowired
	private ChargeHoraireRepristory elc ;
	
	public List<ChargeHoraireEnsgi> getElementConsectuif() {
		return elc.findAll();
	}

	public Optional<ChargeHoraireEnsgi> findElementConsectuif(Long id) {
		return elc.findById(id);
	}

	public ChargeHoraireEnsgi save(ChargeHoraireEnsgi eltc) {
		return elc.save(eltc);
	}
	
	public ChargeHoraireEnsgi update(ChargeHoraireEnsgi eltc) {
		return elc.save(eltc);
	}
}
