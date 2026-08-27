<h1> Taller 1 - Operadores de Incremento e Instrucciones Condicionales en Java <img width="50" height="50" alt="java" src="https://github.com/user-attachments/assets/91f5b5bd-f17f-466a-b594-732dc8cba8b9" > </h1>

Se desarrollan varios ejercicios enfocados al uso de condicionales e incrementos. Taller 1 POO  

**Presenta:** Andres Felipe Trochez Lugo  
**Programa Academico:** Tecnologia en Desarrollo de Software   
**Fecha de Entrega:** 26 de agosto del 2026.  

# Objetivo General

Aplicar los conceptos de preincremento (++variable), posincremento (variable++) y las diferentes estructuras condicionales de Java (if, if-else, if-else if, if anidados y condiciones compuestas con operadores lógicos) mediante ejercicios prácticos,investigativos y situaciones del mundo real. 

# Actividades 
 **1. Investigar:**  
    
- **¿Qué es un operador de incremento?**  

  Operador de incremento (++): operador unitario en Java que aumenta en 1 el valor de una variable numérica. Puede usarse como preincremento (++variable), que incrementa el valor antes de usarlo en la expresión, o como posincremento (variable++), que lo incrementa después de usarlo.

  
- **¿Qué diferencia existe entre preincremento y posincremento?**
  
  **Preincremento (++variable):** incrementa el valor de la variable antes de usarla en la expresión.

  **Posincremento (variable++):** incrementa el valor de la variable después de usarla en la expresión.
  
  <img width="957" height="166" alt="image" src="https://github.com/user-attachments/assets/5314a911-b368-4ec9-9819-138034ff8d09" />

 

- **¿En qué situaciones producen resultados distintos?**
  
  Preincremento y posincremento producen resultados distintos solo cuando se usan dentro de una expresión más grande (una asignación, una condición, un parámetro de método, un ciclo for, etc.), ya que ahí importa el momento en que ocurre el incremento respecto al uso del valor. Si el operador se usa solo, en su propia línea (a++; o ++a;), el resultado es idéntico en ambos casos.

  <img width="956" height="178" alt="image" src="https://github.com/user-attachments/assets/54b02e53-a88a-4373-be26-de5a9fe0695b" />  



**2. Ejecutar el siguiente código y analizar sus resultados:**


<img width="700" height="519" alt="Captura de pantalla 2026-08-24 173645" src="https://github.com/user-attachments/assets/386b2ebd-2b5d-405c-8024-6a035d318ec8" />  

- **Tabla comparativa de resultados**

  
  <img width="700" height="320" alt="image" src="https://github.com/user-attachments/assets/eb269dbf-1c02-49c5-8b35-9246f9477b09" />






- **Ejemplos de aplicacion Preincremento y Posincremento**  
    En una asignacion  
  <img width="700" height="400" alt="image" src="https://github.com/user-attachments/assets/6d0b9db3-830c-4c60-9e42-5f7d6301f23b" />



  Con operaciones matematicas  
  <img width="700" height="400" alt="image" src="https://github.com/user-attachments/assets/33ca186f-ba82-44f3-a327-3ba3ce941bb2" />

  Dentro de un ciclo for  
  <img width="700" height="400" alt="image" src="https://github.com/user-attachments/assets/f4b0172e-8335-404b-9863-2982edc0f256" />


<h2>Parte 2 | Programacion con If</h2>      

Desarrollar los siguientes ejercicios utilizando diferentes variantes de las estructuras condicionales de Java.  

# Ejercicio 1. Sistema de Descuentos para un Supermercado  
Nivel: Intermedio  
Tipo de estructura: if - else if - else


**Un supermercado ofrece descuentos de acuerdo con el valor de compra:**    
• Menor a $100.000 → Sin descuento.  
• Entre $100.000 y $300.000 → 10% de descuento.  
• Entre $300.001 y $500.000 → 15% de descuento.  
• Mayor a $500.000 → 20% de descuento.  

**Requerimientos**    
El programa debe:  
- Solicitar el valor de la compra.  

