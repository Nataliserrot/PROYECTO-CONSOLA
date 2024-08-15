package swing;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class VentanaOutput extends JFrame {

    Container contenedor = getContentPane();
    JTextArea txaContenido = new JTextArea();
    JScrollPane scrollpane = new JScrollPane();
    
    public VentanaOutput() {
        Metodos.personalizarVentana (this);
        Metodos.personalizarJTextArea (txaContenido, scrollpane);

        contenedor.add(scrollpane); //SIEMPRE DEBE COLOCARSE PARA QUE ME PERMITA DAR USO DE LA VENTANA
    }
    
   

    public void personalizarVentana() {
        this.setVisible(true);
        this.setTitle("GUI SWING");
        this.setSize(400, 300);

    }

    public static void main(String[] args) {
        VentanaOutput vo = new VentanaOutput();

    }
}
