package swing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaEscribir extends javax.swing.JFrame {

    String[] cabecera = {"N1", "N2", "N3", "N4"};
    String [][] cuerpo = {};
    DefaultTableModel dtm = new DefaultTableModel(cuerpo,cabecera);
    
    public VentanaEscribir() {
        initComponents();
        personalizarTable ();
    }

    public void personalizarTable () {
        tblEscribir.setModel(dtm);
    }
    
    public void escribirArchivoCsv(String n1, String n2, String n3, String n4) {
        File f; // CONVERTIR EL ARCHIVO FISICO EN OBJETO
        FileWriter fw; // ABRIR UNA CANALETA DE COMUNICACION (ORIGEN - DESTINO)
        BufferedWriter bw; //ESCRIBIR
        String fila = "";

        try {
            f = new File("data/notas.csv");
            fw = new FileWriter(f,true);
            bw = new BufferedWriter(fw);
            
            fila = n1 + ";" + n2 + ";" + n3 + ";" + n4;
            bw.write(fila + "\r\n");
            
            bw.flush(); //GRABAR EN DISCO(ARCHIVO FUERA DEL JAVA)
        } catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEscribir = new javax.swing.JTable();
        cmdGrabar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmdInsertarFila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ESCRIBIR ARCHIVO CSV");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 31));

        tblEscribir.setForeground(new java.awt.Color(51, 51, 255));
        tblEscribir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEscribir.setGridColor(new java.awt.Color(255, 51, 51));
        tblEscribir.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblEscribir.setShowGrid(false);
        jScrollPane1.setViewportView(tblEscribir);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 168));

        cmdGrabar.setText("GRABAR");
        cmdGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        cmdLimpiar.setText("LIMPIAR");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 90, -1));

        cmdInsertarFila.setText("INSERTAR FILA");
        cmdInsertarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInsertarFilaActionPerformed(evt);
            }
        });
        getContentPane().add(cmdInsertarFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGrabarActionPerformed
        //RECUPERAR LOS DATOS DEL TABLE
        int numeroFilas = dtm.getRowCount();
        String patron = "[0-9] {1,2}";
        for(int i=0; i<numeroFilas; i++) {
        String n1 = String.valueOf(dtm.getValueAt(i,0));
        String n2 = String.valueOf(dtm.getValueAt(i,1));
        String n3 = String.valueOf(dtm.getValueAt(i,2));
        String n4 = String.valueOf(dtm.getValueAt(i,3));
             if(n1.matches(patron) &&
                n2.matches(patron) &&
                n3.matches(patron) &&
                n4.matches(patron) && 
                     Integer.parseInt(n1)>=0 && Integer.parseInt(n1)>=10 &&
                     Integer.parseInt(n2)>=0 && Integer.parseInt(n1)>=10 &&
                     Integer.parseInt(n3)>=0 && Integer.parseInt(n1)>=10 &&
                     Integer.parseInt(n4)>=0 && Integer.parseInt(n1)>=10) {
        
        System.out.println(n1 + "" + n2 + "" + n3 + "" + n4);
        escribirArchivoCsv(n1,n2,n3,n4);
    } else {
     JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE); 
             }
            
            }
        
    }//GEN-LAST:event_cmdGrabarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
       int numeroFilas = dtm.getRowCount();
       for(int i=0; i<numeroFilas; i++) {
           dtm.removeRow(0);
       }

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdInsertarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInsertarFilaActionPerformed
        String[] filasBlanco = {"","","",""};
        dtm.addRow(filasBlanco);
    }//GEN-LAST:event_cmdInsertarFilaActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEscribir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdGrabar;
    private javax.swing.JButton cmdInsertarFila;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblEscribir;
    // End of variables declaration//GEN-END:variables
}
