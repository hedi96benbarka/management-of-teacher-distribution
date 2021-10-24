package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.ParcoursRepristory;
import org.sid.entites.Parcours;
import org.sid.entites.Programme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParcoursService {
	@Autowired 
	private ParcoursRepristory parc;

	public List<Parcours> getParcours() {
		return parc.findAll();
	}

	public Optional<Parcours> findParcours(int id) {
		return parc.findById(id);
	}
	public Parcours trouve(String ch )
	{
		return parc.findBynomparcour(ch);
	}

	public Parcours save(Parcours part) {
		return parc.save(part);
	}
	
	public Parcours update(Parcours part) {
		return parc.save(part);
	}

}
