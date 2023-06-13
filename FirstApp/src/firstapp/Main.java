/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstapp;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {
    
    //Atributo
    static Numero objNumero; //Declaracion de la variable aqui solo es la declaracio pero aun no existe en la memoria
    
    public static void main(String [] args){
        
        try{
          calcularNumerosPares();
          //calcularNumerosParesConUsuario();
          
        }
        catch(Exception e){
            //1. Poder dar una presentación mas agradable del error al usuario
            //2. Poder gestionar el error, es registrarlo en alguna bitacora, tabla de BD, minimo en un archivo
            //txt, se guardar el usuario, el momento, tipificar el error, se guarda la ruta tecnica error
            // se guarda los datos al momento del error
            System.out.println("No se puede divir entre cero "+e.getMessage());
        
        }
        
       //ArithmeticException
       
     

        
    }
    
    public static void calcularNumerosParesConUsuario(){
        
        objNumero = new Numero("Carlos"); //Instanciar un clase en un objeto
        objNumero.imprimirNumerosPares();
        String usuario = objNumero.getNombreUsuario();
        System.out.println("Muchas gracias "+usuario);
    }
    
    public static void calcularNumerosPares(){
        objNumero = new Numero(); //Instanciar un clase en un objeto
        objNumero.imprimirNumerosPares();
        String usuario = objNumero.getNombreUsuario();
        System.out.println("Muchas gracias "+usuario.toUpperCase());
    }
    
   
}
