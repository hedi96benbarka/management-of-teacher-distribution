package org.sid.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.sid.Repristory.DateRepristory;
import org.sid.Repristory.TypeRepristory;
import org.sid.entites.DateRecrutement;
import org.sid.entites.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DateembaucheService {
	@Autowired
	private DateRepristory tpe;
	
	public List<DateRecrutement> getTypes() {
		return tpe.findAll();
	}

	public Optional<DateRecrutement> findType(Long id) {
		return tpe.findById(id);
	}

	public DateRecrutement save(DateRecrutement type) {
		return tpe.save(type);
	}
	
	public DateRecrutement update(DateRecrutement type) {
		return tpe.save(type);
	}
	public DateRecrutement chercher (String type) {
		return tpe.findByDateEmbuche(type);
	}

}
