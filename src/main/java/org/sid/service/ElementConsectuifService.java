package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.ElemenetConsectuifRepristory;
import org.sid.entites.ElementConstitutif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementConsectuifService {
	@Autowired
	private ElemenetConsectuifRepristory elc;

	
	public List<ElementConstitutif> getElementConsectuif() {
		return elc.findAll();
	}

	public Optional<ElementConstitutif> findElementConsectuif(Long id) {
		return elc.findById(id);
	}

	public ElementConstitutif save(ElementConstitutif eltc) {
		return elc.save(eltc);
	}
	
	public ElementConstitutif update(ElementConstitutif eltc) {
		return elc.save(eltc);
	}
	/*public ElementConstitutif trouver(String nomfamille)
	{
		return elc.findByNomfamille(nomfamille);
				
	}*/
	

}
