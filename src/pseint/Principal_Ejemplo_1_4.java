package pseint;

import java.util.Scanner;

public class Principal_Ejemplo_1_4 {

       
    public static void main(String[] args) {
        versionP001();
        
    }
        
        public static void versionEstructurada() {
        Scanner sc = new Scanner(System.in);

        String codigo;
        double c1, c2, c3, c4, c5, promedio;

        System.out.print("INGRESAR CODIGO MATRICULA ");
        codigo = sc.next();
        System.out.print("INGRESAR CALIFICACION 1 ");
        c1 = sc.nextDouble();
        System.out.print("INGRESAR CALIFICACION 2 ");
        c2 = sc.nextDouble();
        System.out.print("INGRESAR CALIFICACION 3 ");
        c3 = sc.nextDouble();
        System.out.print("INGRESAR CALIFICACION 4 ");
        c4 = sc.nextDouble();
        System.out.print("INGRESAR CALIFICACION 5 ");
        c5 = sc.nextDouble();

        promedio = (c1 + c2 + c3 + c4 + c5) / 5;

        System.out.println("CODIGO       : " + codigo);
        System.out.println("PROMEDIO     : " + promedio);
        System.out.printf("REDONDEADO    : %.0f", promedio);
        
      
    }
    public static void versionP001() { //MANERA DE IMPRIMIR, METODO CORTO
        Ejemplo_1_4 objeto = new Ejemplo_1_4();
        objeto.entrada();
        
        Ejemplo_1_4.cabecera();
        objeto.cuerpo();
}
    
}
