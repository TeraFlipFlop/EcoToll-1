package model.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.componenti.*;
import model.database.database;

public class VeicoloDAO implements VeicoloDAO_I {

	@Override
	public String get_targa() {
		Connection con = new database().Connect();
		java.sql.PreparedStatement st = null;
		String l = null;
		String sql =null;
		sql="select * from veicolo where marca ='Ford'; ";
		try {
			st=con.prepareStatement(sql);
					
				ResultSet res	=null;

				 st.execute();
				 res = st.getResultSet();
				 
				 while(res.next()) {
				 sql=res.getString("targa");
				 l=sql;}
				 
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		return l;
		
}
		
	

	@Override
	public Veicolo get_veicolo() {
		// TODO Auto-generated method stub
		return null;
	}

}
