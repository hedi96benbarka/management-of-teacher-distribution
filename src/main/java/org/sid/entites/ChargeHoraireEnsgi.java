package org.sid.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ChargeHoraireEnsgi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@Column(name="nbrgroupe")
	private int nbrgroupe;
	
	@Column(name="volHoraire")
	private double  volHoraire;
	
	@ManyToOne
	private TypeEnseignement type;
	
	@ManyToOne
	private ElementConstitutif elt;

	public ChargeHoraireEnsgi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNbrgroupe() {
		return nbrgroupe;
	}

	public void setNbrgroupe(int nbrgroupe) {
		this.nbrgroupe = nbrgroupe;
	}

	public double getVolHoraire() {
		return volHoraire;
	}

	public void setVolHoraire(double volHoraire) {
		this.volHoraire = volHoraire;
	}

	public TypeEnseignement getType() {
		return type;
	}

	public void setType(TypeEnseignement type) {
		this.type = type;
	}

	public ElementConstitutif getElt() {
		return elt;
	}

	public void setElt(ElementConstitutif elt) {
		this.elt = elt;
	}

}
