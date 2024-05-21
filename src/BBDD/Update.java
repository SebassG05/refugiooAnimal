/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
	package BBDD;
import java.sql.SQLException;

public class Update {

    public boolean UpdatePJEquipo(String Equipo, int idEquipo){

        try {
            Conexion.Conectar();
            Conexion.EjecutarUpdate("Update from "+Equipo+" where ID = '"+idEquipo+"'");
        }catch(Exception e){
        System.out.println(e.getStackTrace());
        e.getMessage();
        return false;
        }
        return true;
    }

}