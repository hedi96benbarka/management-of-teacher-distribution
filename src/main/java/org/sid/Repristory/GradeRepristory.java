package org.sid.Repristory;

import org.sid.entites.Grade;
import org.sid.entites.Mention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepristory extends JpaRepository<Grade,Long> {
	Grade findByNomgrade (String nomgrade) ;

}
