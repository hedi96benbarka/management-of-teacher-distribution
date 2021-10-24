package org.sid.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class UniteEnseignement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="codeunit")
	private String codeUnit;
	
	@Column(name="nomunite")
	private String nomunite;
	
	//@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ElementConstitutif> leselements;
	
	//@JsonBackReference
	@ManyToOne
	private  Programme prog;
	
	public Programme getProg() {
		return prog;
	}

	public void setProg(Programme prog) {
		this.prog = prog;
	}

	@ManyToOne
	private Type typeUe;
	
	public List<ElementConstitutif> getLeselements() {
		return leselements;
	}

	public void setLeselements(List<ElementConstitutif> leselements) {
		this.leselements = leselements;
	}

	public UniteEnseignement() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeUnit() {
		return codeUnit;
	}

	public void setCodeUnit(String codeUnit) {
		this.codeUnit = codeUnit;
	}

	public String getNomunite() {
		return nomunite;
	}

	public void setNomunite(String nomunite) {
		this.nomunite = nomunite;
	}

	public Type getTypeUe() {
		return typeUe;
	}

	public void setTypeUe(Type typeUe) {
		this.typeUe = typeUe;
	}

	@Override
	public String toString() {
		return "UniteEnseignement [id=" + id + ", codeUnit=" + codeUnit + ", nomunite=" + nomunite + ", leselements="
				+ leselements + ", prog=" + prog + ", typeUe=" + typeUe + "]";
	}
	
	
	

	
}
