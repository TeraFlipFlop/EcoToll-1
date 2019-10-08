package model.componenti;

import model.interfacce.PercorsoInter;

public class Percorso implements PercorsoInter {
		private Casello entrata;
	    private Casello uscita;
	   
	public Percorso(Casello entrata, Casello uscita) {
			this.entrata = entrata;
			this.uscita = uscita;		
		}
	
	public Casello getEntrata() {
		return entrata;
	}

	public void setEntrata(Casello entrata) {
		this.entrata = entrata;
	}

	public Casello getUscita() {
		return uscita;
	}

	public void setUscita(Casello uscita) {
		this.uscita = uscita;
	}

	@Override
	public int KmPercorsi(){
		return this.uscita.getKm()-this.entrata.getKm();
		};
	
}
