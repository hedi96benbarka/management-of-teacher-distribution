package org.sid.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ChargeHoraire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	/*@OneToOne(mappedBy="otherInfo")
	public Grade grade;*/

	@Column(name="chargehorairesemstre")
	private double chargehorairesemstre;
	

	@Column(name="chargeSupMax")
	private double chargeSupMax;
	
	
	@ManyToOne
	private TypeEnseignement TypeEnseignement;
	

	public TypeEnseignement getTypeEnseignement() {
		return TypeEnseignement;
	}


	/*public Grade getGrade() {
		return grade;
	}


	public void setGrade(Grade grade) {
		this.grade = grade;
	}*/


	public void setTypeEnseignement(TypeEnseignement typeEnseignement) {
		TypeEnseignement = typeEnseignement;
	}


	public ChargeHoraire() {
		super();
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getChargehorairesemstre() {
		return chargehorairesemstre;
	}


	public void setChargehorairesemstre(double chargehorairesemstre) {
		this.chargehorairesemstre = chargehorairesemstre;
	}


	public double getChargeSupMax() {
		return chargeSupMax;
	}


	public void setChargeSupMax(double chargeSupMax) {
		this.chargeSupMax = chargeSupMax;
	}
	
	
	
	
	
	

}
