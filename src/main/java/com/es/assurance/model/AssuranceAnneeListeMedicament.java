package com.es.assurance.model;
// Generated 8 nov. 2015 22:21:35 by Hibernate Tools 4.3.1.Final

/**
 * AssuranceAnneeListeMedicament generated by hbm2java
 */
public class AssuranceAnneeListeMedicament implements java.io.Serializable {

	private Integer id;
	private AssurancesAnnee assurancesAnnee;
	private ListesMedicament listesMedicament;

	public AssuranceAnneeListeMedicament() {
	}

	public AssuranceAnneeListeMedicament(AssurancesAnnee assurancesAnnee, ListesMedicament listesMedicament) {
		this.assurancesAnnee = assurancesAnnee;
		this.listesMedicament = listesMedicament;
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

	public ListesMedicament getListesMedicament() {
		return this.listesMedicament;
	}

	public void setListesMedicament(ListesMedicament listesMedicament) {
		this.listesMedicament = listesMedicament;
	}

}
