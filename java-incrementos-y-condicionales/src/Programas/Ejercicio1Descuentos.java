/*
Un supermercado ofrece descuentos de acuerdo con el valor de compra:
• Menor a $100.000 → Sin descuento.
• Entre $100.000 y $300.000 → 10% de descuento.
• Entre $300.001 y $500.000 → 15% de descuento.
• Mayor a $500.000 → 20% de descuento.
Requerimientos
El programa debe:
• Solicitar el valor de la compra.
• Mostrar:
o Descuento aplicado.
o Valor descontado.
o Total a pagar.
 */
package Programas;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio1Descuentos {
    
    public static void main(String[] args) {
    double valcompra;
    double valordescontado;
    double totalpago;
    double descuento;
    
    
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite el valor de la compra");   
        valcompra=sc.nextDouble();
        
        if(valcompra>500000){
        
        descuento=valcompra*0.20;
        valordescontado=descuento;
        totalpago=valcompra-valordescontado;
        
            System.out.println("Tiene derecho a un 20% de descuento");
            System.out.println("Valor descontado: "+valordescontado);
            System.out.println("Total a pagar con descuento aplicado: "+totalpago);
        
    }
        else if(valcompra>300000 && valcompra<=500000){
         
            
        descuento=valcompra*0.15;
        valordescontado=descuento;
        totalpago=valcompra-valordescontado;
        
            System.out.println("Tiene derecho a un 15% de descuento");
            System.out.println("Valor descontado: "+valordescontado);
            System.out.println("Total a pagar con descuento aplicado: "+totalpago);
            
        }
        
        else if(valcompra>=100000 && valcompra<=300000){
            
        descuento=valcompra*0.10;
        valordescontado=descuento;
        totalpago=valcompra-valordescontado;
        
            System.out.println("Tiene derecho a un 10% de descuento");
            System.out.println("Valor descontado: "+valordescontado);
            System.out.println("Total a pagar con descuento aplicado: "+totalpago);
            
        }
        
        else{
            System.out.println("Su compra no supera los $99.999, no tiene derecho a descuento.");
            System.out.println("Total a pagar, sin descuento: "+valcompra);
        }
     
           
}

}