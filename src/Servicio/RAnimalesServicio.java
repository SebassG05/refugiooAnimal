/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.AnimalModel;
import BBDD.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class RAnimalesServicio {
    
     public boolean checkARegistro(AnimalModel animalModel) throws SQLException {

        if (animalModel.getN_especie().isBlank() || animalModel.getNombre().isBlank() || animalModel.getEdad() < 0 || animalModel.getPeso() <= 0 || animalModel.getApadrinado().isBlank() || animalModel.getEspecie().isBlank() || animalModel.getNacimiento().isBlank()) {
        JOptionPane.showMessageDialog(null, "Registro fallido. Rellene los campos correctamente", "Advertencia", JOptionPane.WARNING_MESSAGE);
    } 
    // Verifica si el campo 'apadrinado' contiene algo diferente a 'NO'
    else if (!animalModel.getApadrinado().equalsIgnoreCase("NO")) {
        JOptionPane.showMessageDialog(null, "Registro fallido. El campo 'apadrinado' debe contener 'NO'", "Advertencia", JOptionPane.WARNING_MESSAGE);
    } 
    // Si todas las verificaciones son correctas, realiza el registro
    else {
        String sql = "insert into animal(N_especie, nombre, edad, peso, apadrinado, especie, nacimiento) values('" + animalModel.getN_especie() + "','" + animalModel.getNombre() + "','" + animalModel.getEdad() + "','" + animalModel.getPeso() + "','" + animalModel.getApadrinado() + "','" + animalModel.getEspecie() + "','" + animalModel.getNacimiento() + "')";

        Conexion.Conectar();
        Conexion.EjecutarUpdate(sql);
        return true;
    }
    return false;
    }
}

