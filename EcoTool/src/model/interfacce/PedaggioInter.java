package model.interfacce;

import model.componenti.Classe3;
import model.componenti.Classe4;
import model.componenti.Classe5;
import model.componenti.ClasseA;
import model.componenti.ClasseB;

public interface PedaggioInter {

public double arrotondamento(double a);
public double tariffaFinale (ClasseA a);
public double tariffaFinale (ClasseB a);
public double tariffaFinale (Classe3 a);
public double tariffaFinale (Classe4 a);
public double tariffaFinale (Classe5 a);

}