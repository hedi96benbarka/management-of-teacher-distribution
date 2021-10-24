package org.sid.Repristory;

import org.sid.entites.EnseignantNonPermenent;
import org.sid.entites.EnseignantPermanent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignNonPerment extends JpaRepository<EnseignantNonPermenent, Long> {

}
