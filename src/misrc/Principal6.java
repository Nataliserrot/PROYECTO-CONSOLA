
package misrc;

public class Principal6 {

    public static void main(String[] args) {
        
        /*
        System.out.println("FOR");
            for (int i = 1; i <= 100; i++) {
            int dado = (int)(Math.random ()* 6 + 1);
            int contador = 1;
            System.out.println(dado + " ");
         if (contador > 7) {
             
         }
         contador++; //TAREA: CASE PARA CONTAR LA CANTIDAD DE VECES QUE ARROJO CADA NUMERO DEL DADO
        }
        */
    

    
        System.out.println("FOR");
        long n = Long.MAX_VALUE;
        int contador = 1;
        for (long i = n; i > 1; i = i - 1) {
            System.out.print(i + " ");
         if (contador > 7) {
             System.out.println();
             contador = 1;
         }
         contador++;
        
        
}
        
    }
    }
    