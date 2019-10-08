package controller;

import model.sql.GestoreUtenza;

public class LoginController {
	
		public String login(String username,String password) {
			return new GestoreUtenza().login(username, password);
		}		
}
