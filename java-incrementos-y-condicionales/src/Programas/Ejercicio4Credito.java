/*
Crédito Aprobado
• Ingresos mayores a $5.000.000.
• Puntaje crediticio superior a 750.
• Antigüedad laboral mayor a 2 años.
Crédito Condicionado
Si cumple al menos dos de los criterios anteriores.
Crédito Rechazado
Si solamente cumple uno o ninguno.
Requerimientos
Solicitar la información del cliente y mostrar el resultado de la evaluación.
 */
package Programas;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio4Credito {
    public static void main(String[] args) {
        
        String ingresos;
        double puntajeCredito;
        double antiguedad;
        int condiciones=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema de creditos...");
        
        System.out.print("Sus ingresos son superiores a $5.000.000?: ");
        ingresos=sc.nextLine();
        
        System.out.print("Favor, ingresar su puntaje crediticio: ");
        puntajeCredito=sc.nextDouble();
        
        System.out.print("Favor, ingresar la cantidad de años de antiguedad laboral: ");
        antiguedad=sc.nextDouble();
        
        if(ingresos.equalsIgnoreCase("Si")){
            
            condiciones++;
            
        }
        
        if(puntajeCredito>750){
            
            condiciones++;
        }
        
        if(antiguedad>2){
            condiciones++;
        }
        
        
        
        if(condiciones==3){
            System.out.println("--EVALUCACION--");
            System.out.println("Ingresos: "+ingresos);
            System.out.println("Puntaje Crediticio: "+puntajeCredito);
            System.out.println("Antiguedad Laboral "+antiguedad);
            System.out.println("");
            System.out.println("¡Credito Aprobado!");
                    
        }
        
        else if(condiciones==2){
            System.out.println("--EVALUCACION--");
            System.out.println("Ingresos: "+ingresos);
            System.out.println("Puntaje Crediticio: "+puntajeCredito);
            System.out.println("Antiguedad Laboral "+antiguedad);
            System.out.println("");
            System.out.println("¡Credito Condicionado!");
        }
        
        else{
            System.out.println("--EVALUCACION--");
            System.out.println("Ingresos superiores a $5.000.000?: "+ingresos);
            System.out.println("Puntaje Crediticio: "+puntajeCredito);
            System.out.println("Antiguedad Laboral: "+antiguedad);
            System.out.println("");
            System.out.println("¡Credito Rechazado! - No cumple con los requisitos minimos para acceder a un credito");
        }
        
                
    }
    
}
