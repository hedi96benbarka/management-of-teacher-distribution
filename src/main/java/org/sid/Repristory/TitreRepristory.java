package org.sid.Repristory;


import org.sid.entites.Titre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitreRepristory extends  JpaRepository<Titre,Long> {
	
	Titre findByNomtitre (String nomtitre);
}
