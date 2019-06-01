/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puebascanner;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Angel
 */
public class Main extends javax.swing.JFrame {
String valor = "null";

    public Main() {
        initComponents();
        //ejecutarEventos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edscanner = new javax.swing.JTextField();
        tvtext = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txarea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        bt_enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        edscanner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edscannerKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edscannerKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edscannerKeyTyped(evt);
            }
        });

        tvtext.setText("Nada");

        txarea.setColumns(20);
        txarea.setRows(5);
        jScrollPane1.setViewportView(txarea);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Texto"));

        bt_enviar.setText("Enviar");
        bt_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_enviar)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(bt_enviar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(edscanner, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(tvtext, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edscanner, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvtext, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edscannerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edscannerKeyPressed
         //   scanear();
          
    }//GEN-LAST:event_edscannerKeyPressed

    private void edscannerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edscannerKeyTyped
       // scanear();
        
    }//GEN-LAST:event_edscannerKeyTyped

    private void edscannerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edscannerKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_edscannerKeyReleased

    private void bt_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarActionPerformed
        // TODO add your handling code here:
        EnviarProducto();
        
    }//GEN-LAST:event_bt_enviarActionPerformed


    private void ejecutarEventos(){
        
        KeyListener keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                          //    ejecutar();
            }

            @Override
            public void keyPressed(KeyEvent e) {

           //  ejecutar();
             
            }

            @Override
            public void keyReleased(KeyEvent e) {
                    tvtext.setText(edscanner.getText());
                
            }
        };
        
        edscanner.addKeyListener(keyListener);
    }
    


    public void EnviarProducto(){
        Service service = new Service();
        service.EnviarNombre(edscanner.getText().toString());
        service.MostrarProducto();
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_enviar;
    private javax.swing.JTextField edscanner;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tvtext;
    private javax.swing.JTextArea txarea;
    // End of variables declaration//GEN-END:variables
}
