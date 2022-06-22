package com.sample;

import org.apache.poi.openxml4j.util.Nullable;

public class Klima {
	
	private int velicinaStana;
	private BrojProstorija brojProstorijaZaHladjenje;
	private boolean mogucnostUgradjanjeNaZid;
	private int temperatura;
	private Svrha svrha;
	
	private boolean hasInverter = false;
	private int snaga = 0;
	private Tip tip = null;
	
	public Klima() {
		// TODO Auto-generated constructor stub
	}
	
	public static enum Tip {
		OBICNA,PROZORSKA,POKRETNA
	}
	
	public static final Tip OBICNA = Tip.OBICNA;
	public static final Tip PROZORSKA = Tip.PROZORSKA;
	public static final Tip POKRETNA = Tip.POKRETNA;

	public static enum BrojProstorija {
		JEDNA,VISE
	}
	
	public static final BrojProstorija JEDNA = BrojProstorija.JEDNA;
	public static final BrojProstorija VISE = BrojProstorija.VISE;
	
	public static enum Svrha {
		GREJANJE,HLADJENJE,DVOSTRUKA
	}
	
	public static final Svrha GREJANJE = Svrha.GREJANJE;
	public static final Svrha HLADJENJE = Svrha.HLADJENJE;
	public static final Svrha DVOSTRUKA = Svrha.DVOSTRUKA;
	

	public int getVelicinaStana() {
		return velicinaStana;
	}
	public BrojProstorija getBrojProstorijaZaHladjenje() {
		return brojProstorijaZaHladjenje;
	}
	public boolean isMogucnostUgradjanjeNaZid() {
		return mogucnostUgradjanjeNaZid;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public boolean isHasInverter() {
		return hasInverter;
	}
	public int getSnaga() {
		return snaga;
	}
	public Tip getTip() {
		return tip;
	}
	public static Tip getObicna() {
		return OBICNA;
	}
	public static Tip getProzorska() {
		return PROZORSKA;
	}
	public static Tip getPokretna() {
		return POKRETNA;
	}
	public static BrojProstorija getJedna() {
		return JEDNA;
	}
	public static BrojProstorija getVise() {
		return VISE;
	}
	public void setVelicinaStana(int velicinaStana) {
		this.velicinaStana = velicinaStana;
	}
	public void setBrojProstorijaZaHladjenje(BrojProstorija brojProstorijaZaHladjenje) {
		this.brojProstorijaZaHladjenje = brojProstorijaZaHladjenje;
	}
	public void setMogucnostUgradjanjeNaZid(boolean mogucnostUgradjanjeNaZid) {
		this.mogucnostUgradjanjeNaZid = mogucnostUgradjanjeNaZid;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
		if (temperatura < 15) {
			this.svrha = GREJANJE;
		} else this.svrha = HLADJENJE;
	}
	public void setHasInverter(boolean hasInverter) {
		this.hasInverter = hasInverter;
	}
	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}
	public void setTip(Tip tip) {
		this.tip = tip;
	}
	
}
