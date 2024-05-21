/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import BBDD.Conexion;
import Modelo.AnimalModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class AnimalesServicio {
    
    public List<AnimalModel> MostrarAnimales(){
        
        List<AnimalModel> animales = new ArrayList<>();
        
        try{
            
            ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal");
            while (rs.next()){
                
                AnimalModel animal = new AnimalModel(
                rs.getString("N_especie"),
                rs.getString("nombre"),
                rs.getInt("edad"),
                rs.getDouble("peso"),
                rs.getString("apadrinado"),
                rs.getString("Nacimiento"),
                rs.getString("Especie"));
                
                animales.add(animal);
                
            }
            
            }catch(Exception e){
            Logger.getLogger(IniciarSServicio.class.getName()).log(Level.SEVERE, null, e);
        }
        return animales;
    }
    
    public List<AnimalModel> ObtenerViviparo(String nacimiento) {
        
     List<AnimalModel> animales = new ArrayList<>();
                    
    try {
        
        ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal WHERE Nacimiento = 'Viviparo'");
        
        
        while (rs.next()) {
            AnimalModel animal = new AnimalModel(
                rs.getString("N_Especie"),
                rs.getString("Nombre"),
                rs.getInt("Edad"),
                rs.getDouble("Peso"),
                rs.getString("Apadrinado"),
                rs.getString("Nacimiento"),
                rs.getString("Especie")
            );
            animales.add(animal);
        }
    } catch (SQLException e) {
        Logger.getLogger(AnimalesServicio.class.getName()).log(Level.SEVERE, null, e);
    }
    return animales;
}
    
    public List<AnimalModel> ObtenerOviparo(String nacimiento) {
        
     List<AnimalModel> animales = new ArrayList<>();
     
    try {
        
        ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal WHERE Nacimiento = 'Oviparo'");
        
        
        while (rs.next()) {
            AnimalModel animal = new AnimalModel(
                rs.getString("N_Especie"),
                rs.getString("Nombre"),
                rs.getInt("Edad"),
                rs.getDouble("Peso"),
                rs.getString("Apadrinado"),
                rs.getString("Nacimiento"),
                rs.getString("Especie")
            );
            animales.add(animal);
        }
    } catch (SQLException e) {
        Logger.getLogger(AnimalesServicio.class.getName()).log(Level.SEVERE, null, e);
    }
    return animales;
    }
    
    
    public List<AnimalModel> ObtenerCarnivoro(String nacimiento) {
        
     List<AnimalModel> animales = new ArrayList<>();
     
    try {
        
        ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal WHERE Especie = 'Carnivoro'");
        
        
        while (rs.next()) {
            AnimalModel animal = new AnimalModel(
                rs.getString("N_Especie"),
                rs.getString("Nombre"),
                rs.getInt("Edad"),
                rs.getDouble("Peso"),
                rs.getString("Apadrinado"),
                rs.getString("especie"),
                rs.getString("Nacimiento")
            );
            animales.add(animal);
        }
    } catch (SQLException e) {
        Logger.getLogger(AnimalesServicio.class.getName()).log(Level.SEVERE, null, e);
    }
    return animales;
    }
    
    public List<AnimalModel> ObtenerHerbivoro(String nacimiento) {
        
     List<AnimalModel> animales = new ArrayList<>();
     
    try {
        
        ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal WHERE Especie = 'Herbivoro'");
        
        
        while (rs.next()) {
            AnimalModel animal = new AnimalModel(
                rs.getString("N_Especie"),
                rs.getString("Nombre"),
                rs.getInt("Edad"),
                rs.getDouble("Peso"),
                rs.getString("Apadrinado"),
                rs.getString("especie"),
                rs.getString("Nacimiento")
            );
            animales.add(animal);
        }
    } catch (SQLException e) {
        Logger.getLogger(AnimalesServicio.class.getName()).log(Level.SEVERE, null, e);
    }
    return animales;
    }
    
    public List<AnimalModel> ObtenerApadrinado(String nacimiento) {
        
     List<AnimalModel> animales = new ArrayList<>();
     
    try {
        
        ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal WHERE apadrinado = 'SI'");
        
        
        while (rs.next()) {
            AnimalModel animal = new AnimalModel(
                rs.getString("N_Especie"),
                rs.getString("Nombre"),
                rs.getInt("Edad"),
                rs.getDouble("Peso"),
                rs.getString("Apadrinado"),
                rs.getString("especie"),
                rs.getString("Nacimiento")
            );
            animales.add(animal);
        }
    } catch (SQLException e) {
        Logger.getLogger(AnimalesServicio.class.getName()).log(Level.SEVERE, null, e);
    }
    return animales;
    }
    
    public List<AnimalModel> ObtenerNoApadrinado(String nacimiento) {
        
     List<AnimalModel> animales = new ArrayList<>();
     
    try {
        
        ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal WHERE apadrinado = 'NO'");
        
        
        while (rs.next()) {
            AnimalModel animal = new AnimalModel(
                rs.getString("N_Especie"),
                rs.getString("Nombre"),
                rs.getInt("Edad"),
                rs.getDouble("Peso"),
                rs.getString("Apadrinado"),
                rs.getString("especie"),
                rs.getString("Nacimiento")
            );
            animales.add(animal);
        }
    } catch (SQLException e) {
        Logger.getLogger(AnimalesServicio.class.getName()).log(Level.SEVERE, null, e);
    }
    return animales;
    }
    
    
    public List<AnimalModel> Apadrinar(String nacimiento) {
        
     List<AnimalModel> animales = new ArrayList<>();
     
    try {
        
        ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal WHERE apadrinado = 'NO'");
        
        
        while (rs.next()) {
            AnimalModel animal = new AnimalModel(
                rs.getString("N_Especie"),
                rs.getString("Nombre"),
                rs.getInt("Edad"),
                rs.getDouble("Peso"),
                rs.getString("Apadrinado"),
                rs.getString("especie"),
                rs.getString("Nacimiento")
            );
            animales.add(animal);
        }
    } catch (SQLException e) {
        Logger.getLogger(AnimalesServicio.class.getName()).log(Level.SEVERE, null, e);
    }
    return animales;
    }
    
     public List<AnimalModel> ObtenerHerbivorosNoApadrinados(String NoHerbivoro) {
        List<AnimalModel> animales = new ArrayList<>();
        try {
            ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal WHERE Especie = 'Herbivoro' AND apadrinado = 'NO'");
            while (rs.next()) {
                AnimalModel animal = new AnimalModel(
                    rs.getString("N_Especie"),
                    rs.getString("Nombre"),
                    rs.getInt("Edad"),
                    rs.getDouble("Peso"),
                    rs.getString("Apadrinado"),
                    rs.getString("Nacimiento"),
                    rs.getString("Especie")
                );
                animales.add(animal);
            }
        } catch (SQLException e) {
            Logger.getLogger(AnimalesServicio.class.getName()).log(Level.SEVERE, null, e);
        }
        return animales;
    }
     
    public void mostrarAnimalesHerComboBox(String tabla, String nombre, JComboBox jComboBox1) throws Exception{
        
        try{
            ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal WHERE Especie = 'Herbivoro' AND apadrinado = 'NO'");
            
            while(rs.next()){
                jComboBox1.addItem(rs.getString(nombre));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR EN SERVICIO");
        }
    }
    
    public void mostrarAnimalesCarComboBox(String tabla, String nombre, JComboBox jComboBox1) throws Exception{
        
        try{
            ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal WHERE Especie = 'Carnivoro' AND apadrinado = 'NO'");
            
            while(rs.next()){
                jComboBox1.addItem(rs.getString(nombre));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR EN SERVICIO");
        }
    }
    
    public void mostrarAnimalesDefComboBox(String tabla, String nombre, JComboBox jComboBox1) throws Exception{
        
        try{
            ResultSet rs = Conexion.EjecutarSentencia("SELECT * FROM animal");
            
            while(rs.next()){
                jComboBox1.addItem(rs.getString(nombre));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR EN SERVICIO");
        }
    }
    
    public boolean ApadrinarAnimalHer(String nombreAnimal) {
    try {
        Conexion.EjecutarUpdate("UPDATE animal SET apadrinado = 'SI' WHERE nombre = '" +nombreAnimal +"';");
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
    }
    
    public boolean ApadrinarAnimalCar(String nombreAnimal) {
    try {
        Conexion.EjecutarUpdate("UPDATE animal SET apadrinado = 'SI' WHERE nombre = '" +nombreAnimal +"';");
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
    }
    
    public boolean RegistrarDefuncion(String nombreAnimal) {
    try {
        Conexion.EjecutarUpdate("DELETE from animal WHERE nombre = '" +nombreAnimal +"';");
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
    }
}
        

    

