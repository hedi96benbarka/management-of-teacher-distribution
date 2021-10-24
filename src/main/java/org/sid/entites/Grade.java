package org.sid.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Grade {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="codegrade",unique=true)
	private String codegrade;
	
	
	@Column(name="nomgrade",unique=true)
	private String nomgrade;
	  
	@OneToOne
	public ChargeHoraire otherInfo;
	
	
	public ChargeHoraire getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(ChargeHoraire otherInfo) {
		this.otherInfo = otherInfo;
	}

	@OneToMany
	private List<EnseignantPermanent> lesenseignantsGrades;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodegrade() {
		return codegrade;
	}

	public void setCodegrade(String codegrade) {
		this.codegrade = codegrade;
	}

	public String getNomgrade() {
		return nomgrade;
	}

	public void setNomgrade(String nomgrade) {
		this.nomgrade = nomgrade;
	}

	public List<EnseignantPermanent> getLesenseignantsGrades() {
		return lesenseignantsGrades;
	}

	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setLesenseignantsGrades(List<EnseignantPermanent> lesenseignantsGrades) {
		this.lesenseignantsGrades = lesenseignantsGrades;
	}
}
