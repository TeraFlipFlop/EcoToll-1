package controller;

import model.DAO.VeicoloDAO;

public class veicoloCtrl {

	public String get_targa() {
		return new VeicoloDAO().get_targa();
		
	}

}
