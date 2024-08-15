package crear_banco_datos;

import java.util.ArrayList;

public class Probando {

    public static void main(String[] args) {
        
        ArrayList<String> nombres_al = new ArrayList<>();
        
        nombres_al.add("Miguel");
        nombres_al.add("Carlos");
        
        if(nombres_al.contains("Carlas")) {
            System.out.println("SI ESTÁ");
        }else {
            System.out.println("NO ESTÁ");
        }
        
        String s = nombres_al.get(1);
        System.out.println("Elemento: " + s);
        
       // ArrayList<String> clonedList = (ArrayList<String>) nombres_al;
    }
    
}
