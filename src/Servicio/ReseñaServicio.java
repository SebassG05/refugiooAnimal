/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ReseñaServicio {

    private URI uri;
    
    public void escribirReseña(String reseña){
        Path relativePath = Paths.get("src/Ficheros/Res");
        Path absolutePath = relativePath.toAbsolutePath();
        
        try{
            
            String ruta = absolutePath.toString() + "/Reseñass.txt";
            
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true))){
                bw.write(reseña + "\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<String> leerReseña(){
        Path relativePath = Paths.get("src/Ficheros/Res");
        Path absolutePath = relativePath.toAbsolutePath();
        
        String ruta = absolutePath.toString() + "/Reseñass.txt";
        ArrayList<String> array = new ArrayList<>();
        File file = new File(ruta);
        
        try(Scanner reader = new Scanner(file)){
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                array.add(line + "\n");
                
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return array;
    }
}
