package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.ConversionInterface;
import org.sid.entites.ChargeHoraireEnsgi;
import org.sid.entites.Converstion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConverstionServ {
	@Autowired
	private ConversionInterface elc ;
	
	public List<Converstion> getElementConsectuif() {
		return elc.findAll();
	}

	public Optional<Converstion> findElementConsectuif(Long id) {
		return elc.findById(id);
	}

	public Converstion save(Converstion eltc) {
		return elc.save(eltc);
	}
	
	public Converstion update(Converstion eltc) {
		return elc.save(eltc);
	}
	
	

}
