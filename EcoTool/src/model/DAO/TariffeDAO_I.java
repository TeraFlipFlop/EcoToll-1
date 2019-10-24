package model.DAO;

public interface TariffeDAO_I {
	public double  get_tariffa(String classe, String tipo) ;
	public double get_oneri(String ClasseAmb);
	public void update_tariffe(double []A, String tipo );
	public void update_oneri(double [] E);

}
