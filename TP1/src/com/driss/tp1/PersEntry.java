package com.driss.tp1;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public class PersEntry {
	
	private static final PersistenceManagerFactory pmf =
			JDOHelper.getPersistenceManagerFactory("transactions-optional") ;
	
	private PersEntry(){}
	public static PersistenceManagerFactory get(){
		return pmf ;
	}
}
