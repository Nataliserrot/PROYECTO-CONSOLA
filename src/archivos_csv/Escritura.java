package archivos_csv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Escritura {

    public static void main(String[] args) {
        // ESCRITURA DE UN ARCHIVO
        File f; // CONVERTIR EL ARCHIVO FISICO EN OBJETO
        FileWriter fw; // ABRIR UNA CANALETA DE COMUNICACION (ORIGEN - DESTINO)
        BufferedWriter bw; //ESCRIBIR
        String fila = "";

        int[] n1 = {6, 4, 7};
        int[] n2 = {5, 2, 9};
        int[] n3 = {7, 6, 8};
        int[] n4 = {6, 5, 7};

        try {
            f = new File("data/notas.csv");
            fw = new FileWriter(f,true);
            bw = new BufferedWriter(fw);
            
            for (int i=0; i<n1.length; i++) {
                fila = n1[i] + ";" + n2[i] + ";" + n3[i] + ";" + n4[i]; //ESTO SERIA UN CSV QUE PLASMARIA INFORMACION EN EL ARCHIVO .CSV FUERA DEL JAVA
                bw.write(fila + "\r\n");
            }
            bw.flush(); //GRABAR EN DISCO(ARCHIVO FUERA DEL JAVA)
        } catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
