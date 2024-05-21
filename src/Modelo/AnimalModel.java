/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sebas
 */
public class AnimalModel {
    
    private String N_especie;
    private String nombre;
    private int edad;
    private double peso;
    private String apadrinado;
    private int id;
    private String especie;
    private String Nacimiento;

    public AnimalModel(String N_especie, String nombre, int edad, double peso, String apadrinado, int id, String especie, String Nacimiento) {
        this.N_especie = N_especie;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.apadrinado = apadrinado;
        this.id = id;
        this.especie = especie;
        this.Nacimiento = Nacimiento;
    }

    public AnimalModel(String N_especie, String nombre, int edad, double peso, String apadrinado) {
        this.N_especie = N_especie;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.apadrinado = apadrinado;
    }

    public AnimalModel(String N_especie, String nombre, int edad, double peso, String apadrinado, String especie, String Nacimiento) {
        this.N_especie = N_especie;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.apadrinado = apadrinado;
        this.especie = especie;
        this.Nacimiento = Nacimiento;
      
    }

    public AnimalModel(String apadrinado) {
        this.apadrinado = apadrinado;
    }
    
    

    public AnimalModel(String N_especie, String nombre, int edad, double peso, String especie, String Nacimiento) {
        this.N_especie = N_especie;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
        this.Nacimiento = Nacimiento;
    }
    
    
    
    

    public String getN_especie() {
        return N_especie;
    }

    public void setN_especie(String N_especie) {
        this.N_especie = N_especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getApadrinado() {
        return apadrinado;
    }

    public void setApadrinado(String apadrinado) {
        this.apadrinado = apadrinado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    
}
