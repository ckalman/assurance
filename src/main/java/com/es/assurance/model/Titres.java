package com.es.assurance.model;
// Generated 4 nov. 2015 21:54:52 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Titres generated by hbm2java
 */
public class Titres implements java.io.Serializable {

	private Integer id;
	private String titre;
	private String description;
	private Set<TitreMedecin> titreMedecins = new HashSet<TitreMedecin>(0);

	public Titres() {
	}

	public Titres(String titre, String description) {
		this.titre = titre;
		this.description = description;
	}

	public Titres(String titre, String description, Set<TitreMedecin> titreMedecins) {
		this.titre = titre;
		this.description = description;
		this.titreMedecins = titreMedecins;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<TitreMedecin> getTitreMedecins() {
		return this.titreMedecins;
	}

	public void setTitreMedecins(Set<TitreMedecin> titreMedecins) {
		this.titreMedecins = titreMedecins;
	}

}