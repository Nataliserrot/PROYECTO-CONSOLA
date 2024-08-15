package circulo;

public class Libreria {
    
    public static final double MIPI = 3.141516;
    
    public static double redondear(double entrada){
    //double x = (5.56535678+0.005) * 100; //5.5683*100=556.83
    //double y = (int)x / 100.0;  //556/100=5,56
    double x = (entrada + 0.005) * 100;
    double y = (int)x / 100.0;
    return y;
    

    }
 }
