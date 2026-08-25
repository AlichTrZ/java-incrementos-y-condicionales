/*
Nivel: Avanzado
Tipo de estructura: Condiciones compuestas
Una aplicación de transporte asigna un conductor premium únicamente si:
• Tiene calificación superior o igual a 4.8.
• Ha realizado más de 500 viajes.
• Se encuentra disponible.
Si cumple dos de las tres condiciones será asignado como conductor estándar.
En cualquier otro caso no podrá ser asignado.
Requerimientos
Solicitar:
• Calificación.
• Cantidad de viajes.
• Disponibilidad.
Mostrar el tipo de asignación.
 */
package Programas;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio3Transporte {
    
    public static void main(String[] args) {
        
        double calificacion;
        double cantViajes;
        String disponible;
        int condiciones=0;
        
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su calificacion: ");
        calificacion=sc.nextDouble();
        
        System.out.print("Ingrese la cantidad de viajes realizados: ");
        cantViajes=sc.nextDouble();
        
        sc.nextLine(); //esto lo puse porque me estaba leyendo vacia la entrada "disponoble" y se saltaba directamente a terminar el codigo, sin dar
                       //tiempo al usuario que digite la respuesta.
        
        System.out.println("Se encuentra con disponibilidad? Si/No: ");
        disponible=sc.nextLine();
        
        if(calificacion>=4.8){
        
           condiciones++;
    }
        if (cantViajes>500){
          condiciones++;
    }
        if(disponible.equalsIgnoreCase("Si")){
            
          condiciones++;
        
    }
        
        if(condiciones==3){
            System.out.println("Estimado conductor, usted a sido asignado con categoria Premium");
        }
        
                else if(condiciones==2){
            System.out.println("Estimado conductor, usted a sido asignado con categoria Estandar");
        }
        
                else{
                    System.out.println("No cumple con los requisitos para ser asignado con alguna categoria");
                }
        
        
        
        
    
    }
}
