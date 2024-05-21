/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.UsuarioModelo;
import Servicio.IniciarSServicio;

/**
 *
 * @author sebas
 */
public class IniciarSControlador {
    
    private IniciarSServicio loginServices;
   
   public IniciarSControlador(){
   loginServices = new IniciarSServicio();
   }
   
   public boolean checkLogin(UsuarioModelo usuariomodelo)
   {
   
        return loginServices.checkLogin(usuariomodelo);
   }
   
}
