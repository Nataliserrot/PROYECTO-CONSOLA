package misrc;

public class Principal5 { //TODO LO QUE ABRE CON { ES UN BLOQUE DE CODIGO, SE CIERRA CON }

    public static void main(String[] args) {
    {
        System.out.println("FOR");
        int n = 6;
        for (int i= n; i >= 1;i --)
        
        {
            System.out.println(i + " ");
            if (i == 5) System.out.println();

        }
        
    }
}

}

    /* EJERCICIO #3 USO DEL FOR
{
            System.out.println("FOR");
            int n = 5;
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
                             
                
             } 
        }





/* EJERCICIO #2 DAR UN AÑO Y QUE RESPONDA ALEATORIAMENTE CON UN MES SU CORRESPONDIENTE NUMERO DE DIAS

int diasmes = 0;
    int anio = 2023;
    int mes = (int)(Math.random() * 12 + 1);
    switch (mes){
        case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
        diasmes = 31;break;
        case 4: case 6: case 9: case 11:
        diasmes = 30;break;
        case 2: 
            if((anio % 4 == 0 && anio % 100 != 0)|| (anio % 400 == 0)){
            diasmes = 29;
            }else {
                diasmes = 28;
            }
        break;
    }  
    System.out.println(anio + " " + mes + " = " + diasmes);
     */
 /* EJERCICIO #1 TRADUCIR EL DIA DE LA SEMANA DE NUMERO A LETRA
        1 LUNES
        2 MARTES
     */
 /*
    String dialetra = "";
    int dia = 9;
    switch (dia){
        case 1: dialetra = "Lunes";break;
        case 2: dialetra = "Martes";break;
        case 3: dialetra = "Miercoles";break;
        case 4: dialetra = "Jueves";break;
        case 5: dialetra = "Viernes";break;
        case 6: dialetra = "Sabado";break;
        case 7: dialetra = "Domingo";break;
        default: System.out.println("DIA NO VALIDO");
        
    }
    System.out.println(dialetra);
    
 
     */
