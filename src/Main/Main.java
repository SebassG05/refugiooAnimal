/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import BBDD.Conexion;
import Views.IniciarSesion;

/**
 *
 * @author sebas
 */
public class Main {
    public static void main(String[] args) {
        Conexion.Conectar();
        
        IniciarSesion iniciarSesion = new IniciarSesion();
        
        iniciarSesion.setSize(700,500);
        
        iniciarSesion.setVisible(true);

    }
}