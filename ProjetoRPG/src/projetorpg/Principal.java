/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpg;

/**
 *
 * @author janquiel.kappler
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        jRadioButtonMago = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButtonFeiticeiro = new javax.swing.JRadioButton();
        jRadioButtonBruxo = new javax.swing.JRadioButton();
        jRadioButtonGuerreiro = new javax.swing.JRadioButton();
        jRadioButtonVampiro = new javax.swing.JRadioButton();
        jRadioButtonLobisomem = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl1.setText("JLKN GAME - Escolha seu personagem:");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonMago);
        jRadioButtonMago.setText("Mago");
        jRadioButtonMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMagoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonFeiticeiro);
        jRadioButtonFeiticeiro.setText("Feiticeiro");
        jRadioButtonFeiticeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFeiticeiroActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonBruxo);
        jRadioButtonBruxo.setText("Bruxo");
        jRadioButtonBruxo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBruxoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonGuerreiro);
        jRadioButtonGuerreiro.setText("Guerreiro");
        jRadioButtonGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGuerreiroActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonVampiro);
        jRadioButtonVampiro.setText("Vampiro");
        jRadioButtonVampiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVampiroActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonLobisomem);
        jRadioButtonLobisomem.setText("Lobisomem");
        jRadioButtonLobisomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLobisomemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButtonMago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonFeiticeiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonBruxo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButtonGuerreiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonVampiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonLobisomem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAvancar)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMago)
                    .addComponent(jRadioButtonGuerreiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonFeiticeiro)
                    .addComponent(jRadioButtonVampiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonBruxo)
                    .addComponent(jRadioButtonLobisomem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnAvancar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMagoActionPerformed
        // TODO add your handling code here:
        boolean radio;
        radio =  jRadioButtonMago.isSelected();
        jRadioButtonMago.setSelected(radio);
    }//GEN-LAST:event_jRadioButtonMagoActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        // TODO add your handling code here:
        if(radio == true) {
            System.out.println("Personagem: " + radio);}
            else {
            System.out.println("Nulo");}
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void jRadioButtonFeiticeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFeiticeiroActionPerformed
        // TODO add your handling code here:
        boolean radio;
        radio =  jRadioButtonFeiticeiro.isSelected();
        jRadioButtonFeiticeiro.setSelected(radio);
    }//GEN-LAST:event_jRadioButtonFeiticeiroActionPerformed

    private void jRadioButtonBruxoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBruxoActionPerformed
        // TODO add your handling code here:
        boolean radio;
        radio =  jRadioButtonBruxo.isSelected();
        jRadioButtonBruxo.setSelected(radio);
    }//GEN-LAST:event_jRadioButtonBruxoActionPerformed

    private void jRadioButtonGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGuerreiroActionPerformed
        // TODO add your handling code here:
        boolean radio;
        radio =  jRadioButtonGuerreiro.isSelected();
        jRadioButtonGuerreiro.setSelected(radio);
    }//GEN-LAST:event_jRadioButtonGuerreiroActionPerformed

    private void jRadioButtonVampiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVampiroActionPerformed
        // TODO add your handling code here:
        boolean radio;
        radio =  jRadioButtonVampiro.isSelected();
        jRadioButtonVampiro.setSelected(radio);
    }//GEN-LAST:event_jRadioButtonVampiroActionPerformed

    private void jRadioButtonLobisomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLobisomemActionPerformed
        // TODO add your handling code here:
        boolean radio;
        radio =  jRadioButtonLobisomem.isSelected();
        jRadioButtonLobisomem.setSelected(radio);
    }//GEN-LAST:event_jRadioButtonLobisomemActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButtonBruxo;
    private javax.swing.JRadioButton jRadioButtonFeiticeiro;
    private javax.swing.JRadioButton jRadioButtonGuerreiro;
    private javax.swing.JRadioButton jRadioButtonLobisomem;
    private javax.swing.JRadioButton jRadioButtonMago;
    private javax.swing.JRadioButton jRadioButtonVampiro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl1;
    // End of variables declaration//GEN-END:variables
}
