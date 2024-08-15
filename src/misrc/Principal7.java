package misrc;

public class Principal7 {

    public static void main(String[] args) {
        System.out.println("VERSION 1");
        version1 ();
    }
       public static void version1 () {
        //1. DECLARACION DE VARIABLES
            int c = 0;                                                          // CONTADOR C SU PUNTO DE PARTIDA VA A SER 0 POR ESO SE ANIDAN ASÍ
            int c1, c2, c3, c4, c5, c6;
            c1=c2=c3=c4=c5=c6=0;        
             
        //2. PROCESO
            for (int i = 0; i <= 100; i++) {                                    //CANTIDAD DE INTERACCIONES DEL DADO: 100 VECES
            int dado = (int) (Math.random() * 6 + 1);                           //LANZAMIENTOS ALEATORIOS MATH.RANDOM
            System.out.print(dado + " ");
            if (c == 11) {
            System.out.println();
            c = 0;
            
            }
        
        c++;
        switch (dado){
        case 1: c1++;break;
        case 2: c2++;break;
        case 3: c3++;break;
        case 4: c4++;break;
        case 5: c5++;break;
        case 6: c6++;break;
        
        }    
    }
    System.out.println("Lado 1: " + c1);
    System.out.println("Lado 2: " + c2);
    System.out.println("Lado 3: " + c3);
    System.out.println("Lado 4: " + c4);
    System.out.println("Lado 5: " + c5);
    System.out.println("Lado 6: " + c6);
        
    }
    
    
      public static void version2 () {
        int c = 0;
        int c1, c2, c3, c4, c5, c6;
            c1=c2=c3=c4=c5=c6=0;                                                // CONTADOR C SU PUNTO DE PARTIDA VA A SER 0 POR ESO SE ANIDAN ASÍ
        for (int i = 0; i <= 100; i++) {                                        //CANTIDAD DE INTERACCIONES DEL DADO: 100 VECES
            int dado = (int) (Math.random() * 6 + 1);                           //LANZAMIENTOS ALEATORIOS MATH.RANDOM
            System.out.print(dado + " ");
            if (c == 11) {
            System.out.println();
            c = 0;
            
            }
        
        c++;
        switch (dado){
        case 1: c1++;break;
        case 2: c2++;break;
        case 3: c3++;break;
        case 4: c4++;break;
        case 5: c5++;break;
        case 6: c6++;break;
        
        }    
    }
    System.out.println("Lado 1: " + c1);
    System.out.println("Lado 2: " + c2);
    System.out.println("Lado 3: " + c3);
    System.out.println("Lado 4: " + c4);
    System.out.println("Lado 5: " + c5);
    System.out.println("Lado 6: " + c6);
        
    }
      
      
        public static void version3 () {
        int c = 0;
        int c1, c2, c3, c4, c5, c6;
            c1=c2=c3=c4=c5=c6=0;                                                // CONTADOR C SU PUNTO DE PARTIDA VA A SER 0 POR ESO SE ANIDAN ASÍ
        for (int i = 0; i <= 100; i++) {                                        //CANTIDAD DE INTERACCIONES DEL DADO: 100 VECES
            int dado = (int) (Math.random() * 6 + 1);                           //LANZAMIENTOS ALEATORIOS MATH.RANDOM
            System.out.print(dado + " ");
            if (c == 11) {
            System.out.println();
            c = 0;
            
            }
        
        c++;
        switch (dado){
        case 1: c1++;break;
        case 2: c2++;break;
        case 3: c3++;break;
        case 4: c4++;break;
        case 5: c5++;break;
        case 6: c6++;break;
        
        }    
    }
    System.out.println("Lado 1: " + c1);
    System.out.println("Lado 2: " + c2);
    System.out.println("Lado 3: " + c3);
    System.out.println("Lado 4: " + c4);
    System.out.println("Lado 5: " + c5);
    System.out.println("Lado 6: " + c6);
        
    }
    
    
}
     


