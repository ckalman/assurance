package com.es.assurance.model;
// Generated 4 nov. 2015 21:54:52 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Complementaires generated by hbm2java
 */
public class Complementaires implements java.io.Serializable {

	private Integer id;
	private String nom;
	private String description;
	private Set<AssurancesAnnee> assurancesAnnees = new HashSet<AssurancesAnnee>(0);

	public Complementaires() {
	}

	public Complementaires(String nom, String description) {
		this.nom = nom;
		this.description = description;
	}

	public Complementaires(String nom, String description, Set<AssurancesAnnee> assurancesAnnees) {
		this.nom = nom;
		this.description = description;
		this.assurancesAnnees = assurancesAnnees;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<AssurancesAnnee> getAssurancesAnnees() {
		return this.assurancesAnnees;
	}

	public void setAssurancesAnnees(Set<AssurancesAnnee> assurancesAnnees) {
		this.assurancesAnnees = assurancesAnnees;
	}

}