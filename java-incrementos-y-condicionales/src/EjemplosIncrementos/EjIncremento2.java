
package EjemplosIncrementos;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class EjIncremento2 {
    public static void main(String[] args) {
        
        int a=4;
        
        //Primero usaré el posincremento en una suma
        int resultSuma = a++ + 12;
        System.out.println("Primer resultado de suma: "+resultSuma);
        System.out.println("Valor de a ahora: "+a);
        
        //Ahora usaré el preincremento en una resta
        int resultResta = ++a - 12;
        System.out.println("Segundo resultado de la resta "+resultResta);
        System.out.println("Valor de a ahora: "+a);
                
        
    }
}
