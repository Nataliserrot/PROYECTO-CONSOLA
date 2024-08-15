package triangulo;

import circulo.Libreria;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);    
        
        //1. DECLARACION VARIABLES
       double area, base, altura;
       
        //2. ENTRADA
       System.out.println("Ingrese base");
       base = sc.nextDouble();
       System.out.println("Ingrese altura"); 
       altura = sc.nextDouble();
       
        //3. PROCESO
       area = base * altura / 2;
                
        //4. SALIDA
      System.out.println("area: " + Libreria.redondear(area));
      
      
        
    }
    
}
