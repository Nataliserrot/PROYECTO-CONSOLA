package misrc;

import java.util.Scanner;

public class Principal8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese número real?");
        String numero = sc.next();
        
        double cuadrado = Math.pow(Double.parseDouble(numero),2);
        System.out.println("Cuadrado: " + cuadrado);
        
        
    }
    
}
