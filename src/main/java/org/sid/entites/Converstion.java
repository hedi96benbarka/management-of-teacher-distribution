package org.sid.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Converstion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	  
	
	@Column(name="taux",unique=true)
	private double taux;


	public Converstion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getTaux() {
		return taux;
	}


	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	

}
