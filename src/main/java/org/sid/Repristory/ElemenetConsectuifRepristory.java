package org.sid.Repristory;

import org.sid.entites.ElementConstitutif;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElemenetConsectuifRepristory extends JpaRepository<ElementConstitutif, Long> {
	ElementConstitutif findByUniteLeselementsCodelement(String codelement);
}
