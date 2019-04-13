/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author josea
 */
public class App extends javax.swing.JFrame {

    // OBJETO CINE QUE CONTROLA LAS SALAS
    Cine mCine;

    public App() {
        initComponents();
        // INICIA CON UN PRECIO DE FUNCION INICIAL A 55 PESOS
        mCine = new Cine(55);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIniciar1 = new javax.swing.JButton();
        lblSala1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIniciar2 = new javax.swing.JButton();
        lblSala2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnIniciar3 = new javax.swing.JButton();
        lblSala3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CineTec Laguna");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sala 1");

        btnIniciar1.setText("Iniciar/Pausar");
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });

        lblSala1.setText("ESTADO: REPRODUCIENDO");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sala 2");

        btnIniciar2.setText("Iniciar/Pausar");
        btnIniciar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar2ActionPerformed(evt);
            }
        });

        lblSala2.setText("ESTADO: REPRODUCIENDO");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sala 3");

        btnIniciar3.setText("Iniciar/Pausar");
        btnIniciar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar3ActionPerformed(evt);
            }
        });

        lblSala3.setText("ESTADO: REPRODUCIENDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSala1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnIniciar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSala2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnIniciar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSala3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnIniciar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIniciar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSala1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIniciar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSala2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIniciar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSala3)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar1ActionPerformed

        PausaReanuda(0);

        btnIniciar2.setEnabled(!btnIniciar2.isEnabled());
        btnIniciar3.setEnabled(!btnIniciar3.isEnabled());
    }//GEN-LAST:event_btnIniciar1ActionPerformed

    private void btnIniciar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar2ActionPerformed
        // TODO add your handling code here:
        PausaReanuda(1);

        btnIniciar1.setEnabled(!btnIniciar1.isEnabled());
        btnIniciar3.setEnabled(!btnIniciar3.isEnabled());
    }//GEN-LAST:event_btnIniciar2ActionPerformed

    private void btnIniciar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar3ActionPerformed

        PausaReanuda(2);

        btnIniciar1.setEnabled(!btnIniciar1.isEnabled());
        btnIniciar2.setEnabled(!btnIniciar2.isEnabled());
    }//GEN-LAST:event_btnIniciar3ActionPerformed

    void PausaReanuda(int id) {
        
        // CREA UN NUEVO HILO DE EJECUCION PARA EVITAR PROBLEMAS EN LA APP VISUAL
        new Thread() {
            @Override
            public void run() {

                if (mCine.pararSala(id)) {
                    System.out.println("SALA " + id + " parada");
                    cambiarEstadoSala(id, true);
                } else {
                    cambiarEstadoSala(id, false);
                    System.out.println("Reiniciando sala " + id);
                }
            }

        }.start();

    }
    // ACTUALIZA LAS LABELS DE ESTADOS DE CADA SALA
    void cambiarEstadoSala(int id, boolean pausa) {
        if (id == 0) {
            lblSala1.setText("ESTADO: " + (pausa ? "PAUSA" : "REPRODUCIENDO"));
        }
        if (id == 1) {
            lblSala1.setText("ESTADO: " + (pausa ? "PAUSA" : "REPRODUCIENDO"));
        }
        if (id == 2) {
            lblSala1.setText("ESTADO: " + (pausa ? "PAUSA" : "REPRODUCIENDO"));
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar1;
    private javax.swing.JButton btnIniciar2;
    private javax.swing.JButton btnIniciar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblSala1;
    private javax.swing.JLabel lblSala2;
    private javax.swing.JLabel lblSala3;
    // End of variables declaration//GEN-END:variables
}
