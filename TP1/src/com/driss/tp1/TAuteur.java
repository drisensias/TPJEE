package com.driss.tp1;

import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.OneToMany;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class TAuteur {
	
	@PrimaryKey 
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long Id ;
	@Persistent
	private int Numero ;
	@Persistent
	private String Nom ;
	@Persistent
	private String Prenom ;
	@Persistent
	private String Domicile ;	
	@OneToMany
	private List<TLivre> Livres;

	public TAuteur(long psId, int psNumero, String psNom, String psPrenom,
			String psDomicile){
		Id = psId ;
		Numero = psNumero ;
		Nom = psNom ;
		Prenom = psPrenom ;
		Domicile = psDomicile ;
	}
	
	public TAuteur(long psId, int psNumero, String psNom, String psPrenom,
			String psDomicile, List<TLivre> psLivres){
		Id = psId ;
		Numero = psNumero ;
		Nom = psNom ;
		Prenom = psPrenom ;
		Domicile = psDomicile ;
		Livres = psLivres ;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getDomicile() {
		return Domicile;
	}

	public void setDomicile(String domicile) {
		Domicile = domicile;
	}
	
	
	public List<TLivre> getLivres() {
		return Livres;
	}

	public void setLivres(List<TLivre> livres) {
		Livres = livres;
	}
	
}

