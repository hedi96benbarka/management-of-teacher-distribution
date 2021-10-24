package org.sid.Repristory;

import org.sid.entites.Programme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammeRepo extends JpaRepository<Programme, Long>{
   
	Programme findByNomPro(String id);
	Programme findByCodePro(String id);
	Programme findByLesUniterId(long id);
}
