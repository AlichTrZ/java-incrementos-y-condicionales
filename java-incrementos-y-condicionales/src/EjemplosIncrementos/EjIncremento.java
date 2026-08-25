
package Pack1;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class EjIncremento {
    public static void main(String[] args) {
        int intentos=0;
                
        int intentoActual = intentos++;
        System.out.println("Intentos registrados: "+intentoActual);
        System.out.println("Total intentos: "+intentos);
        
        int siguienteIntento = ++intentos;
        System.out.println("Siguiente intento: "+siguienteIntento);
        System.out.println("Intentos totales ahora: "+intentos);
    }
}
