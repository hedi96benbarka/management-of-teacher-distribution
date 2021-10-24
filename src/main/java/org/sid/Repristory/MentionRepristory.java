package org.sid.Repristory;

import org.sid.entites.Mention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentionRepristory extends JpaRepository<Mention,Long> {
	Mention findByCodeMention (String codeMention) ;
}
