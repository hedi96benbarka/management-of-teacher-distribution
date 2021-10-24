package org.sid.Repristory;

import java.util.Date;

import org.sid.entites.Converstion;
import org.sid.entites.DateRecrutement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateRepristory extends JpaRepository<DateRecrutement,Long>{
	DateRecrutement findByDateEmbuche(String dateEmbuche);

}
