/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 *
 * @author sebas
 */
public class UsuarioModelo {

    private int Id;
    private String nombre;
    private String email;
    private String contraseña;
    private int edad;

    public UsuarioModelo(String nombre, String email, int edad, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.edad = edad;
        this.Id = Id;
    }

    public UsuarioModelo(String nombre, String email, String contraseña, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public UsuarioModelo(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = Id;
    }

}
