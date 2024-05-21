/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AnimalModel;
import Servicio.RAnimalesServicio;
import java.sql.SQLException;
/**
 *
 * @author sebas
 */
public class RAnimalesControlador {
    
    private RAnimalesServicio registrarServicio;
    
     public RAnimalesControlador(){
    registrarServicio = new RAnimalesServicio();
    }
    
     public boolean checkARegistro(AnimalModel animalModel) throws SQLException{
        
        return registrarServicio.checkARegistro(animalModel);
    }
}
