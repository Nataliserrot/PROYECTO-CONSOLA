package array;

public class Principal2 {

    static int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}

    }; //3*3

    public static void main(String[] args) {
        ejemplo8();
    }

    //MOSTRAR LA DIAGONAL
    public static void ejemplo1() {
        for (int i = 0; i < matriz.length; i++) {           //RECORRIDO POR FILAS
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //MOSTRAR LOS NUMEROS DEBAJO DE LA DIAGONAL
    public static void ejemplo2() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j) {
                    System.out.print(matriz[i][j] + " ");

                }
            }
            System.out.println();
        }
    }

    //MOSTRAR LOS NUMEROS ENCIMA DE LA DIAGONAL
    public static void ejemplo3() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i < j) {
                    System.out.print(matriz[i][j] + " ");

                }
            }
            System.out.println();
        }
        System.out.println("FORMA 2");
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print(matriz[0][j] + " ");
        }
    }

//CAMBIAR LOS ELEMENTOS DE LA MATRIZ, PARES POR 1 E IMPARES POR 0
    public static void ejemplo5() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

//MOSTRAR UNA MATRIZ POR COLUMNAS
    public static void ejemplo6() {
        //RECORRIDO POR FILAS
        System.out.println("RECORRER POR FILAS");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //RECORRIDO POR COLUMNAS
        System.out.println("RECORRER POR COLUMNAS");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
    }

    //MOSTRAR LA SUMA DE CADA FILA Y CADA COLUMNA
    public static void ejemplo7() {
        int sumaf, sumac, sumat = 0;

        //RECORRIDO POR FILAS
        System.out.println("RECORRER POR FILAS");

        for (int i = 0; i < matriz.length; i++) {
            sumaf = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
                sumaf = sumaf + matriz[i][j];
            }
            System.out.println("FILA " + i + ": " + sumaf);

        }
        //RECORRIDO POR COLUMNAS
        System.out.println("RECORRER POR COLUMNAS");

        for (int j = 0; j < matriz[0].length; j++) {
            sumac = 0;
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
                sumac = sumac + matriz[i][j];
                sumat = sumat + matriz[i][j];
            }
            System.out.println("COLUMNA " + j + ": " + sumac);
        }

        System.out.println("SUMA TOTAL: " + sumat);
    }

    public static void ejemplo8() {
        int sumaf, sumac, sumat = 0;
        int[] vectorf = {0, 0, 0};
        int[] vectorc = {0, 0, 0};

        for (int i = 0; i < matriz.length; i++) {
            sumaf = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumaf = sumaf + matriz[i][j];

            }
            vectorf[i] = sumaf;

        }

        for (int j = 0; j < matriz[0].length; j++) {
            sumac = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumac = sumac + matriz[i][j];
                sumat = sumat + matriz[i][j];
            }
            vectorc[j] = sumac;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }

            System.out.printf("%4d\n", vectorf[i]);

        }
        for (int i = 0; i < vectorc.length; i++) {
            System.out.printf("%4d", vectorc[i]);
        }
        System.out.printf("%4d\n", sumat);
    }

}


