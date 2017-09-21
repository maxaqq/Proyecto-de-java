/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenproductos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CONECTAR {
    Connection conect = null;
	public Connection conexion()
		{
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				conect = DriverManager.getConnection("jdbc:mysql://localhost/almacenproductos","root","");
				System.out.println("conexion establecida");
				/*JOptionPane.showMessageDialog(null,"Conectado");*/
				
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("error de conexion");
				JOptionPane.showMessageDialog(null,"Error de conexion"+e);
			}
			return conect;
		}

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
