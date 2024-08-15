package pseint;

public class Ejemplo_1_3 {

    private int a, b;

    public Ejemplo_1_3() {
        this.a = 0;
        this.b = 0;
    }

    public Ejemplo_1_3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Ejemplo_1_3{" + "a=" + a + ", b=" + b + '}';
    }

    //METODO OTROS
    public double resultado() {
        return Math.pow((a + b), 2) / 3;
    }

    public void imprimirResultado() {
        System.out.printf("RESULTADO: %.2f", resultado());
    }

    public void entrada() {
        a = Entrada.leerInteger("INGRESAR A :");
        b = Entrada.leerInteger("INGRESAR B :");

    }

}
