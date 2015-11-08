package com.es.assurance.model;
// Generated 8 nov. 2015 22:21:35 by Hibernate Tools 4.3.1.Final

/**
 * FacturesRembourcement generated by hbm2java
 */
public class FacturesRembourcement implements java.io.Serializable {

	private Integer id;
	private Clients clients;
	private Entreprises entreprises;
	private Rembourcements rembourcements;

	public FacturesRembourcement() {
	}

	public FacturesRembourcement(Rembourcements rembourcements) {
		this.rembourcements = rembourcements;
	}

	public FacturesRembourcement(Clients clients, Entreprises entreprises, Rembourcements rembourcements) {
		this.clients = clients;
		this.entreprises = entreprises;
		this.rembourcements = rembourcements;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	public Entreprises getEntreprises() {
		return this.entreprises;
	}

	public void setEntreprises(Entreprises entreprises) {
		this.entreprises = entreprises;
	}

	public Rembourcements getRembourcements() {
		return this.rembourcements;
	}

	public void setRembourcements(Rembourcements rembourcements) {
		this.rembourcements = rembourcements;
	}

}