• Mostrar:  
- Descuento aplicado.  
- Valor descontado.  
- Total a pagar.

```java
package Programas;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio1Descuentos {
    
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

```

- **Evidencia de la ejecución del programa**

  
  <img width="1280" height="720" alt="image" src="https://github.com/user-attachments/assets/82b94d2f-8a84-4604-a603-331fa303788c" />



 - **Analisis del resultado**
   
   Probé el programa con los valores límite de cada rango (99.999, 100.000, 300.000, 300.001, 500.000 y 500.001) para asegurarme de que el descuento se calculara bien en los casos más "riesgosos", es decir, justo en el borde entre un rango y otro. En todas las pruebas el resultado fue el esperado, así que la estructura if / else if / else está funcionando correctamente y cada valor cae en el rango que le corresponde.



# Ejercicio 2. Control Inteligente de Acceso a un Conjunto Residencial  
Nivel: Intermedio - Avanzado
Tipo de estructura: if anidados  

**Para ingresar al conjunto residencial se verifica:**  
1. Si el residente tiene tarjeta de acceso.  
2. Si la tarjeta está activa.  
3. Si no posee deudas de administración.

**Requerimientos**  

**Solicitar:**   
• Tiene tarjeta (Sí/No)  
• Tarjeta activa (Sí/No)  
• Tiene deudas (Sí/No)  

**El sistema debe indicar:**  
• Acceso permitido.  
• Acceso restringido por tarjeta inactiva.  
• Acceso restringido por mora.  
• Acceso denegado por ausencia de tarjeta.  


```java
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

```


- **Evidencia de la ejecución del programa**


  <img width="1280" height="720" alt="image" src="https://github.com/user-attachments/assets/bba501de-1ba6-4ace-b8cb-48253e63da2b" />




- **Analisis del resultado**  
 Probé las 8 combinaciones posibles entre tarjeta, estado de la tarjeta y deudas, para asegurarme de que el programa respondiera bien sin importar el orden en que fallaran las condiciones. En todos los casos el resultado fue el esperado: primero se valida si tiene tarjeta, luego si está activa, y por último si tiene deudas, dando acceso solo cuando las tres cosas están en orden.
  




# Ejercicio 3. Plataforma de Transporte Compartido
Nivel: Avanzado
Tipo de estructura: Condiciones compuestas

**Una aplicación de transporte asigna un conductor premium únicamente si:**  
-Tiene calificación superior o igual a 4.8.  
-Ha realizado más de 500 viajes.  
-Se encuentra disponible.  


Si cumple dos de las tres condiciones será asignado como conductor estándar.  
En cualquier otro caso no podrá ser asignado.  


**Requerimientos**  
Solicitar:  
-Calificación.  
-Cantidad de viajes.  
-Disponibilidad.  
Mostrar el tipo de asignación.  




```java
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

```


- **Evidencia de la ejecución del programa**  


<img width="1280" height="720" alt="image" src="https://github.com/user-attachments/assets/11d04811-0c63-4094-8391-1afa1c1161f2" />





- **Analisis del resultado**  
Probé las 8 combinaciones posibles entre calificación, viajes y disponibilidad, para revisar que el contador fuera sumando bien en cada caso. En todas las pruebas el resultado fue el correcto: Premium cuando se cumplen las 3 condiciones, Estándar cuando se cumplen exactamente 2, y sin asignación cuando se cumple 1 o ninguna.  






# Ejercicio 4. Sistema de Aprobación de Crédito Bancario
Nivel: Avanzado  
Tipo de estructura: if - else if con operadores lógicos  

**Un banco estudia solicitudes de crédito bajo las siguientes condiciones:**  

**Crédito Aprobado**  
-Ingresos mayores a $5.000.000.  
-Puntaje crediticio superior a 750.  
-Antigüedad laboral mayor a 2 años.  

**Crédito Condicionado**  
Si cumple al menos dos de los criterios anteriores.  

**Crédito Rechazado**  
Si solamente cumple uno o ninguno.  

