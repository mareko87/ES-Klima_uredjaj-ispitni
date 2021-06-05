package com.sample;

public class Klima {
	
	private String tip;
	private boolean mogucaUgradnjaNaZid;
	private int snaga;
	private boolean imaInverter;
	private int kvadratura;
	private boolean viseProstorija;
	private boolean zaGrejanje;
	private boolean zaGrejanjeMinusPet;
	
	public Klima() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param mogucaUgradnjaNaZid
	 * @param kvadratura
	 * @param viseProstorija
	 * @param zaGrejanje
	 * @param zaGrejanjeMinusPet
	 */
	public Klima(boolean mogucaUgradnjaNaZid, int kvadratura, boolean viseProstorija, 
					boolean zaGrejanje, boolean zaGrejanjeMinusPet) {
		super();
		this.mogucaUgradnjaNaZid = mogucaUgradnjaNaZid;
		this.kvadratura = kvadratura;
		this.viseProstorija = viseProstorija;
		this.zaGrejanje = zaGrejanje;
		this.zaGrejanjeMinusPet = zaGrejanjeMinusPet;
	}

	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public boolean isMogucaUgradnjaNaZid() {
		return mogucaUgradnjaNaZid;
	}
	public void setMogucaUgradnjaNaZid(boolean mogucaUgradnjaNaZid) {
		this.mogucaUgradnjaNaZid = mogucaUgradnjaNaZid;
	}
	public int getSnaga() {
		return snaga;
	}
	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}
	public boolean isImaInverter() {
		return imaInverter;
	}
	public void setImaInverter(boolean imaInverter) {
		this.imaInverter = imaInverter;
	}
	public int getKvadratura() {
		return kvadratura;
	}
	public void setKvadratura(int kvadratura) {
		this.kvadratura = kvadratura;
	}
	public boolean isViseProstorija() {
		return viseProstorija;
	}
	public void setViseProstorija(boolean viseProstorija) {
		this.viseProstorija = viseProstorija;
	}
	public boolean isZaGrejanje() {
		return zaGrejanje;
	}
	public void setZaGrejanje(boolean zaGrejanje) {
		this.zaGrejanje = zaGrejanje;
	}
	public boolean getZaGrejanjeMinusPet() {
		return zaGrejanjeMinusPet;
	}
	public void setZaGrejanjeMinusPet(boolean zaGrejanjeMinusPet) {
		this.zaGrejanjeMinusPet = zaGrejanjeMinusPet;
	}
	@Override
	public String toString() {
		return 
				" _______________________________________________________________"
				+ "\n|\tKLIMA UREDJAJ - pregled predlozene specifikacije: \t|"
				+ "\n|---------------------------------------------------------------|"
				+ "\n|\ttip:\t\t |" + (tip == null ? "nepoznato" : tip) + "\t\t\t\t|"
				+ "\n|\tsnaga:\t\t |" + (snaga == 0 ? "nepoznato" : snaga) + " BTU\t\t\t\t|"
				+ "\n|\tima inverter:\t |" + (imaInverter == true ? "da" : "ne") + "\t\t\t\t\t|"
				+ "\n|________________________|______________________________________|";
	}
	
	
	

}
