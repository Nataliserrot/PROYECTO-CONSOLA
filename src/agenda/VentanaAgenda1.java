package agenda;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaAgenda1 extends javax.swing.JFrame {

    //BASE DATOS
    List<Persona1> personas_al = new ArrayList<>();

    public VentanaAgenda1() {
        initComponents();
        personalizarVentana();
        cargarBaseDatos();
        pintarCajitaPersona(0);
        pintarLabel(personas_al.get(0).getFoto()+"");
        cmdDerecho.requestFocusInWindow();
    }

    public void cargarBaseDatos() {
        
        personas_al.add(new Persona1("12345678A", "Luis", "Alva", "Av. Ejercito 123", "657234928", "10/12/2000","1"));
        personas_al.add(new Persona1("87654321B", "Arturo", "Roncal", "Av. América 434", "629394123", "11/22/1999","3"));
        personas_al.add(new Persona1("11223344C", "Miguel", "Zuñíga", "Av. Miraflores 342", "645980123", "02/12/2005","4"));
        personas_al.add(new Persona1("99887766D", "Carmen", "Cuba", "Av. Santa 353", "689323239", "15/05/2000","2"));
        personas_al.add(new Persona1("55555555E", "Silvia", "Goicochea", "Av. La Marina 349", "648394192", "18/12/2001","7"));
        personas_al.add(new Persona1("44444444F", "María", "Rodriguez", "Calle Beatriz Merino 343", "678394109", "10/04/1998","8"));
        personas_al.add(new Persona1("33333333G", "Carlos", "Orbegoso", "Calle Mayor 134", "645890456", "22/12/2003","5"));
        personas_al.add(new Persona1("22222222H", "José", "Gamara", "Av. La Constitución 348", "684384174", "28/06/2002","6"));
        personas_al.add(new Persona1("11111111I", "Gerson", "Pizarro", "Calle Balmes 898", "648193456", "10/11/2000","9"));
        
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana

        this.setTitle("GUI SWING");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }

    public void pintarCajitaPersona(int indice) {
        Persona1 persona = personas_al.get(indice);
        txtDni.setText(persona.getDni());
        txtNombre.setText(persona.getNombre());
        txtPaterno.setText(persona.getPaterno());
        txtDireccion.setText(persona.getDireccion());
        txtTelefono.setText(persona.getTelefono());
        txtNacimiento.setText(persona.getNacimiento());
        
    }
    
     public void pintarLabel(String nombreFoto) {
        try {
            BufferedImage imagenOriginal = ImageIO.read(new File("imagen/" + nombreFoto + ".png"));
            Image imagenEscala = imagenOriginal.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(imagenEscala);
            lblFoto.setIcon(icon);
        } catch (IOException ex) {
            lblFoto.setIcon(null);
            lblFoto.setText("ERROR: IMAGEN NO EXISTE");
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        separator2 = new javax.swing.JSeparator();
        lblDni = new javax.swing.JLabel();
        lblPaterno = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNacimiento = new javax.swing.JTextField();
        cmdIzquierda = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        cmdDerecho = new javax.swing.JButton();
        cmdInicio = new javax.swing.JButton();
        cmdFin = new javax.swing.JButton();
        txtIndice = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("AGENDA ELECTRONICA");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 559, 37));
        getContentPane().add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 559, -1));
        getContentPane().add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 201, 559, 10));

        lblDni.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lblDni.setText("DNI");
        getContentPane().add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 67, 66, -1));

        lblPaterno.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lblPaterno.setText("APELLIDO");
        getContentPane().add(lblPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 143, 66, -1));

        lblNombre.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lblNombre.setText("NOMBRE");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, 66, -1));

        lblDireccion.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lblDireccion.setText("DIRECCION");
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 67, 75, -1));

        lblTelefono.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lblTelefono.setText("TELEFONO");
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 105, 75, -1));

        lblNacimiento.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lblNacimiento.setText("NACIMIENTO");
        getContentPane().add(lblNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 143, 75, -1));

        txtDni.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 64, 156, -1));

        txtNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 102, 156, -1));

        txtPaterno.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtPaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 140, 156, -1));

        txtDireccion.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 64, 156, -1));

        txtTelefono.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 102, 156, -1));

        txtNacimiento.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 140, 156, -1));

        cmdIzquierda.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        cmdIzquierda.setText("<<");
        cmdIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIzquierdaActionPerformed(evt);
            }
        });
        getContentPane().add(cmdIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 226, -1, -1));

        cmdGuardar.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        cmdGuardar.setText("GUARDAR");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 226, -1, -1));

        cmdDerecho.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        cmdDerecho.setText(">>");
        cmdDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDerechoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 226, -1, -1));

        cmdInicio.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        cmdInicio.setText("INICIO");
        cmdInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInicioActionPerformed(evt);
            }
        });
        getContentPane().add(cmdInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 226, -1, -1));

        cmdFin.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        cmdFin.setText("FIN");
        cmdFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFinActionPerformed(evt);
            }
        });
        getContentPane().add(cmdFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 226, -1, -1));

        txtIndice.setEditable(false);
        txtIndice.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtIndice.setForeground(new java.awt.Color(204, 0, 0));
        txtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIndice.setText("0");
        getContentPane().add(txtIndice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 64, 23));

        lblFoto.setBackground(new java.awt.Color(255, 204, 0));
        lblFoto.setOpaque(true);
        getContentPane().add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 170, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIzquierdaActionPerformed
        String indices = txtIndice.getText().trim();
        int indicei = Integer.parseInt(indices);
        if (indicei > 0) {
            indicei--;
            txtIndice.setText(indicei + "");
            pintarCajitaPersona(indicei);
            pintarLabel(personas_al.get(indicei).getFoto()+"");
            
        }

    }//GEN-LAST:event_cmdIzquierdaActionPerformed

    private void cmdDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDerechoActionPerformed
         String indices = txtIndice.getText().trim();
        int indicei = Integer.parseInt(indices);
        if (indicei < personas_al.size()-1) {
            indicei++;
            txtIndice.setText(indicei + "");
            pintarCajitaPersona(indicei);
            pintarLabel(personas_al.get(indicei).getFoto()+"");
            
        }
    }//GEN-LAST:event_cmdDerechoActionPerformed

    private void cmdInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInicioActionPerformed
        txtIndice.setText("0");
        pintarCajitaPersona(0);
        pintarLabel(personas_al.get(0).getFoto()+"");
    }//GEN-LAST:event_cmdInicioActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);
        
        String dni = txtDni.getText();
        String nombre = txtNombre.getText();
        String paterno = txtPaterno.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String nacimiento = txtNacimiento.getText();
        
        Persona1 persona = personas_al.get(indicei);
        persona.setDni(dni);
        persona.setNombre(nombre);
        persona.setPaterno(paterno);
        persona.setDireccion(direccion);
        persona.setTelefono(telefono);
        persona.setNacimiento(nacimiento);
        
        JOptionPane.showMessageDialog(null, "GRABACIÓN CORRECTA", "INFORMACIÓN", JOptionPane.OK_OPTION);
    
    }//GEN-LAST:event_cmdGuardarActionPerformed

    
    private void cmdFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFinActionPerformed
        txtIndice.setText((personas_al.size()-1)+"");
        pintarCajitaPersona(personas_al.size()-1);
        pintarLabel(personas_al.get(personas_al.size()-1).getFoto());
    }//GEN-LAST:event_cmdFinActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgenda1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDerecho;
    private javax.swing.JButton cmdFin;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdInicio;
    private javax.swing.JButton cmdIzquierda;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
