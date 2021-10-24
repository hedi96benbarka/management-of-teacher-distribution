package org.sid.entites;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "EnseignantPermanent")
@PrimaryKeyJoinColumn(name = "id")

public class EnseignantPermanent extends Enseignant {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="observation",unique=true)
	private String observation;
	
	@ManyToOne
	private Grade grade;
	@ManyToOne
	private DateRecrutement dte;
	
	public DateRecrutement getDte() {
		return dte;
	}

	public void setDte(DateRecrutement dte) {
		this.dte = dte;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public EnseignantPermanent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	
}
