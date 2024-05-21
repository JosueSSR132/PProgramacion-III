package modelo;

import java.sql.*;

public class Modelo {

	public Modelo() {
	}
	
	public boolean login(String username,String password){
		boolean autenticado = false;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_db_prueba_24","freedb_JosueSSR","cKe?9dt!K%hBbXk");
				
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from usuarios");  
				
				while (rs.next()) {
                    String dbNombreUsuario = rs.getString("nombre de usuario");
                    String dbContraseña = rs.getString("contraseña");
                    if (dbNombreUsuario.equals(username) && dbContraseña.equals(password)) {
                        System.out.println("USUARIO Y CONTRASEÑA CORRECTA");
                        autenticado = true;
                        break;
                    }else {
                    	System.out.println("USUARIO O CONTRASEÑA INCORRECTA");
                    }
                } 
					con.close();  
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return autenticado;
	}
	
}
