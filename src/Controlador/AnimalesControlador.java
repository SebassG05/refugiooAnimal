/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.AnimalModel;
import Servicio.AnimalesServicio;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author sebas
 */
public class AnimalesControlador {
    
    private AnimalesServicio mostrarAnimal;
    private boolean haProbadoSuerte;
    
    public AnimalesControlador(){
        
        mostrarAnimal = new AnimalesServicio();
        haProbadoSuerte = false;
    }
    
    public List<AnimalModel> MostrarAnimales(){
        
        return mostrarAnimal.MostrarAnimales();
    }
    
    public List<AnimalModel> ObtenerViviparo(String nacimiento) {
    return mostrarAnimal.ObtenerViviparo(nacimiento);
}
    
    public List<AnimalModel> ObtenerOviparo(String nacimiento) {
    return mostrarAnimal.ObtenerOviparo(nacimiento);
}
    
    public List<AnimalModel> ObtenerCarnivoro(String carnivoro) {
    return mostrarAnimal.ObtenerCarnivoro(carnivoro);
}
    
    public List<AnimalModel> ObtenerHerbivoro(String herbivoro) {
    return mostrarAnimal.ObtenerHerbivoro(herbivoro);
}
    
    public List<AnimalModel> ObtenerApadrinado(String apadrinado) {
    return mostrarAnimal.ObtenerApadrinado(apadrinado);
}
    public List<AnimalModel> ObtenerNoApadrinado(String NoApadrinado) {
    return mostrarAnimal.ObtenerNoApadrinado(NoApadrinado);
    }

    public void mostrarAnimalesHerComboBox() throws Exception {
        
    }
    
    public void mostrarAnimalesCarComboBox() throws Exception {
        
    }
    
    public boolean ApadrinarAnimalHer(String nombreAnimal) throws SQLException
   {
   
        return mostrarAnimal.ApadrinarAnimalHer(nombreAnimal);
   }
    
   public boolean ApadrinarAnimalCar(String nombreAnimal) throws SQLException
   {
   
        return mostrarAnimal.ApadrinarAnimalCar(nombreAnimal);
   }
   
   public boolean RegistrarDefuncion(String nombreAnimal) throws SQLException
   {
   
        return mostrarAnimal.RegistrarDefuncion(nombreAnimal);
   }
   
   public void mostrarAnimales() throws Exception {
        
    }
   
   public boolean ProbarSuerte(String nombreAnimal) throws SQLException
   {
   
       if (haProbadoSuerte) {
            return false;  
        } else {
            haProbadoSuerte = true;  
            return mostrarAnimal.ProbarSuerte(nombreAnimal);
        }
   }
   
   public boolean HaProbadoSuerte() {
        return haProbadoSuerte;
    }
}

