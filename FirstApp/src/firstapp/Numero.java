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
public class Numero {
    
    //Contructor de la clase
    public Numero(){
        this.nombreUsuario = "Admin";
    }
    
    public Numero(String pNombreUsuario){
        this.nombreUsuario = pNombreUsuario.toUpperCase();
    }
    
    //Atributo de la clase
    private String nombreUsuario;

    //Propiedades sobre el atributo
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    //Propiedades sobre el atributo
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    //Metodo de la clase
    public void imprimirNumerosPares(){
         // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario que ingrese un número
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();

            // Mostrar todos los números pares hasta el número ingresado
            System.out.println("Números pares hasta " + numero + ":");
            for (int i = 0; i <= numero; i++) {
                if (i % 2 == 0) {                
                    System.out.println(i);
                }
            }

            // Cerrar el objeto Scanner
            scanner.nextLine();
            scanner.close(); 
    }
    
}
