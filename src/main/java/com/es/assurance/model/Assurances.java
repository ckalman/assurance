package com.es.assurance.model;
// Generated 8 nov. 2015 22:21:35 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Assurances generated by hbm2java
 */
public class Assurances implements java.io.Serializable {

	private Integer id;
	private AssurancesAnnee assurancesAnnee;
	private PolicesAssurance policesAssurance;
	private String numeroPolice;
	private boolean resiliation;
	private Set<Couvertures> couvertureses = new HashSet<Couvertures>(0);

	public Assurances() {
	}

	public Assurances(AssurancesAnnee assurancesAnnee, PolicesAssurance policesAssurance, String numeroPolice,
			boolean resiliation) {
		this.assurancesAnnee = assurancesAnnee;
		this.policesAssurance = policesAssurance;
		this.numeroPolice = numeroPolice;
		this.resiliation = resiliation;
	}

	public Assurances(AssurancesAnnee assurancesAnnee, PolicesAssurance policesAssurance, String numeroPolice,
			boolean resiliation, Set<Couvertures> couvertureses) {
		this.assurancesAnnee = assurancesAnnee;
		this.policesAssurance = policesAssurance;
		this.numeroPolice = numeroPolice;
		this.resiliation = resiliation;
		this.couvertureses = couvertureses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AssurancesAnnee getAssurancesAnnee() {
		return this.assurancesAnnee;
	}

	public void setAssurancesAnnee(AssurancesAnnee assurancesAnnee) {
		this.assurancesAnnee = assurancesAnnee;
	}

	public PolicesAssurance getPolicesAssurance() {
		return this.policesAssurance;
	}

	public void setPolicesAssurance(PolicesAssurance policesAssurance) {
		this.policesAssurance = policesAssurance;
	}

	public String getNumeroPolice() {
		return this.numeroPolice;
	}

	public void setNumeroPolice(String numeroPolice) {
		this.numeroPolice = numeroPolice;
	}

	public boolean isResiliation() {
		return this.resiliation;
	}

	public void setResiliation(boolean resiliation) {
		this.resiliation = resiliation;
	}

	public Set<Couvertures> getCouvertureses() {
		return this.couvertureses;
	}

	public void setCouvertureses(Set<Couvertures> couvertureses) {
		this.couvertureses = couvertureses;
	}

}
