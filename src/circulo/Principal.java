package circulo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
       
        //1. DECLARACION VARIABLES
       double radio, area, perimetro;
       
        //2. ENTRADA
       System.out.print("Ingrese radio?"); 
       radio = sc.nextDouble();
       
        //3. PROCESO
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;
        
        //4. SALIDA
        System.out.println("Area: " + Libreria.redondear(area));
        System.out.println("Perimetro: " + Libreria.redondear(perimetro));
        
         
        
    }
    
    
}
