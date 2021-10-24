package org.sid.entites;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DateRecrutement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="dateEmbuche",unique=true)
	private String dateEmbuche;
	
	@OneToMany
	private List<EnseignantPermanent> listeEnseignenets;

	public DateRecrutement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDateEmbuche() {
		return dateEmbuche;
	}

	public void setDateEmbuche(String dateEmbuche) {
		this.dateEmbuche = dateEmbuche;
	}

	public List<EnseignantPermanent> getListeEnseignenets() {
		return listeEnseignenets;
	}

	public void setListeEnseignenets(List<EnseignantPermanent> listeEnseignenets) {
		this.listeEnseignenets = listeEnseignenets;
	}
	
}
