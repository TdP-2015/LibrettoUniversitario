package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class Esame {
	
	private LocalDate data ;
	private String corso ;
	private int voto ;

	
	public Esame(LocalDate data, String corso, int voto) {
		super();
		this.data = data;
		this.corso = corso;
		this.voto = voto;
	}
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getCorso() {
		return corso;
	}
	public void setCorso(String corso) {
		this.corso = corso;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	

}
