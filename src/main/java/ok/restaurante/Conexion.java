/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package ok.restaurante;

/**
 *
 * @author Luis Fernando
 */ 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/systerant";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } 
        catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}