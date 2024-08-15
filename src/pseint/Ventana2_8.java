package pseint;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana2_8 extends javax.swing.JFrame {

    public Ventana2_8() {
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
        cboCategoria = new javax.swing.JComboBox<>();
        txtSueldo = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblSueldo = new javax.swing.JLabel();
        txtSueldoAumento = new javax.swing.JTextField();
        lblSueldoAumento = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cmdCalcular = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("AUMENTO DE SUELDO 15% 10% 8% 5%");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 26));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 44, 400, -1));

        cboCategoria.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "1", "2", "3", "4" }));
        cboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCategoriaItemStateChanged(evt);
            }
        });
        getContentPane().add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, -1));

        txtSueldo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtSueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 87, -1));

        lblCategoria.setText("SELECCIONAR CATEGORIA");
        getContentPane().add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 190, -1));

        txtCategoria.setEditable(false);
        txtCategoria.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 60, -1));

        lblSueldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSueldo.setText("INGRESAR SUELDO");
        getContentPane().add(lblSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 120, -1));

        txtSueldoAumento.setEditable(false);
        txtSueldoAumento.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        getContentPane().add(txtSueldoAumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 100, -1));

        lblSueldoAumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSueldoAumento.setText("SUELDO CON AUMENTO");
        getContentPane().add(lblSueldoAumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 123, 400, 10));

        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 400, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        try {
            String sueldos = txtSueldo.getText();
            double sueldod = Double.parseDouble(sueldos);

            String porcentajes = txtCategoria.getText();
            String porcentajes1 = porcentajes.substring(0, porcentajes.length() - 1);
            int porcentajei = Integer.parseInt(porcentajes1);

            double sueldoAumento = sueldod * (1 + (porcentajei / 100.0));
            txtSueldoAumento.setText(sueldoAumento + "");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SELECCIONE CATEGORÍA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtSueldoAumento.setText("");
        txtSueldo.setText("");
        cboCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCategoriaItemStateChanged
        String items = (String) cboCategoria.getSelectedItem();
        if (!items.equals("SELECCIONE")) {
            int itemi = Integer.parseInt(items);
            switch (itemi) {
                case 1:
                    txtCategoria.setText("15%");
                    break;
                case 2:
                    txtCategoria.setText("10%");
                    break;
                case 3:
                    txtCategoria.setText("8%");
                    break;
                case 4:
                    txtCategoria.setText("5%");
                    break;
            }
        } else {
            txtCategoria.setText("");
        }

    }//GEN-LAST:event_cboCategoriaItemStateChanged

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
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2_8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblSueldoAumento;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtSueldoAumento;
    // End of variables declaration//GEN-END:variables
}
