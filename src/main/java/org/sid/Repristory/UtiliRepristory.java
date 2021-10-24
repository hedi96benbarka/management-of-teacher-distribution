package org.sid.Repristory;

import org.sid.entites.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtiliRepristory extends JpaRepository<Utilisateur,Long>  {
	
	Utilisateur findByPassword(String password);
	
}
