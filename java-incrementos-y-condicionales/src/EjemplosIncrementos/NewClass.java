/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosIncrementos;

/**
 *
 * @author USUARIO
 */
public class NewClass {
     public static void main(String[] args) {
        
        System.out.println("Usando posincremento dentro del ciclo:");
        int i = 0;
        for (int contador = 0; contador < 5; contador++) {
            System.out.println("i++ = " + i++); // usa el valor actual, LUEGO incrementa
        }
        System.out.println("Valor final de i: " + i);
        
        System.out.println("\nUsando preincremento dentro del ciclo:");
        int j = 0;
        for (int contador = 0; contador < 5; contador++) {
            System.out.println("++j = " + ++j); // incrementa PRIMERO, luego usa
        }
        System.out.println("Valor final de j: " + j);
    }
}
