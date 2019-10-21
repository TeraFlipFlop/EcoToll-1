package model.DAO;

public interface TariffeDAO_I {
	public double  get_tariffa(String classe, String tipo) ;
	public double get_oneri(String ClasseAmb);
	public void update_tariffe(double A,double B,double c3,double c4, double c5, String tipo );
	public void update_oneri(double E1,double E2,double E3,double E4, double E5, double SE6);

}
