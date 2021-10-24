package org.sid.Repristory;

import org.sid.entites.TypeEnseignement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeEnseignantRp  extends JpaRepository<TypeEnseignement,Long> {
	TypeEnseignement findByType (String type );

}
