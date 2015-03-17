package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List<Esame> libretto ;

	public Model() {
		libretto = new ArrayList<Esame>() ;	
	}
	
	public int getNumeroEsami() {
		return libretto.size() ;
	}
	
	public double getMediaEsami() {
		
		if(getNumeroEsami()==0)
			return 0.0 ;
				
		double val = 0.0 ;
		
		for(Esame e : libretto) {
			val = val + e.getVoto() ;
		}
		
		return val / getNumeroEsami() ;
	}
	
	public void add(Esame e) {
		libretto.add(e) ;
	}
	
	public void clear() {
		libretto.clear() ;
	}
	
	public List<Esame> getLibretto() {
		return this.libretto ;
	}
	

}
