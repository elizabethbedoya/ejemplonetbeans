/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio.sesionjava;

import java.util.Scanner;

/**
 *
 * @author ADMIN     
 */
public class Sesionjava { //clase

    public static void calculartriangulo(){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el lado A del triangulo ");
    double a=sc.nextDouble();
    System.out.print("Ingrese el lado B del triangulo ");
    double b=sc.nextDouble();
    System.out.print("Ingrese el lado C del triangulo ");
    double c=sc.nextDouble();
    System.out.print("Ingrese la altura (H)del triangulo ");
    double h=sc.nextDouble();
    
    double perimetro = a + b +c;
    double area = (b * h) /2;
    
        System.out.println("El perimetro del triangulo es: "+perimetro);
         System.out.println("La area del triangulo es: "+area);
    }
    
    public static void calcularrectangulo(){
     Scanner sc = new Scanner(System.in);
     System.out.print("Ingrese la altura del rectangulo ");
    double a =sc.nextDouble();
    System.out.print("Ingrese la base del rectangulo ");
    double b=sc.nextDouble();
    double perimetro = 2 * (b+a);
    double area = b * a;
    
    System.out.println("El perimetro del rectangulo es: "+perimetro);
    System.out.println("La area del rectangulo es: "+area);
   }
    
    public static void calcularcuadrado(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el lado A del cuadrado ");
    double a =sc.nextDouble();
    double perimetro = 4 * a;
    double area = a * a;
    System.out.println("El perimetro del cuadrado es: "+perimetro);
    System.out.println("La area del cuadrado es: "+area);
    }
    
    public static void calcularcirculo(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el radio del circulo ");
    double r =sc.nextDouble();
    double perimetro = 2 * Math.PI * r * r;
    double area = Math.PI * r * r;
    System.out.println("El perimetro del circulo es: "+perimetro);
    System.out.println("La area del circulo es: "+area);
      
    }
 public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int opcion;
      
      do {
          System.out.println("\nSeleccione la figura para calcular el area y el perimetro: ");
          System.out.println(" 1. Triangulo ");
          System.out.println(" 2. Rectangulo ");
         System.out.println(" 3. Cuadrado ");
         System.out.println(" 4. Circulo ");
         System.out.println(" 5. Salir ");
         System.out.println(" Escriba una Opcion: ");
         opcion = sc.nextInt();
         
         switch(opcion){
             case 1: calculartriangulo();
             break;
             case 2: calcularrectangulo();
             break;
              case 3: calcularcuadrado();
             break;
              case 4: calcularcirculo();
             break;
              default:
               System.out.println("Saliendo del programa...");
               break;
             // default: 
            // System.out.println("Opcion no valida.. ");
            // break;
         
         }
         
      
      } while (opcion != 5);
 } 
     
 }
   

  
  
   
 
 

   