/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import BBDD.Conexion;
import Modelo.UsuarioModelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sebas
 */
public class IniciarSServicio {
    
     public boolean checkLogin(UsuarioModelo usuariomodelo) {        
    try {
        
        ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM usuario WHERE nombre= '" + usuariomodelo.getNombre() + "' AND contraseña= '" + usuariomodelo.getContraseña() + "'");
        return rs.next();
        
    } catch (SQLException ex) {
        
        Logger.getLogger(IniciarSServicio.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}
}
