package org.sid.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class FamilleElementConstitutif {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="nomfamille",unique=true)
	private String nomfamille;
	
	//@JsonBackReference
	@OneToMany
	private List<ElementConstitutif> leselements;


	public FamilleElementConstitutif() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomfamille() {
		return nomfamille;
	}


	public void setNomfamille(String nomfamille) {
		this.nomfamille = nomfamille;
	}


	public List<ElementConstitutif> getLeselements() {
		return leselements;
	}


	public void setLeselements(List<ElementConstitutif> leselements) {
		this.leselements = leselements;
	}
	

}
