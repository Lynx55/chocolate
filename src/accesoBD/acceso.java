/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

/**
 *
 * @author simon
 */
public class acceso {
    public static Connection conectar;

    private acceso() {
    }
    public static Connection obtenerInstancia() throws SQLException{
        if (conectar==null){
             String url= "jdbc:oracle:thin:@localhost:1521:xe";
             String user="System";
             String pass="771877";
             System.out.println("Proceso de Coneccion...");
             try {
                 conectar= DriverManager.getConnection(url, user, pass);
                 System.out.println("Base de datos Conectada!!");
             }catch (SQLException e) {
                 System.out.println(e.getMessage());
                 e.printStackTrace();    
             }  
        }
        return conectar;
    }
}