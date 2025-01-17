package crear_banco_datos;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        //1. CREAR DOS ARCHIVOS NOMBRE_MASCULINO.TXT, NOMBRE_FEMENINO.TXT
        MetodoArchivo.crearArchivo("data/masculino.txt");
        MetodoArchivo.crearArchivo("data/femenino.txt");
        
        //2. OBTENER DATOS PARA GRABAR EN EL ARCHIVO
        String rna = "data/nombre.txt";
        List<String> hombres_al = MetodoArchivo.obtenerListaNombresHombre(rna);
        List<String> mujeres_al = MetodoArchivo.obtenerListaNombresMujeres(rna);
       
        //3. GRABAR EN ARCHIVOS SEPARADOS NOMBRES DE HOMBRES Y DE MUJERES DE UN ARCHIVO RAIZ
        MetodoArchivo.escribirArchivo("data/masculino.txt", hombres_al);
        MetodoArchivo.escribirArchivo("data/femenino.txt", mujeres_al);
        
        
        
        /*
        for(String nombre: hombres_al) {
            System.out.println(nombre);
        }*/
    }
    
}
    

