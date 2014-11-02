package com.driss.tp1;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class WebserviceDemo {
	@WebMethod
	public void createAuteur(long psId, int psNumero, String psNom, String psPrenom,String psDomicile,List<TLivre> psLivres){
		TAuteur un_Auteur = new TAuteur(psId, psNumero,psNom, psPrenom, psDomicile, psLivres);
		PersistenceManager pm = PersEntry.get().getPersistenceManager();
		try{
			pm.makePersistent(un_Auteur);
		}
		finally{
			pm.close();
		}
		
		
	}
	
	@WebMethod
	public void createLivre(long psId, String psTitre, int psPrix, String psResume, TAuteur psAuteur){
		TLivre un_Livre = new TLivre(psId, psTitre, psPrix, psResume, psAuteur);
		PersistenceManager pm = PersEntry.get().getPersistenceManager();
		try{
			pm.makePersistent(un_Livre);
		}
		finally{
			pm.close();
		}
	}
	
	@WebMethod
	public TAuteur getAuteur(long psId){
		PersistenceManager pm = PersEntry.get().getPersistenceManager();
		try{
			TAuteur aut=pm.getObjectById(TAuteur.class, psId);
			return aut;
		}
		finally{
			pm.close();
		}
	}
	
	@WebMethod
	public TLivre getLivre(long psId) {
		PersistenceManager pm = PersEntry.get().getPersistenceManager();
		try {
			TLivre liv=pm.getObjectById(TLivre.class, psId);
			return liv;
		}
		finally {
			pm.close();	
		}
	}
	
	@WebMethod
	public void updateAuteur(long psId, int newNumero, String newNom, String newPrenom,String newDomicile,List<TLivre> newLivres){
		PersistenceManager pm = PersEntry.get().getPersistenceManager();
		try {
			TAuteur un_auteur = pm.getObjectById(TAuteur.class, psId);
			un_auteur.setNumero(newNumero);
			un_auteur.setNom(newNom);
			un_auteur.setPrenom(newPrenom);
			un_auteur.setDomicile(newDomicile);
	        
	        }finally {
	        	pm.close();
	        }
			
		}
	@WebMethod
	public void updateLivre(long psId, String newTitre, int newPrix, String newResume, TAuteur newAuteur){
		PersistenceManager pm = PersEntry.get().getPersistenceManager();
		try {
			TLivre un_livre = pm.getObjectById(TLivre.class, psId);
			un_livre.setTitre(newTitre);
			un_livre.setPrix(newPrix);
			un_livre.setResume(newResume);
			un_livre.setAuteur(newAuteur);
	        
	        }finally {
	        	pm.close();
	        }
			
		}
	
	@WebMethod
	public void deleteAuteur(long psId)	{
		PersistenceManager pm = PersEntry.get().getPersistenceManager();
		try {
			TAuteur un_auteur = pm.getObjectById(TAuteur.class, psId);
			pm.deletePersistent(un_auteur);
			
		}finally {
			pm.close();
		}
	}
	@WebMethod
	public void deleteLivre(long psId)	{
		PersistenceManager pm = PersEntry.get().getPersistenceManager();
		try {
			TLivre un_livre = pm.getObjectById(TLivre.class, psId);
			pm.deletePersistent(un_livre);
			
		}finally {
			pm.close();
		}
	}
		
	}


