package org.sid.Repristory;

import org.sid.entites.Parcours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcoursRepristory extends JpaRepository<Parcours,Integer> {
	Parcours findBynomparcour(String nomparcour);
}
