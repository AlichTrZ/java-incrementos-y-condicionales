/*
Categoría Oro
• Más de 50 vuelos en el año.
• Membresía activa.
Categoría Plata
• Entre 20 y 50 vuelos.
• Membresía activa.

Categoría Básica
• Menos de 20 vuelos.
• O no posee membresía.
Además:
• Si el pasajero es categoría Oro y tiene más de 70 vuelos, recibe acceso VIP.
Requerimientos
Mostrar:
• Categoría obtenida.
• Si tiene acceso VIP.
 */
package Programas;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio5Aerolinea {
    
    public static void main(String[] args) {
        
        int vuelos;
        String membresia;
        
        
        System.out.println("Bienvenido a nuestro sistema de categorias.");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Favor ingresar su cantida de vuelos: ");
        vuelos=sc.nextInt();
        
        sc.nextLine();//esto lo puse porque me estaba leyendo vacia la entrada "disponoble" y se saltaba directamente a terminar el codigo, sin dar
                       //tiempo al usuario que digite la respuesta.
        
        System.out.print("Posee membresia? Si/No: ");
        membresia=sc.nextLine();
        
        if(vuelos>70 && membresia.equalsIgnoreCase("Si")){
            
            System.out.println("--Evaluacion de Categoria--");
            System.out.println("");
            System.out.println("Categoria Asignada: Oro");
            System.out.println("Acceso VIP: Si.");
            
        }
        
        else if(vuelos>50 && membresia.equalsIgnoreCase("Si")){
            
            System.out.println("--Evaluacion de Categoria--");
            System.out.println("");
            System.out.println("Categoria Asignada: Oro");
            System.out.println("Acceso VIP: No.");
        }
        
        else if(vuelos>=20 && vuelos<=50 && membresia.equalsIgnoreCase("Si")){
            System.out.println("--Evaluacion de Categoria--");
            System.out.println("");
            System.out.println("Categoria Asignada: Plata");
            System.out.println("Acceso VIP: No.");
        }
        
        else{
            System.out.println("--Evaluacion de Categoria--");
            System.out.println("");
            System.out.println("Categoria Asignada: Basica");
            System.out.println("Acceso VIP: No.");
        }
        
        
    }
    
}
