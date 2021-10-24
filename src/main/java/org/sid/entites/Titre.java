package org.sid.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Titre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="codetitre",unique=true)
	private String codetitre;
	
	@Column(name="nomtitre",unique=false)
	private String nomtitre;
	  
	@JsonBackReference
	@OneToMany
	private List<EnseignantNonPermenent> lesenseginents;

	public Titre() {
		super();
	}

	public List<EnseignantNonPermenent> getLesenseginents() {
		return lesenseginents;
	}

	public void setLesenseginents(List<EnseignantNonPermenent> lesenseginents) {
		this.lesenseginents = lesenseginents;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodetitre() {
		return codetitre;
	}

	public void setCodetitre(String codetitre) {
		this.codetitre = codetitre;
	}

	public String getNomtitre() {
		return nomtitre;
	}

	public void setNomtitre(String nomtitre) {
		this.nomtitre = nomtitre;
	}
	
}
