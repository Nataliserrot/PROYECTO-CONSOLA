package examen;

import java.util.Scanner;

public class Ejercicio2_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.print("Ingrese valor ");
        a = sc.nextInt();
        System.out.print("Ingrese valor ");
        b = sc.nextInt();
        System.out.print("Ingrese valor ");
        c = sc.nextInt();

        if (a < b && b < c) {

            System.out.println("ESTÁN ORDENADOS EN FORMA CRECIENTE");

        } else {
            System.out.println("NO ESTÁN ORDENADOS EN FORMA CRECIENTE");

        }
    }
}
