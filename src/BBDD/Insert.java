/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

	package BBDD;
import java.sql.SQLException;

public class Insert {

    public boolean insertPoints(String tabla, int id, int points) throws SQLException {

        try {
             Conexion.Conectar();
                Conexion.EjecutarUpdate("INSERT INTO "+tabla +" (PUNTOS) VALUES (" +points +") WHERE id = " +id +";");
                return true;
        }catch(SQLException e){
            System.out.println(e.getStackTrace());
            e.getMessage();
            return false;
        }

    }

}


