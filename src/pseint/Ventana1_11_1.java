package pseint;

import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class Ventana1_11_1 extends javax.swing.JFrame {

    ButtonGroup bg = new ButtonGroup(); //*** ESTO ME FALTÓ PARA QUE SE SELECCIONARA UN BOTON A LA VEZ

    public Ventana1_11_1() {
        initComponents();
        personalizarVentana();
        bg.add(rdAcres); //*** EL CONSTRUCTOR DEL BUTTONGROUP
        bg.add(rdHectareas); //*** EL CONSTRUCTOR DEL BUTTONGROUP

    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana

        this.setTitle("GUI SWING");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rdAcres = new javax.swing.JRadioButton();
        rdHectareas = new javax.swing.JRadioButton();
        txtValor = new javax.swing.JTextField();
        txtNuevoValor = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblMensaje1 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CONVERTIR ACRES / HECTAREAS");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 26));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 400, 10));

        rdAcres.setText("ACRES");
        rdAcres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdAcresActionPerformed(evt);
            }
        });
        getContentPane().add(rdAcres, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        rdHectareas.setText("HECTAREAS");
        rdHectareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdHectareasActionPerformed(evt);
            }
        });
        getContentPane().add(rdHectareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        txtValor.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtValor.setForeground(new java.awt.Color(51, 51, 255));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, -1));

        txtNuevoValor.setEditable(false);
        txtNuevoValor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(txtNuevoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 210, 140, -1));

        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 10));

        lblMensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 160, -1));

        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        if (lblMensaje.getText().equals("INGRESE ACRES A CALCULAR")) { //*** ESTO ME FALTÓ
        
        String acres = txtValor.getText().trim();
        double acred = Double.parseDouble(acres);
        double Hectarea = acred * 4047 / 10000;
        txtNuevoValor.setText(Hectarea + "");

    } else{
    
        String hectareas = txtValor.getText().trim();
        double hectaread = Double.parseDouble(hectareas);
        double Acre = hectaread / 4047 * 10000;
        txtNuevoValor.setText(Acre + "");
    }


    }//GEN-LAST:event_cmdCalcularActionPerformed


    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtValor.setText("");
        txtNuevoValor.setText("");

    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void rdAcresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdAcresActionPerformed
        lblMensaje.setText("INGRESE ACRES A CALCULAR");
        lblMensaje1.setText("HECTAREAS");

        txtValor.setText("");

    }//GEN-LAST:event_rdAcresActionPerformed

    private void rdHectareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdHectareasActionPerformed
        lblMensaje.setText("INGRESE HECTAREAS A CALCULAR");
        lblMensaje1.setText("ACRES");

        txtValor.setText("");
    }//GEN-LAST:event_rdHectareasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana1_11_1.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1_11_1.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1_11_1.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1_11_1.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1_11_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMensaje1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdAcres;
    private javax.swing.JRadioButton rdHectareas;
    private javax.swing.JTextField txtNuevoValor;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
