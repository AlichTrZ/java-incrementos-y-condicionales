/*
Para ingresar al conjunto residencial se verifica:
1. Si el residente tiene tarjeta de acceso.
2. Si la tarjeta está activa.
3. Si no posee deudas de administración.
Requerimientos
Solicitar:
• Tiene tarjeta (Sí/No)
• Tarjeta activa (Sí/No)
• Tiene deudas (Sí/No)
El sistema debe indicar:
• Acceso permitido.
• Acceso restringido por tarjeta inactiva.
• Acceso restringido por mora.
• Acceso denegado por ausencia de tarjeta.
 */
package Programas;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio2AccesoConjunto {
    public static void main(String[] args) {
        
        String tarjeta;
        String estadotar;
        String deuda;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Posee tarjeta de acceso?, Si/No: ");
        tarjeta=sc.nextLine();
        
        
       
        System.out.println("Su tarjeta se encuentra activa?, Si/No: ");
        estadotar=sc.nextLine();
        
        System.out.println("Posee deudas?, Si/No: ");
        deuda=sc.nextLine();
        
        
        if(tarjeta.equalsIgnoreCase("No")){
            
            System.out.println("Accedor Denegado por Ausencia de Tarjeta");
                         
        }
        else if(estadotar.equalsIgnoreCase("No")){
            System.out.println("Acceso Restringido por Tarjeta Inactiva.");
            
        }
        
        else if(deuda.equalsIgnoreCase("Si")){
            System.out.println("Acceso Restringido por Mora.");
        }
        
        else{
            System.out.println("Acceso permitido.");
        }
        
            
              
    }
    
}
