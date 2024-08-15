package examen;

import java.util.Scanner;

public class Ejercicio2_181 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ts = 0;
        double s = 0;
        String categoria = "";

        System.out.print("Ingrese Tiempo de Servicio ");
        ts = sc.nextInt();
        System.out.print("Ingrese Sueldo? ");
        s = sc.nextInt();

        if (ts >= 0 && ts < 10) {

            System.out.println("CATEGORIA D");
            categoria = "D";

        }
        if (ts >= 10 && ts < 15) {

            System.out.println("CATEGORIA C");
            categoria = "C";
        }
        if (ts >= 15 && ts < 20) {

            System.out.println("CATEGORIA B");
            categoria = "B";

        }
        if (ts >= 20 && ts < 30) {

            System.out.println("CATEGORIA A");
            categoria = "A";

        }

        switch (categoria) {
            case "A":
                s = s * 1.15;
                System.out.println(s);
                break;
            case "B":
                s = s * 1.12;
                System.out.println(s);
                break;
            case "C":
                s = s * 1.10;
                System.out.println(s);
                break;
            case "D":
                s = s + 15;
                System.out.println(s);
                break;
        }
    }

}
