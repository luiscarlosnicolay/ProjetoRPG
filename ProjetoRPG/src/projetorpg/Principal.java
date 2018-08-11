/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpg;

import ferramentas.CaixaDeDialogo;
import javax.swing.JOptionPane;

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
        jRadioButtonGuerreiro = new javax.swing.JRadioButton();
        jRadioButtonPaladino = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtNomePersonagem = new javax.swing.JTextField();

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
        jRadioButtonMago.setSelected(true);
        jRadioButtonMago.setText("Mago");
        jRadioButtonMago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mago.png"))); // NOI18N
        jRadioButtonMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMagoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonFeiticeiro);
        jRadioButtonFeiticeiro.setText("Feiticeiro");
        jRadioButtonFeiticeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Feiticeiro.png"))); // NOI18N

        buttonGroup1.add(jRadioButtonGuerreiro);
        jRadioButtonGuerreiro.setText("Guerreiro");
        jRadioButtonGuerreiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Guerreiro.png"))); // NOI18N

        buttonGroup1.add(jRadioButtonPaladino);
        jRadioButtonPaladino.setText("Paladino");
        jRadioButtonPaladino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Paladino.png"))); // NOI18N

        jLabel1.setText("Nome:");

        txtNomePersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePersonagemActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jRadioButtonMago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButtonFeiticeiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonPaladino)
                                    .addComponent(jRadioButtonGuerreiro)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnSair)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAvancar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(jRadioButtonPaladino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnAvancar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        // TODO add your handling code here:
        /*if ((!jRadioButtonMago.isSelected()) && (!jRadioButtonFeiticeiro.isSelected()) && 
            (!jRadioButtonGuerreiro.isSelected()) && (!jRadioButtonIlusionista.isSelected())) {
              JOptionPane.showMessageDialog(this, "Selecione um personagem!");
        } else {
            
         if (jRadioButtonGuerreiro.isSelected()) {
             //JOptionPane.showMessageDialog(this, "Você escolheu o personagem Guerreiro!");
             Personagem guerreiro = new Personagem ();
             guerreiro.setNome("Akiles");
             guerreiro.setClasse("Guerreiro");
             guerreiro.setNivel(0);
             guerreiro.setVida(100);
             guerreiro.setAtaque(200);
             JOptionPane.showMessageDialog(this,"Atributos do persnonagem escolhido:\n" + guerreiro.toString());
             
         }else if (jRadioButtonMago.isSelected()){
             //JOptionPane.showMessageDialog(this, "Você escolheu o personagem Mago!");
             Personagem mago = new Personagem ();
             mago.setNome("Criotek");
             mago.setClasse("Mago");
             mago.setNivel(0);
             mago.setVida(50);
             mago.setAtaque(150);
             JOptionPane.showMessageDialog(this,"Atributos do persnonagem escolhido:\n" + mago.toString());
             
         }else if (jRadioButtonFeiticeiro.isSelected()){
             //JOptionPane.showMessageDialog(this, "Você escolheu o personagem Mago!");
             Personagem feiticeiro = new Personagem ();
             feiticeiro.setNome("Nanak");
             feiticeiro.setClasse("Feiticeiro");
             feiticeiro.setNivel(0);
             feiticeiro.setVida(80);
             feiticeiro.setAtaque(190);
             JOptionPane.showMessageDialog(this,"Atributos do persnonagem escolhido:\n" + feiticeiro.toString());
             
         }else if (jRadioButtonIlusionista.isSelected()){
             //JOptionPane.showMessageDialog(this, "Você escolheu o personagem Mago!");
             Personagem ilusionista = new Personagem ();
             ilusionista.setNome("Daben");
             ilusionista.setClasse("Ilusionista");
             ilusionista.setNivel(0);
             ilusionista.setVida(40);
             ilusionista.setAtaque(130);
             JOptionPane.showMessageDialog(this,"Atributos do persnonagem escolhido:\n" + ilusionista.toString());
         }
        }*/
        
        if(txtNomePersonagem.getText().trim().length() > 3){
            
        
        Personagem personagemEscolhido = escolherClasse();
        
        //Avançar para tela de confronto
        TelaConfronto tela = new TelaConfronto(personagemEscolhido);
        
        tela.setVisible(true);
        
        //Colocar a tela atual não visível
        this.setVisible(false);
        
        }else{
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe um nome com pelo menos 4 caracteres","ERRRRROOOOOU",'e');
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

    
    private Personagem escolherClasse() {
    try{
        Personagem personagem = new Personagem();
        //Preenche os atributos do personagem conforme a classe escolhida
        personagem.setNome(txtNomePersonagem.getText().trim());
        if(jRadioButtonGuerreiro.isSelected()) {
             //personagem.setNome("Akiles");
             personagem.setClasse("Guerreiro");
             personagem.setNivel(0);
             personagem.setVida(100);
             personagem.setAtaque(90);
        }else if(jRadioButtonMago.isSelected()) {
             //personagem.setNome("Criotek");
             personagem.setClasse("Mago");
             personagem.setNivel(0);
             personagem.setVida(80);
             personagem.setAtaque(130);
        }else if(jRadioButtonFeiticeiro.isSelected()) {
             //personagem.setNome("Nanak");
             personagem.setClasse("Feiticeiro");
             personagem.setNivel(0);
             personagem.setVida(70);
             personagem.setAtaque(100);
        }else if(jRadioButtonPaladino.isSelected()) {
             //personagem.setNome("Daben");
             personagem.setClasse("Paladino");
             personagem.setNivel(0);
             personagem.setVida(80);
             personagem.setAtaque(78);            
        }
        
        return personagem;
    }catch(Exception ex){
        return null;
    }
}
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtNomePersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePersonagemActionPerformed

    private void jRadioButtonMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMagoActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonFeiticeiro;
    private javax.swing.JRadioButton jRadioButtonGuerreiro;
    private javax.swing.JRadioButton jRadioButtonMago;
    private javax.swing.JRadioButton jRadioButtonPaladino;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JTextField txtNomePersonagem;
    // End of variables declaration//GEN-END:variables
}
