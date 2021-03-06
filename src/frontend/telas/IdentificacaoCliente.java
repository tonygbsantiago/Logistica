/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.telas;

import backend.BancoDeDados;

/**
 *
 * @author jonny
 */
public class IdentificacaoCliente extends javax.swing.JFrame {
    
    static BancoDeDados bancoDeDados;
       
    

    /**
     * Creates new form IdentificacaoCliente
     */
    public IdentificacaoCliente(BancoDeDados banco) {
        initComponents();
        
        this.bancoDeDados = banco;
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
        naoTenhoCadastro = new javax.swing.JButton();
        tenhoCadastro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Top-guns");

        naoTenhoCadastro.setText("Não tenho Cadastro");
        naoTenhoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoTenhoCadastroActionPerformed(evt);
            }
        });

        tenhoCadastro.setBackground(new java.awt.Color(204, 204, 204));
        tenhoCadastro.setText("Tenho Cadastro");
        tenhoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenhoCadastroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Clientes");

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(tenhoCadastro)
                .addGap(54, 54, 54)
                .addComponent(naoTenhoCadastro)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Voltar)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenhoCadastro)
                    .addComponent(naoTenhoCadastro))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tenhoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenhoCadastroActionPerformed
        // TODO add your handling code here:
        dispose();
            
        LoginCliente logcli = new LoginCliente(bancoDeDados);
        logcli.setVisible(true);
    }//GEN-LAST:event_tenhoCadastroActionPerformed

    private void naoTenhoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoTenhoCadastroActionPerformed
        // TODO add your handling code here:
        dispose();
        
        CadastroCliente cadCli = new CadastroCliente(bancoDeDados);

        cadCli.setVisible(true);
    }//GEN-LAST:event_naoTenhoCadastroActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaInicial telaIni = new TelaInicial(bancoDeDados);
        telaIni.setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(IdentificacaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IdentificacaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IdentificacaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IdentificacaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IdentificacaoCliente(bancoDeDados).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton naoTenhoCadastro;
    private javax.swing.JButton tenhoCadastro;
    // End of variables declaration//GEN-END:variables
}
