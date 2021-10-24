package org.sid.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Mention {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="codeMention",unique=true)
	private String codeMention;

	
	
	
    
	//@OneToMany
	//private List<Programme> lesprogrammes;
	//@JsonBackReference
	@OneToMany
	private List<Parcours> parcours;
	
	
	@OneToMany
	private List<Programme> lesprogrammes;
	
	






	/*public List<Programme> getLesprogrammes() {
		return lesprogrammes;
	}


	public void setLesprogrammes(List<Programme> lesMention) {
		this.lesprogrammes = lesMention;
	}
*/

	public List<Programme> getLesprogrammes() {
		return lesprogrammes;
	}


	public void setLesprogrammes(List<Programme> lesprogrammes) {
		this.lesprogrammes = lesprogrammes;
	}


	public List<Parcours> getParcours() {
		return parcours;
	}


	public void setParcours(List<Parcours> parcours) {
		this.parcours = parcours;
	}


	public Mention() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodeMention() {
		return codeMention;
	}


	public void setCodeMention(String codeMention) {
		this.codeMention = codeMention;
	}

}
