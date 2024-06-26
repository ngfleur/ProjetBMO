package com.fleur.projetbmo.model;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

/**
 * This is an example of an entity.
 * 
 * Feel free feel to rename, modify or remove at your taste.
 */

@Entity @Getter @Setter
public abstract class Pari extends Identifiable {
	
	@Column
	@Required
	String resultatPari;
	
	@Column
	@Required
	Double mise;
	
	@Column
	@Required
	String vainqueur;
	
	@Column
    Double delai;
	
	@ManyToOne(optional=false)
	EventSportif eventSportif ;
	
	@ManyToOne(optional=false)
	Parieur parieur ;
}
