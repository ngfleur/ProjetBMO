package com.fleur.projetbmo.model;

import java.time.*;

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
public class EventSportif extends Identifiable {
	
	@Column
	@Required
	int duree;
	
	@Column
	@Required
	LocalDate dateDebut;
	
	@Column
	String score;
	
	@Column
	@Required
	Double cote;
	
	@Column
    String information;
	
	


}
