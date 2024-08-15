package unidades_informatica;

public class PrincipalUnidadesInformatica {

    public static void main(String[] args) {
        //1. DECLARACION DE VARIABLES
        int opcioni, opcionf;
        double cantidad;
        UnidadesInformatica.cabecera();
        for(int i=0; i<1000; i++) {
        opcioni = (int)(Math.random()*9 + 1);
        while(true) { 
        opcionf = (int)(Math.random()*9 + 1);
        if (opcioni != opcionf) break;
        
        }
        cantidad = (int)(Math.random()*4096 + 1);
        UnidadesInformatica ui = new UnidadesInformatica(opcioni, opcionf, cantidad);
        ui.cuerpo((i+1));
        }    
    }
    
}
