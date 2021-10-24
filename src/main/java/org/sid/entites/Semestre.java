package org.sid.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Semestre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="NumSemstre",unique=true)
	private int NumSemstre;
	
	@Column(name="nomSemestre",unique=true)
	private String nomSemestre;
	
	//@JsonBackReference
	@OneToMany
	private List<Programme> lesProgrammes;

	public Semestre() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumSemstre() {
		return NumSemstre;
	}

	public void setNumSemstre(int numSemstre) {
		NumSemstre = numSemstre;
	}

	public String getNomSemestre() {
		return nomSemestre;
	}

	public void setNomSemestre(String nomSemestre) {
		this.nomSemestre = nomSemestre;
	}

	public List<Programme> getLesProgrammes() {
		return lesProgrammes;
	}

	public void setLesProgrammes(List<Programme> lesProgrammes) {
		this.lesProgrammes = lesProgrammes;
	}

	
	
}
