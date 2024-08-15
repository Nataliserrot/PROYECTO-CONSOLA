package pseint;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana1_17 extends javax.swing.JFrame {

    public Ventana1_17() {
        initComponents();
        personalizarVentana();

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
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblB1 = new javax.swing.JLabel();
        lblB5 = new javax.swing.JLabel();
        lblB10 = new javax.swing.JLabel();
        lblB23 = new javax.swing.JLabel();
        txtB1 = new javax.swing.JTextField();
        txtB5 = new javax.swing.JTextField();
        txtB10 = new javax.swing.JTextField();
        txtB20 = new javax.swing.JTextField();
        cmdSalir = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CONVERSION DE BILLETES 20-10-5-1");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 26));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 400, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 102, 400, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 215, 400, -1));

        lblCantidad.setText("INGRESAR CANTIDAD EUROS A CONVERTIR");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 53, 254, -1));

        txtCantidad.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(51, 51, 255));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 80, -1));

        lblB1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB1.setText("B-1");
        getContentPane().add(lblB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 40, -1));

        lblB5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblB5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB5.setText("B-5");
        getContentPane().add(lblB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 40, -1));

        lblB10.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblB10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB10.setText("B-10");
        getContentPane().add(lblB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 40, -1));

        lblB23.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblB23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB23.setText("B-20");
        getContentPane().add(lblB23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 40, -1));

        txtB1.setEditable(false);
        txtB1.setBackground(new java.awt.Color(51, 51, 255));
        txtB1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtB1.setForeground(new java.awt.Color(255, 255, 255));
        txtB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 80, -1));

        txtB5.setEditable(false);
        txtB5.setBackground(new java.awt.Color(51, 51, 255));
        txtB5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtB5.setForeground(new java.awt.Color(255, 255, 255));
        txtB5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 80, -1));

        txtB10.setEditable(false);
        txtB10.setBackground(new java.awt.Color(51, 51, 255));
        txtB10.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtB10.setForeground(new java.awt.Color(255, 255, 255));
        txtB10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 80, -1));

        txtB20.setEditable(false);
        txtB20.setBackground(new java.awt.Color(51, 51, 255));
        txtB20.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtB20.setForeground(new java.awt.Color(255, 255, 255));
        txtB20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtB20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, -1));

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        try {           //try y catch protegen el programa de errores para que no se caiga el programa
            String cantidads = txtCantidad.getText();
            int cantidadi = Integer.parseInt(cantidads);
            int b20, b10, b5, b1;
            int residuo20, residuo10, residuo5, residuo1;

            b20 = cantidadi / 20;
            residuo20 = cantidadi % 20;

            b10 = residuo20 / 10;
            residuo10 = residuo20 % 10;

            b5 = residuo10 / 5;
            residuo5 = residuo10 % 5;

            b1 = residuo5 / 1;
            residuo1 = residuo5 % 1;

            txtB20.setText(b20 + "");
            txtB10.setText(b10 + "");
            txtB5.setText(b5 + "");
            txtB1.setText(b1 + "");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INGRESE VALOR NUMÉRICO", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtCantidad.setText("");
        txtB20.setText("");
        txtB10.setText("");
        txtB5.setText("");
        txtB1.setText("");

    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();

    }//GEN-LAST:event_cmdSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1_17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1_17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1_17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1_17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1_17().setVisible(true);
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
    private javax.swing.JLabel lblB1;
    private javax.swing.JLabel lblB10;
    private javax.swing.JLabel lblB23;
    private javax.swing.JLabel lblB5;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtB1;
    private javax.swing.JTextField txtB10;
    private javax.swing.JTextField txtB20;
    private javax.swing.JTextField txtB5;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
