package swing;

public class VentanaContador extends javax.swing.JFrame {

    int contador = 0;
    
    public VentanaContador() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMenos = new javax.swing.JButton();
        txtContador = new javax.swing.JTextField();
        cmdMas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(340, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdMenos.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdMenos.setText("-");
        cmdMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenosActionPerformed(evt);
            }
        });
        getContentPane().add(cmdMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 60, 30));

        txtContador.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtContador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContador.setText("0");
        getContentPane().add(txtContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, 30));

        cmdMas.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdMas.setText("+");
        cmdMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMasActionPerformed(evt);
            }
        });
        getContentPane().add(cmdMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 60, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenosActionPerformed
        contador--;
        txtContador.setText(contador+ ""); 
        
    }//GEN-LAST:event_cmdMenosActionPerformed

    private void cmdMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMasActionPerformed
        contador++;
        txtContador.setText(contador+ "");

    }//GEN-LAST:event_cmdMasActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaContador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdMas;
    private javax.swing.JButton cmdMenos;
    private javax.swing.JTextField txtContador;
    // End of variables declaration//GEN-END:variables
}
