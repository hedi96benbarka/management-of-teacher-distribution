package org.sid.entites;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "EnseignantNonPermanent")
@PrimaryKeyJoinColumn(name = "id")

public class EnseignantNonPermenent extends Enseignant {

	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Titre titre;

	public Titre getTitre() {
		return titre;
	}

	public void setTitre(Titre titre) {
		this.titre = titre;
	}

	public EnseignantNonPermenent() {
		super();
	}

	
}
