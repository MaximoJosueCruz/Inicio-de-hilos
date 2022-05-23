/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectohilos;

import javax.swing.JOptionPane;


public class Trabajos extends javax.swing.JFrame {
    
    HTA trabajar= new HTA();
    boolean trabajoE=false;
    boolean trabajoJ=false;
    HiloTrabajos HTrabajador1= new HiloTrabajos("Empleado1",trabajar,trabajoE);
    HiloTrabajos HTrabajador2= new HiloTrabajos("Empleado2",trabajar,trabajoE);
    HiloTrabajos HJefe= new HiloTrabajos("Jefe",trabajar,trabajoJ);
    public Trabajos() {
        initComponents();
        this.setLocationRelativeTo(null);
        HTrabajador1.start();
        HTrabajador2.start();
        HJefe.start();
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnTrabajar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        pantalla1 = new javax.swing.JLabel();
        pantalla2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 580));
        setResizable(false);
        setSize(new java.awt.Dimension(950, 580));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTrabajar.setText("Trabajar");
        btnTrabajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajarActionPerformed(evt);
            }
        });
        jPanel3.add(btnTrabajar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarC.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 33, 33));

        pantalla1.setPreferredSize(new java.awt.Dimension(320, 240));
        jPanel3.add(pantalla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 340, 230));
        jPanel3.add(pantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 340, 230));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoT.png"))); // NOI18N
        jPanel3.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrabajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajarActionPerformed
        
        if(trabajoJ==false){
            trabajoJ=true;
            HJefe.estado(trabajoJ);
            btnTrabajar.setText("Descansar");
            HTrabajador1.estado(trabajoJ);
            HTrabajador2.estado(trabajoJ);
        }else{
            trabajoJ=false;
            btnTrabajar.setText("Trabajar");
            HJefe.estado(trabajoJ);
            HTrabajador1.estado(trabajoJ);
            HTrabajador2.estado(trabajoJ);
            
        }
        
        
           /* HTrabajador1.asistencia=HJefe.asistencia;
            HTrabajador2.asistencia=HJefe.asistencia;*/
        
    }//GEN-LAST:event_btnTrabajarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        VPrin ventana= new VPrin();
        ventana.show();
        HTrabajador1.stop();
        HTrabajador2.stop();
        HJefe.stop();
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
    

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
            java.util.logging.Logger.getLogger(Trabajos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trabajos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trabajos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trabajos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trabajos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnTrabajar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel pantalla1;
    public static javax.swing.JLabel pantalla2;
    // End of variables declaration//GEN-END:variables
}
