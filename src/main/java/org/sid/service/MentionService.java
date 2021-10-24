package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.Repristory.MentionRepristory;
import org.sid.entites.Mention;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentionService {
	@Autowired
	private MentionRepristory mr;
	
	public List<Mention> getMention() {
		return mr.findAll();
	}

	public Optional<Mention> findMention(Long id) {
		return mr.findById(id);
	}

	public Mention save(Mention met) {
		return mr.save(met);
	}
	
	public Mention update(Mention met) {
		return mr.save(met);
	}
	
	public Mention trouver(String ch)
	{
		return mr.findByCodeMention(ch);
	}

}
