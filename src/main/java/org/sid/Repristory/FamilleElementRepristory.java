package org.sid.Repristory;

import org.sid.entites.FamilleElementConstitutif;
import org.sid.entites.Programme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilleElementRepristory extends JpaRepository<FamilleElementConstitutif,Long> {
	FamilleElementConstitutif findByNomfamille(String nomfamille) ;
	
}
