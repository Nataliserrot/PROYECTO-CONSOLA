package variable_static;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
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

        txtContador = new javax.swing.JTextField();
        botIzquierda = new javax.swing.JButton();
        botDerecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(340, 340));
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContador.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtContador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContador.setText("0");
        getContentPane().add(txtContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, 30));

        botIzquierda.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        botIzquierda.setText("<<");
        botIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botIzquierdaActionPerformed(evt);
            }
        });
        getContentPane().add(botIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 60, 30));

        botDerecha.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        botDerecha.setText(">>");
        botDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDerechaActionPerformed(evt);
            }
        });
        getContentPane().add(botDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 60, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDerechaActionPerformed
        String contador = txtContador.getText();
        int contadori = Integer.parseInt(contador);
        contadori++;
        txtContador.setText(contadori + "");
        
        
    }//GEN-LAST:event_botDerechaActionPerformed

    private void botIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botIzquierdaActionPerformed
        String contador = txtContador.getText();
        int contadori = Integer.parseInt(contador);
        contadori--;
        txtContador.setText(contadori + "");
    }//GEN-LAST:event_botIzquierdaActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botDerecha;
    private javax.swing.JButton botIzquierda;
    private javax.swing.JTextField txtContador;
    // End of variables declaration//GEN-END:variables
}
