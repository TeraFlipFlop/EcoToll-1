package model.componenti;
import model.componenti.Veicolo;
import model.interfacce.PedaggioInter;

public class Pedaggio implements PedaggioInter {
private int iva = 22;
private Percorso percorso;
private Autostrada autostrada;

public Pedaggio(Percorso percorso, Autostrada autostrada) {
	
	this.percorso = percorso;
	this.autostrada = autostrada;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}

public int getIva() {
	return iva;
}

public void setIva(int iva) {
	this.iva = iva;
}

public Percorso getPercorso() {
	return percorso;
}

public void setPercorso(Percorso percorso){
	this.percorso = percorso;
}

public Autostrada getAutostrada() {
	return autostrada;
}

public void setAutostrada(Autostrada autostrada) {
	this.autostrada = autostrada;
}


	@Override
	public double arrotondamento(double a) {
		return a;
	}
	
	public double tarParziale(int i){return this.percorso.KmPercorsi() *(this.autostrada.getTariffe()[i]); }

	@Override
	public double tariffaFinale(Veicolo v) {
		return arrotondamento(this.tarParziale(0)+(this.tarParziale(0)*this.iva/100 ));
	}

	
	
}
