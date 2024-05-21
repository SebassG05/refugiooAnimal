/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;

import java.sql.SQLException;

public class Delete {

    public boolean delete(String tabla, int id){

        try {
            Conexion.Conectar();
            Conexion.EjecutarUpdate("delete from "+tabla+" where ID = '"+id+"'");
            
        }catch(SQLException e){
            
        System.out.println(e.getStackTrace());
        e.getMessage();
        return false;
        
        }
        return true;
    }
}
