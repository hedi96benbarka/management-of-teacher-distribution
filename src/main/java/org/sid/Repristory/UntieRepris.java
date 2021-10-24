package org.sid.Repristory;

import org.sid.entites.Programme;
import org.sid.entites.UniteEnseignement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UntieRepris  extends JpaRepository<UniteEnseignement, Long>{
	UniteEnseignement findFirstByOrderByIdDesc();

	UniteEnseignement findByNomunite (String nomUnit);
}
