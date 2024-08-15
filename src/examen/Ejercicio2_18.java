package examen;

import java.awt.Image;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ejercicio2_18 extends javax.swing.JFrame {

    public Ejercicio2_18() {
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
        lblTiempoServicio = new javax.swing.JLabel();
        lblSueldoAumento = new javax.swing.JLabel();
        txtSueldoAumento = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblSueldo = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        cboCategoria = new javax.swing.JComboBox<>();
        txtCategoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("AUMENTO DE SUELDO POR CATEGORÍA");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 26));

        lblTiempoServicio.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblTiempoServicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempoServicio.setText("TIEMPO DE SERVICIO");
        getContentPane().add(lblTiempoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 160, 20));

        lblSueldoAumento.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblSueldoAumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSueldoAumento.setText("SUELDO CON AUMENTO");
        getContentPane().add(lblSueldoAumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 150, -1));

        txtSueldoAumento.setEditable(false);
        txtSueldoAumento.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        getContentPane().add(txtSueldoAumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 130, -1));

        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 90, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 400, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 400, -1));

        lblSueldo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblSueldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSueldo.setText("INGRESAR SUELDO");
        getContentPane().add(lblSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 20));

        txtSueldo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtSueldo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 110, -1));

        cboCategoria.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "A", "B", "C", "D" }));
        cboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        txtCategoria.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        
        double sueldoaumento = 0;
        String sueldos = txtSueldo.getText();
               
        String categoria = txtCategoria.getText();
        
                switch (categoria) {
                case "20-30 AÑOS":
                     sueldoaumento = Integer.parseInt(sueldos) * 1.15;
                     txtSueldoAumento.setText(sueldoaumento + "");
                break;
               case "15-20 AÑOS":
                     sueldoaumento = Integer.parseInt(sueldos) * 1.12;
                     txtSueldoAumento.setText(sueldoaumento + "");
                break;
                case "10-15 AÑOS":
                     sueldoaumento = Integer.parseInt(sueldos) * 1.10;
                     txtSueldoAumento.setText(sueldoaumento + "");
                break;
                case "0-10 AÑOS":
                     sueldoaumento = Integer.parseInt(sueldos) + 15;
                     txtSueldoAumento.setText(sueldoaumento + "");
                     String sueldoa = String.format("%5.2f", sueldoaumento);
                break;
                
                }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed

        String categorias = (String) cboCategoria.getSelectedItem();;
        if (!categorias.equals("SELECCIONE")) {

            switch (categorias) {
                case "A":
                    txtCategoria.setText("20-30 AÑOS");
                    break;
                case "B":
                    txtCategoria.setText("15-20 AÑOS");
                    break;
                case "C":
                    txtCategoria.setText("10-15 AÑOS");
                    break;
                case "D":
                    txtCategoria.setText("0-10 AÑOS");
                    break;
            }
        }else {
            txtCategoria.setText("");
    }
   
    }//GEN-LAST:event_cboCategoriaActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2_18().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblSueldoAumento;
    private javax.swing.JLabel lblTiempoServicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtSueldoAumento;
    // End of variables declaration//GEN-END:variables
}
