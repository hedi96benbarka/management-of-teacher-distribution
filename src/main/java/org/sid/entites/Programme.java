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
public class Programme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="codepro",unique=true)
	private String codePro;
	
	@Column(name="nompro",unique=false)
	private String nomPro;
	
	@Column(name="nbrunite",unique=false)
	private int nbrunite;
	 
	@Column(name="etat",unique=false)
	private Boolean etat;

	//@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<UniteEnseignement> lesUniter;
	
	//@OneToMany(mappedBy = "student")
	//private List<Mention> lesMention;
	//@JsonBackReference

	
	
	
	
	@ManyToOne
	private Semestre symestre;
	
	@OneToMany
	private List<Affectation> lesaffectation;
	
	@ManyToOne
	private Mention ment;
	
	
	
	
	



	public Mention getMent() {
		return ment;
	}

	public void setMent(Mention ment) {
		this.ment = ment;
	}

	public List<Affectation> getLesaffectation() {
		return lesaffectation;
	}

	public void setLesaffectation(List<Affectation> lesaffectation) {
		this.lesaffectation = lesaffectation;
	}

	public Programme() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodePro() {
		return codePro;
	}

	public void setCodePro(String codePro) {
		this.codePro = codePro;
	}

	public String getNomPro() {
		return nomPro;
	}

	public void setNomPro(String nomPro) {
		this.nomPro = nomPro;
	}

	public int getNbrunite() {
		return nbrunite;
	}

	public void setNbrunite(int nbrunite) {
		this.nbrunite = nbrunite;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	public List<UniteEnseignement> getLesUniter() {
		return lesUniter;
	}

	public void setLesUniter(List<UniteEnseignement> lesUniter) {
		this.lesUniter = lesUniter;
	}

	public Semestre getSymestre() {
		return symestre;
	}

	public void setSymestre(Semestre symestre) {
		this.symestre = symestre;
	}

	@Override
	public String toString() {
		return "Programme [id=" + id + ", codePro=" + codePro + ", nomPro=" + nomPro + ", nbrunite=" + nbrunite
				+ ", etat=" + etat + ", lesUniter=" + lesUniter + ", symestre=" + symestre + "]";
	}

	
	
	
	
}
