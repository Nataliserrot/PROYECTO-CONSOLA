package crear_banco_datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Principal1 {

    public static void main(String[] args) {
        //1. LLENAR UN ARRAYLIST CON LOS NOMBRES (HOMBRE Y MUJER)
        Scanner sc = new Scanner(System.in);

        List<String> nombres_al = new ArrayList<>();
        List<String> apellidos_al = new ArrayList<>();
        
        List<String> hombres_al = new ArrayList<>();
        List<String> mujeres_al = new ArrayList<>();

        //LEER ARCHIVO DE HOMBRES
        File f;
        FileReader fr;
        BufferedReader br;

        String nombre = "";
        try {
            f = new File("data/masculino.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((nombre = br.readLine()) != null) {
                nombres_al.add(nombre);
                hombres_al.add(nombre);
            }
            System.out.println("OK: LECTURA NOMBRE MASCULINO");
        } catch (Exception e) {
            System.out.println("ERROR DE LECTURA MASC");
        }

        try {
            f = new File("data/femenino.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((nombre = br.readLine()) != null) {
                nombres_al.add(nombre);
                mujeres_al.add(nombre);
            }
            System.out.println("OK: LECTURA NOMBRE FEMENINO");
        } catch (Exception e) {
            System.out.println("ERROR DE LECTURA FEM");
        }

        System.out.println(Arrays.asList(nombres_al));

        //LEER ARCHIVO DE APELLIDOS
        String apellido = "";
        try {
            f = new File("data/apellido.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((apellido = br.readLine()) != null) {
                apellidos_al.add(apellido);
            }
            System.out.println("OK: LECTURA APELLIDO");
        } catch (Exception e) {
            System.out.println("ERROR DE LECTURA APELLIDO");
        }

        System.out.println(Arrays.asList(apellidos_al));

        System.out.print("INGRESAR CUANTAS PERSONAS QUIERE GENERAR? ");
        int n = sc.nextInt();
        Set<String> personas_ts = new TreeSet<>();

        System.out.println("Tamano nombre.txt: " + nombres_al.size());
        System.out.println("Tamano apellido.txt: " + apellidos_al.size());
        
        String sexo = "";
        for (int i = 0; true; i++) {
            int aleatorioNombre = (int) (Math.random() * nombres_al.size());
            nombre = nombres_al.get(aleatorioNombre);
            if(hombres_al.contains(nombre)) {
                sexo = "H";
            }else {
                sexo = "M";
            }

            int aleatorioApellido = (int) (Math.random() * apellidos_al.size());
            apellido = apellidos_al.get(aleatorioApellido);

            String persona = nombre + " " + apellido + ";" + sexo;
            System.out.println((i + 1) + " " + persona);

            personas_ts.add(persona);
            if (personas_ts.size() == n) {
                break;
            }

            if (personas_ts.size() == (nombres_al.size() * apellidos_al.size())) {
                System.out.println("DATOS DISPONIBLES NO SUFICIENTES");
                break;
            }

        }
        
        List<String> personas1_al = new ArrayList<>(personas_ts);
        List<String> personas2_al = new ArrayList<>();
        int k = 1;
        for (int i=0; i<personas1_al.size(); i++){
            String s = personas1_al.get(i);
            String p1 = (k++) + ";" + s +";" + MetodoArchivo.obtenerFechaNacimientoAleatorio();
            personas2_al.add(i,p1);
        }
        
        System.out.println("CONFIRMAR CAMBIOS");
        for(String p2: personas2_al) {
            System.out.println(p2);
        }
        
        /*
        System.out.println("PERSONAS DISTINTAS Y ORDENADAS");
        int j = 0;
        for (String p : personas_ts) {
            System.out.println((++j) + "" + p);
        }
        */
        //ESCRIBIR LAS PERSONAS DISTINTAS EN UN ARCHIVO
        
        FileWriter fw; 
        BufferedWriter bw;
        String fila = "";
        
        try {
            f = new File("data/persona.txt");
            fw = new FileWriter(f,true); //LA DECLARACION TRUE ES PARA AÑADIR Y QUE NO SE BORRE LA INFORMACION ANTERIOR GUARDADA
            bw = new BufferedWriter(fw);
            //System.out.println("+++++++++++RUN+++++++++++");
            //bw.write("+++++++++++RUN+++++++++++" + "\r\n");
            int l = 1;
            for (String p:personas2_al) {
             bw.write(p + "\r\n");
            
        }
            bw.flush();
            System.out.println("OK: ESCRITURA");
        }catch(Exception e) {
            System.out.println("ERROR: ESCRITURA" + e.getMessage());
        }
        
        
        
    }

}
