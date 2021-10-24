package org.sid.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Affectation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="annéeuniversitaire")
	private int annéeuniversitaire;
	
	@Column(name="nbrgroupec")
	private int nbrgroupec;
	
	@Column(name="nbrgroupetd")
	private int nbrgroupetd;
	
	
	@Column(name="nbrgroupetp")
	private int nbrgroupetp;
	
	@ManyToOne
	private Programme progs;

	public Programme getProgs() {
		return progs;
	}

	public void setProgs(Programme progs) {
		this.progs = progs;
	}

	public Affectation() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAnnéeuniversitaire() {
		return annéeuniversitaire;
	}

	public void setAnnéeuniversitaire(int annéeuniversitaire) {
		this.annéeuniversitaire = annéeuniversitaire;
	}

	public int getNbrgroupec() {
		return nbrgroupec;
	}

	public void setNbrgroupec(int nbrgroupec) {
		this.nbrgroupec = nbrgroupec;
	}

	public int getNbrgroupetd() {
		return nbrgroupetd;
	}

	public void setNbrgroupetd(int nbrgroupetd) {
		this.nbrgroupetd = nbrgroupetd;
	}

	public void setNbrgroupetp(int nbrgroupetp) {
		this.nbrgroupetp = nbrgroupetp;
	}

	public int getNbrgroupetp() {
		return nbrgroupetp;
	}



	
	
	

}
