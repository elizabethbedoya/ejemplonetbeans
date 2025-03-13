/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.sesionjava;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class edades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]edades = new int[10];
        int menores =0,mayores=0,adultosmayores=0;
        int edadminima=Integer.MAX_VALUE;
        int edadmaxima=Integer.MIN_VALUE;
        int sumaedades = 0;
        
       //ingreso de edades con validacion 
       for (int i=0; i<10; i++){
         int edad = 0;  
         do{
         System.out.println("Ingrese la edad entre 1 y 120 anios");
         edad =sc.nextInt();
         if (edad < 1 || edad >120){
             System.out.println("Ingrese una edad valida");
         }
         }
          while (edad < 1 || edad >120);
         edades[i]=edad;
         sumaedades+=edad;
       
       //clasificar las edades
       
       if (edad <18){
       menores++;
       }else if (edad >=60){
           adultosmayores++;
       }else {
       mayores++;
       }
    
       //determinar edad mas baja edad mas alta
       
       if(edad <edadminima){
       edadminima=edad;
       }
       if (edad > edadmaxima){
       edadmaxima=edad;
       }
      
    }
       double promedioedades = sumaedades /10;
       System.out.println("cantidad menores de edad " +menores);
        System.out.println("cantidad mayores de edad " +mayores);
         System.out.println("cantidad mayores de 60 " +adultosmayores);
         System.out.println("edad mas alta " +edadmaxima );
          System.out.println("edad mas baja " +edadminima);
           System.out.println("promedio de edad" +promedioedades);
        
    }
    
}
