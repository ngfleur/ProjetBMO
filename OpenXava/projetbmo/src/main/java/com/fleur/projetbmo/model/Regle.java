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
public class Regle extends Identifiable {
	
	@Column
	@Required
	String nomRegle;
	
	@ManyToOne(optional=false)
	Sport sport;
}
