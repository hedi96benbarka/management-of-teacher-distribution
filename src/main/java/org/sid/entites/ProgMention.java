package org.sid.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class ProgMention {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*@Column(name="CodeMention",unique=true)
	private String CodeMention;*/
	
	//@JsonBackReference
	@ManyToOne
	//@JoinColumn(name = "mention_id")
	private Mention mention;
	//@JsonBackReference
	@ManyToOne
	//@JoinColumn(name = "programme_id")
	private Programme programme;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*public String getCodeMention() {
		return CodeMention;
	}

	public void setCodeMention(String codeMention) {
		CodeMention = codeMention;
	}*/

	public Mention getMention() {
		return mention;
	}

	public void setMention(Mention mention) {
		this.mention = mention;
	}

	

	public Programme getProg() {
		return programme;
	}

	public void setProg(Programme prog) {
		this.programme = prog;
	}
}
