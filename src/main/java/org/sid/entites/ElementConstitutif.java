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
public class ElementConstitutif {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="codelement",unique=true)
	private String codelement;
	
	@Column(name="nomelement ")
	private String nomelement ;
	
	@Column(name="regime")
	private String regime  ;
	
	@JsonBackReference
	@ManyToOne
	private UniteEnseignement unite;
	
	

	
	@ManyToOne 
	private FamilleElementConstitutif fam ;
	
	@OneToMany
	private List<TypeEnseignement> lesTypes;
	

	public List<TypeEnseignement> getLesTypes() {
		return lesTypes;
	}

	public void setLesTypes(List<TypeEnseignement> lesTypes) {
		this.lesTypes = lesTypes;
	}

	public UniteEnseignement getUnite() {
		return unite;
	}

	public FamilleElementConstitutif getFam() {
		return fam;
	}

	public void setFam(FamilleElementConstitutif fam) {
		this.fam = fam;
	}

	public void setUnite(UniteEnseignement unite) {
		this.unite = unite;
	}

	public ElementConstitutif() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodelement() {
		return codelement;
	}

	public void setCodelement(String codelement) {
		this.codelement = codelement;
	}

	public String getNomelement() {
		return nomelement;
	}

	public void setNomelement(String nomelement) {
		this.nomelement = nomelement;
	}

	public String getRegime() {
		return regime;
	}

	public void setRegime(String regime) {
		this.regime = regime;
	}
	
	
	
	
	
	

}
