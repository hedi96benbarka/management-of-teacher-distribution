package org.sid.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TypeEnseignement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="type",unique=true)
	private String type;
	

	
	
	@OneToMany
	private List<ChargeHoraireEnsgi> lesCharges;  
	
	
	public List<ChargeHoraireEnsgi> getLesCharges() {
		return lesCharges;
	}

	public void setLesCharges(List<ChargeHoraireEnsgi> lesCharges) {
		this.lesCharges = lesCharges;
	}

	@OneToMany
	private List<ElementConstitutif> lesElement;
	/*
	@OneToMany(mappedBy = "proprietaire",
			cascade = {CascadeType.ALL }, fetch = FetchType.LAZY)
			private List<TypeEnseignement> listTypeEnseignement;

			@ManyToOne (fetch = FetchType.LAZY)
			private TypeEnseignement proprietaire;	
  */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<ElementConstitutif> getLesElement() {
		return lesElement;
	}

	public void setLesElement(List<ElementConstitutif> lesElement) {
		this.lesElement = lesElement;
	}

	public TypeEnseignement() {
		super();
		
	}

	

}
