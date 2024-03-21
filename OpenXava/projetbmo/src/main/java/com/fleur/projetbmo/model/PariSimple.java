package com.fleur.projetbmo.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

/**
 * This is an example of an entity.
 * 
 * Feel free feel to rename, modify or remove at your taste.
 */

@Entity @Getter @Setter
public class PariSimple extends Pari {
	
	@Column
	@Required
	String previsionsPS;
	

}
