package org.sid.Repristory;

import org.sid.entites.Affectation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AffectationRepris extends JpaRepository<Affectation,Long> {
	Affectation findByAnnéeuniversitaire (int annéeuniversitaire);

}
