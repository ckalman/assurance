package com.es.assurance.model;
// Generated 4 nov. 2015 21:54:52 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Bases generated by hbm2java
 */
public class Bases implements java.io.Serializable {

	private Integer id;
	private float franchise;
	private Set<AssurancesAnnee> assurancesAnnees = new HashSet<AssurancesAnnee>(0);

	public Bases() {
	}

	public Bases(float franchise) {
		this.franchise = franchise;
	}

	public Bases(float franchise, Set<AssurancesAnnee> assurancesAnnees) {
		this.franchise = franchise;
		this.assurancesAnnees = assurancesAnnees;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getFranchise() {
		return this.franchise;
	}

	public void setFranchise(float franchise) {
		this.franchise = franchise;
	}

	public Set<AssurancesAnnee> getAssurancesAnnees() {
		return this.assurancesAnnees;
	}

	public void setAssurancesAnnees(Set<AssurancesAnnee> assurancesAnnees) {
		this.assurancesAnnees = assurancesAnnees;
	}

}
