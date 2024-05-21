/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.UsuarioModelo;
import BBDD.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class RegistrarServicio {

    public boolean checkRegistro(UsuarioModelo usuarioModelo) throws SQLException {

        if (usuarioModelo.getNombre().isBlank() || usuarioModelo.getEmail().isBlank() || usuarioModelo.getEdad() < 0 || usuarioModelo.getContraseña().isBlank() ) {
            JOptionPane.showMessageDialog(null, "Registro fallido. Rellene el campo Usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
        String sql = "insert into usuario(nombre, email, edad, contraseña)values('" + usuarioModelo.getNombre()+ "','" + usuarioModelo.getEmail()+ "','" + usuarioModelo.getEdad()+ "','" + usuarioModelo.getContraseña()+ "')";

            Conexion.Conectar();
            Conexion.EjecutarUpdate(sql);
            return true;

        }
        return false;

    }
}
