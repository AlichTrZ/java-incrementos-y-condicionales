
package EjemplosIncrementos;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class EjIncremento3 {
    
    public static void main(String[] args) {
        
        System.out.println("Ciclo con posincremento");
        int i=0;
        for(int contador=0;contador<10;contador++){
            System.out.println("i++= "+ i++);
        }
        System.out.println("Valor actual de i= "+i);
        
        System.out.println("Ciclo con preincremento");
        int a=0;
        for(int contador=0;contador<10;++contador){
            System.out.println("++a= "+ ++a);
        }
        System.out.println("Valor actual de a= "+a);
    }
    
}