**Requerimientos**  
Solicitar la información del cliente y mostrar el resultado de la evaluación.  

```java
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

```


- **Evidencia de la ejecución del programa**
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/3b9c7122-3d56-4a27-a39b-a9b2edb50f11" />



- **Analisis del resultado**  
  Le hice pruebas a las 8 combinaciones posibles entre ingresos, puntaje y antigüedad laboral, para asegurarme de que el contador sumara bien sin importar cuál condición se cumpliera. Todo dio como se esperaba: aprobado cuando se cumplen las 3, condicionado con exactamente 2, y rechazado con 1 o ninguna.


# Ejercicio 5. Sistema de Viajes de una Aerolínea
Nivel: Avanzado  
Tipo de estructura: if anidados + condiciones múltiples  


**Una aerolínea desea clasificar a sus pasajeros:**  

**Categoría Oro**  
-Más de 50 vuelos en el año.  
-Membresía activa.  

**Categoría Plata**  
-Entre 20 y 50 vuelos.  
-Membresía activa.  

**Categoría Básica**  
-Menos de 20 vuelos.  
-O no posee membresía.  

**Además:**  
-Si el pasajero es categoría Oro y tiene más de 70 vuelos, recibe acceso VIP.  

**Requerimientos**  
Mostrar:  
• Categoría obtenida.  
• Si tiene acceso VIP.  



 ```java
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

```



- **Evidencia de la ejecución del programa**
<img width="1280" height="720" alt="image" src="https://github.com/user-attachments/assets/ff8000dd-ac4c-4561-8603-e27371a3a79c" />




- **Analisis del resultado**
Probé varios casos combinando cantidad de vuelos y membresía, y en todos el programa asignó bien la categoría (Oro, Plata o Básica) y detectó el acceso VIP solo cuando debía. Lo interesante es que ni siquiera tuve que validar directamente lo de "sin membresía", porque el else final ya se encarga de cubrir ese caso.  




# ¿Qué dificultades y aprendizajes encontré durante el desarrollo?

- Al principio me costó entender bien la diferencia entre preincremento y posincremento, sobre todo cuando se usaban dentro de una asignación o mezclados en una misma expresión.  

- Me confundí pensando que la variable de control del for (como contador) tenía alguna relación con otra variable que usaba dentro del ciclo (i), cuando en realidad eran totalmente independientes.  

- Me salieron varios errores de variable no inicializada, porque usaba variables como descuento o condiciones sin haberles dado un valor inicial en todos los caminos posibles del código.  

- Se me olvidó cerrar llaves en algunos if y métodos, lo que me generaba errores como "reached end of file while parsing".  

- En un punto intenté declarar el Scanner dos veces dentro del mismo método, sin darme cuenta de que solo debía crearlo una vez y reutilizarlo.  

- Aprendí que en Java no se puede comparar texto con ==, sino que hay que usar .equals() o .equalsIgnoreCase(). Que a la final me convenció mucho más la segunda opción, porque tomaba en general la palabra, admitía minúsculas o mayúsculas y aún así evaluaba lo que necesitaba.  

- En los ejercicios donde tenía que contar cuántas condiciones se cumplían (como el de transporte o el de crédito), al principio encadené todo con else if, lo que hacía que no se evaluaran todas las condiciones por separado. Tuve que corregirlo usando if independientes para contar, y dejar el else if solo para mostrar el resultado final.  

- Tuve un problema con el Scanner, porque al leer un número con nextDouble() o nextInt() y luego intentar leer texto con nextLine(), la entrada de texto se leía vacía. Tocó agregar un nextLine() extra para "limpiar" ese salto de línea pendiente.  

- En un ejercicio mezclé .equals() y .equalsIgnoreCase() sin darme cuenta, lo que hacía que algunas respuestas en minúscula no se reconocieran bien.  

- También me tocó corregir el nombre de algunas variables porque no seguían bien la convención camelCase, como estadotar en vez de estadoTarjeta, algo que no generaba error pero sí afectaba la legibilidad del código.  


  








  



