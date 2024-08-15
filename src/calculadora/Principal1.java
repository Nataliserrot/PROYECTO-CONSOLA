package calculadora;

import java.util.Scanner;

public class Principal1 {
    
    public static final  String[] OPERACIONES = {"SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "POTENCIA"};
               
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  numero1, numero2;
        double resultado=0;
        String operacion;
        
       System.out.println("CALCULADORA");
   
       System.out.println("+ : (SUMA)");
        System.out.println("- :(RESTA)");
        System.out.println("* : (MULTIPLICACION)");
        System.out.println("/ : (DIVISION)");
        System.out.println("# :(POTENCIA)");
                
       
     
   System.out.print("Ingrese numero 1 ");
        numero1 = sc.nextInt();
        System.out.print("Ingrese numero 2 ");
        numero2 = sc.nextInt();
    System.out.print("Elija operación ");
       operacion= sc.next();
       
       switch (operacion) {
           case "+": resultado = numero1 + numero2;
           break;
           case "-": resultado = numero1 - numero2;
           break;
           case "*": resultado = numero1 * numero2;
           break;
           case "/": resultado = numero1 / numero2;
           break;
           case "#": resultado = Math.pow(numero1, numero2);
           break;
           
           default: System.out.println("OPERADOR INCORRECTO");
          
       }
       
       System.out.println("Resultado " + resultado); 
       
           
    }
    
}
    


