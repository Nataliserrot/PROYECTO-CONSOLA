package pseint;

import java.awt.Image;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana3_16 extends javax.swing.JFrame {

    public Ventana3_16() {
        initComponents();
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
        lblAlumno = new javax.swing.JLabel();
        lblNota1 = new javax.swing.JLabel();
        lblNota2 = new javax.swing.JLabel();
        lblNota3 = new javax.swing.JLabel();
        lblNota4 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        txtNota4 = new javax.swing.JTextField();
        txtPromedio = new javax.swing.JTextField();
        lblPromedio = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 388));
        setPreferredSize(new java.awt.Dimension(400, 388));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PROMEDIO DE NOTAS");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 26));

        lblAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlumno.setText("INGRESAR NOTAS ALUMNO (VALOR NUMÉRICO ENTERO)");
        getContentPane().add(lblAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 67, 320, -1));

        lblNota1.setBackground(new java.awt.Color(255, 255, 204));
        lblNota1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblNota1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNota1.setText("NOTA 1:");
        lblNota1.setOpaque(true);
        getContentPane().add(lblNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 115, -1, -1));

        lblNota2.setBackground(new java.awt.Color(255, 255, 204));
        lblNota2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblNota2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNota2.setText("NOTA 2:");
        lblNota2.setOpaque(true);
        getContentPane().add(lblNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 147, -1, -1));

        lblNota3.setBackground(new java.awt.Color(255, 255, 204));
        lblNota3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblNota3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNota3.setText("NOTA 3:");
        lblNota3.setOpaque(true);
        getContentPane().add(lblNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 179, -1, -1));

        lblNota4.setBackground(new java.awt.Color(255, 255, 204));
        lblNota4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblNota4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNota4.setText("NOTA 4:");
        lblNota4.setOpaque(true);
        getContentPane().add(lblNota4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 211, -1, -1));

        txtNota1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        getContentPane().add(txtNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 114, 80, -1));

        txtNota2.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        getContentPane().add(txtNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 146, 80, -1));

        txtNota3.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        getContentPane().add(txtNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 178, 80, -1));

        txtNota4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        getContentPane().add(txtNota4, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 210, 80, -1));

        txtPromedio.setEditable(false);
        getContentPane().add(txtPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 80, -1));

        lblPromedio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPromedio.setText("PROMEDIO");
        getContentPane().add(lblPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 80, -1));

        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 90, -1));

        cmdGuardar.setText("GUARDAR");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 90, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 400, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        try {

            int nota1 = Integer.parseInt(txtNota1.getText());
            int nota2 = Integer.parseInt(txtNota2.getText());
            int nota3 = Integer.parseInt(txtNota3.getText());
            int nota4 = Integer.parseInt(txtNota4.getText());

            int menornota = nota1;
            if (nota2 < menornota) {
                menornota = nota2;
            }
            if (nota3 < menornota) {
                menornota = nota3;
            }
            if (nota4 < menornota) {
                menornota = nota4;
            }
            double promedio = (nota1 + nota2 + nota3 + nota4 - menornota)/3.0;
            String promedioa = String.format("%5.2f", promedio);
            txtPromedio.setText(promedioa + "");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INGRESE VALOR NUMERO ENTERO", "OK", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtNota1.setText("");
        txtNota2.setText("");
        txtNota3.setText("");
        txtNota4.setText("");
        txtPromedio.setText("");
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed

        JOptionPane.showMessageDialog(null, "GRABACIÓN CORRECTA", "INFORMACIÓN", JOptionPane.OK_OPTION);

    }//GEN-LAST:event_cmdGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana3_16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3_16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3_16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3_16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3_16().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblNota3;
    private javax.swing.JLabel lblNota4;
    private javax.swing.JLabel lblPromedio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtNota4;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
