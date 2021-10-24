package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.TypeRepristory;
import org.sid.entites.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeService {
	@Autowired
	private TypeRepristory tpe;
	
	
	public List<Type> getTypes() {
		return tpe.findAll();
	}

	public Optional<Type> findType(Long id) {
		return tpe.findById(id);
	}

	public Type save(Type type) {
		return tpe.save(type);
	}
	
	public Type update(Type type) {
		return tpe.save(type);
	}

}
