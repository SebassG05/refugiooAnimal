/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Servicio.ReseñaServicio;
import java.util.ArrayList;
/**
 *
 * @author sebas
 */
public class ReseñaControlador {
    
    ReseñaServicio reseñaServicio = new ReseñaServicio();
    
    public void escribirReseña(String reseña){
        reseñaServicio.escribirReseña(reseña);
    }
    
    public ArrayList<String> leerReseña(){
        return reseñaServicio.leerReseña();
    }
    
}
