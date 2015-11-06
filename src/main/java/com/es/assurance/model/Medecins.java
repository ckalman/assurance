package com.es.assurance.model;
// Generated 4 nov. 2015 21:54:52 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Medecins generated by hbm2java
 */
public class Medecins implements java.io.Serializable {

	private Integer id;
	private String nom;
	private String prenom;
	private Set<EntrepriseMedecin> entrepriseMedecins = new HashSet<EntrepriseMedecin>(0);
	private Set<Frais> fraises = new HashSet<Frais>(0);
	private Set<TitreMedecin> titreMedecins = new HashSet<TitreMedecin>(0);

	public Medecins() {
	}

	public Medecins(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Medecins(String nom, String prenom, Set<EntrepriseMedecin> entrepriseMedecins, Set<Frais> fraises,
			Set<TitreMedecin> titreMedecins) {
		this.nom = nom;
		this.prenom = prenom;
		this.entrepriseMedecins = entrepriseMedecins;
		this.fraises = fraises;
		this.titreMedecins = titreMedecins;
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

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Set<EntrepriseMedecin> getEntrepriseMedecins() {
		return this.entrepriseMedecins;
	}

	public void setEntrepriseMedecins(Set<EntrepriseMedecin> entrepriseMedecins) {
		this.entrepriseMedecins = entrepriseMedecins;
	}

	public Set<Frais> getFraises() {
		return this.fraises;
	}

	public void setFraises(Set<Frais> fraises) {
		this.fraises = fraises;
	}

	public Set<TitreMedecin> getTitreMedecins() {
		return this.titreMedecins;
	}

	public void setTitreMedecins(Set<TitreMedecin> titreMedecins) {
		this.titreMedecins = titreMedecins;
	}

}
