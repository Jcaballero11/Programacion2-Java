/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TrabajoPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Java");
        /*Crea un programa que declare las siguientes variables con valores asignados: 
        a. String nombre  
        b. int edad  
        c. double altura  
        d. boolean estudiante*/
        
        /*Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        double estatura;
        boolean estudiante;
        String respuesta;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese su estatura: ");
        estatura = Double.parseDouble(input.nextLine());
        
        System.out.print("Es estudiante? (True/False): ");
        respuesta = input.nextLine();
        estudiante = Boolean.parseBoolean(respuesta);
        
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su estatura es: " + estatura);
        System.out.print("Su respuesta fue:  " + estudiante);
        
        input.nextLine();*/
        
        /*Escribe un programa que solicite dos números enteros y realice las siguientes 
        operaciones:   
        a. Suma   
        b. Resta   
        c. Multiplicación   
        d. División*/
        
        /*Scanner ej5 = new Scanner(System.in);
        int numero1, numero2, suma, resta, mul;
        
        System.out.print("Ingrese el primer numero: ");
        numero1 = Integer.parseInt(ej5.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        numero2 = Integer.parseInt(ej5.nextLine());
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mul = numero1 * numero2;
        double division = (double) numero1 / numero2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + mul);
        System.out.println("División: " + division);
        
        System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");*/
        
        /*Analiza el siguiente código y responde: ¿Cuáles son expresiones y cuáles son 
        instrucciones? Explica la diferencia en un breve párrafo.  
        int x = 10; // Línea 1 La expresion se guarda en variables para que tenga sentido y funcione el codigo
        x = x + 5; // Línea 2  Son expresiones sueltas que no hacen funcionar el codigo.
        System.out.println(x); // Línea 3 Es un metodo que imprime en pantalla*/
        
        /* Manejar conversiones de tipo y división en Java.  
        a. Escribe un programa que divida dos números enteros ingresados por el usuario.  
        b. Modifica el código para usar double en lugar de int y compara los resultados. */
        
        /*Scanner ej8 = new Scanner(System.in);
        int num1, num2;
        //double division;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(ej8.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(ej8.nextLine());
        
        int resultado = num1 / num2;
        System.out.println("Resultado de la división entera: " + resultado);*/
        
        
        
        /*Scanner ej8b = new Scanner(System.in);
        double nro1, nro2, resultado;
        
        System.out.print("Ingrese el primer numero: ");
        nro1 = Double.parseDouble(ej8b.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        nro2 = Double.parseDouble(ej8b.nextLine());
        
        resultado = nro1 / nro2;
        System.out.println("Resultado de la división es: " + resultado);*/
        
        /*Corrige el siguiente código para que funcione correctamente. Explica qué error tenía y cómo lo solucionaste. 
        import java.util.Scanner; 
        public class ErrorEjemplo { 
        public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa tu nombre: "); 
        String nombre = scanner.nextInt(); // ERROR , debe cambiarse nextIn por nextLine ya que lo que queremos es leer
        lo que el usuario ingresó en formato de texto y no numeros
        System.out.println("Hola, " + nombre); 
        } 
       } */
        
    }
    
}
