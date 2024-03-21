package com.fleur.projetbmo.model;

import java.util.*;

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
public class Sport extends Identifiable {
	
	@Column
	@Required
	String nomSport;
	
	@OneToMany(mappedBy="sport")
	Collection<Regle> regles;
	
	@OneToMany(mappedBy="sport")
	Collection<EventSportif> eventSportifs;
	
	
	
}	
