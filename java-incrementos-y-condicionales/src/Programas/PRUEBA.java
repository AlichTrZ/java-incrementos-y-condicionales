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
public class PRUEBA {
    
    public static void main(String[] args) {
    double valCompra;
    double valorDescontado;
    double totalPago;
    double descuento;
    
    
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite el valor de la compra");   
        valCompra=sc.nextDouble();
        
        if(valCompra>500000){
        
        descuento=valCompra*0.20;
        valorDescontado=descuento;
        totalPago=valCompra-valorDescontado;
        
            System.out.println("Tiene derecho a un 20% de descuento");
            System.out.println("Valor descontado: "+valorDescontado);
            System.out.println("Total a pagar con descuento aplicado: "+totalPago);
        
    }
        else if(valCompra>300000 && valCompra<=500000){
         
            
        descuento=valCompra*0.15;
        valorDescontado=descuento;
        totalPago=valCompra-valorDescontado;
        
            System.out.println("Tiene derecho a un 15% de descuento");
            System.out.println("Valor descontado: "+valorDescontado);
            System.out.println("Total a pagar con descuento aplicado: "+totalPago);
            
        }
        
        else if(valCompra>=100000 && valCompra<=300000){
            
        descuento=valCompra*0.10;
        valorDescontado=descuento;
        totalPago=valCompra-valorDescontado;
        
            System.out.println("Tiene derecho a un 10% de descuento");
            System.out.println("Valor descontado: "+valorDescontado);
            System.out.println("Total a pagar con descuento aplicado: "+totalPago);
            
        }
        
        else{
            System.out.println("Su compra no supera los $99.999, no tiene derecho a descuento.");
            System.out.println("Total a pagar, sin descuento: "+valCompra);
        }
     
           
}

}