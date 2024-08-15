package misrc;

public class Principal9 {

    public static void main(String[] args) {
        /*
        FORMA LARGA
        double n1 = 5.6;
        double n2 = 8.1;
        double n3 = 5.6;
        double n4 = 8.1;
        double n5 = 5.6;
        */
         
        //FORMA ABREVIADA, COMO DEBERÍA HACERSE
        double[] nota = {5.6,8.1,5.6,8.1,5.6}; //5 numeros
        System.out.println("Nota 1: " + nota[0]);
        
        try {
        System.out.println("Nota 6: " + nota[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("INDICE 5 NO EXISTE");
        }
        
        //EJEMPLO 2: RECORRER UN ARRAY (PROMEDIO) = SUMA/5
        double suma = 0.0;
        for(int i=0; i<nota.length; i++) {
            suma = suma + nota[i];
        }
        System.out.println("FORMA 1, Promedio: " + suma/nota.length);
        suma = 0;
        for(double n: nota) { //FORMA 2: foreach = for. Se usa cuando no necesito el índice.
            suma = suma + n;
    
        }
        System.out.println("FORMA 2, Promedio: " + suma/nota.length);
    
            
    
    
    
    
    
    }
    
    
    
    
}
