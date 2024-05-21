/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.UsuarioModelo;
import Servicio.RegistrarServicio;
import java.sql.SQLException;
/**
 *
 * @author sebas
 */
public class RegistrarControlador {
    
    private RegistrarServicio registrarServicio;
    
    public RegistrarControlador(){
    registrarServicio = new RegistrarServicio();
    }
    
    public boolean checkRegistro(UsuarioModelo usuarioModelo) throws SQLException{
        
        return registrarServicio.checkRegistro(usuarioModelo);
    }
}
