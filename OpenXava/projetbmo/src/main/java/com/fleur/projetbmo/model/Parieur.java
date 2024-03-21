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
public class Parieur extends Identifiable {
	
	@Column
	@Required
	String nom;
	
	@Column
	@Required
	String email;
	
	@Column
	@Required
	String login;
	
	@Column
	@Required
    Double jetons;

}
