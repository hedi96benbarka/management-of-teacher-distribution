package org.sid.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@Column(name="typeunite",unique=true)
	private String typeunite;
	
	/*@OneToMany
	private List<UniteEnseignement> lesUniter;

	public List<UniteEnseignement> getLesUniter() {
		return lesUniter;
	}

	public void setLesUniter(List<UniteEnseignement> lesUniter) {
		this.lesUniter = lesUniter;
	}*/

	public Type() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeunite() {
		return typeunite;
	}

	public void setTypeunite(String typeunite) {
		this.typeunite = typeunite;
	}
	
	

}
