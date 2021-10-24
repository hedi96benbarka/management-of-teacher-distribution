package org.sid.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Enseignant")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract  class Enseignant   implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="cin",unique=true)
	private String cin;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom ;
	
	@Column(name="email")
	private String email ;
	
	@Column(name="etat")
	private String etat ;
	
	@OneToMany
	private List<ElementConstitutif> Leselementsensegi;

	public List<ElementConstitutif> getLeselementsensegi() {
		return Leselementsensegi;
	}

	public void setLeselementsensegi(List<ElementConstitutif> leselementsensegi) {
		Leselementsensegi = leselementsensegi;
	}

	public Enseignant() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

}
