package vector;

import java.util.Scanner;

public class Principal1 {

       public static void main(String[] args) {
   //FORMAS DECLARAR VECTOR
   System.out.println("FORMAS DECLARAR VECTOR");
   System.out.println("----------------------");
   System.out.println("ESTATICA"); 
                 //0 1 2 3 4 5 6 7 8 (POSICION: VECTOR)
   int[] vector = {1,2,3,4,5,6,7,8,9};        
   for (int i=0; i<vector.length; i++) {
          System.out.print(vector [i] + " ");
    }
   System.out.println();
   
   
   System.out.println("DINAMICO");
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Ingrese tamaño vector? ");
   int n= sc.nextInt();
   int [] vector1 = new int [n];
   for (int i=0; i<vector1.length; i++) {
   
       
   System.out.print("Ingrese numero [" + i + "] = ");
   vector1 [1] = sc.nextInt();
   
   
   
    }
    
}
}