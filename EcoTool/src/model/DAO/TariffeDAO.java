package model.DAO;

public class TariffeDAO implements TariffeDAO_I{

	@Override
	public double get_tariffa(String classe, String tipo) { //a b 3 4 5 
		// sql  select tariffa from tariffe where classe = classe  and tipo = tipo
		
		
		
		
		return 0;
	}

	@Override
	public double get_oneri(String ClasseAmb) {//euro 1 2 3 4 5 6
		// 
		return 0;
	}//------------------
	//update tariffe values(----) where tipo = tipo

	@Override
	public void update_tariffe(double A[], String tipo) {
		// A[] prende i dati dalle textarea e li mette in un array
		
	}

	@Override
	public void update_oneri(double E[]) {
		//E[] prende i dati dalle textarea e li mette in un array
		
	}

}
