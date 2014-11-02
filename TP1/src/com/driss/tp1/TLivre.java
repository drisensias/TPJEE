package com.driss.tp1;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.OneToOne;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class TLivre {
	
	@PrimaryKey 
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long Id ;
	@Persistent
	private String Titre ;
	@Persistent
	private int Prix ;
	@Persistent
	private String Resume ;
	@OneToOne
	private TAuteur Auteur;

	public TLivre(long psId, String psTitre, int psPrix, String psResume){
		Id = psId ;
		Titre = psTitre ;
		Prix = psPrix ;
		Resume = psResume ;
	}
	
	public TLivre(long psId, String psTitre, int psPrix, String psResume, TAuteur psAuteur){
		Id = psId ;
		Titre = psTitre ;
		Prix = psPrix ;
		Resume = psResume ;
		Auteur = psAuteur ;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public int getPrix() {
		return Prix;
	}

	public void setPrix(int prix) {
		Prix = prix;
	}

	public String getResume() {
		return Resume;
	}

	public void setResume(String resume) {
		Resume = resume;
	}
	
	public TAuteur getAuteur() {
		return Auteur;
	}

	public void setAuteur(TAuteur auteur) {
		Auteur = auteur;
	}

}
