/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package danave.exemplo.java.swing;

import java.awt.Color;

/**
 *
 * @author leodanave
 */
public class TelaAluno extends javax.swing.JFrame {

    /**
     * Creates new form TelaAluno
     */
    public TelaAluno() {
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

        lblTituloTela = new javax.swing.JLabel();
        txtNota01 = new javax.swing.JTextField();
        txtNota02 = new javax.swing.JTextField();
        btnCalcularMedia = new javax.swing.JButton();
        lblResultadoAprovacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloTela.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTituloTela.setText("Tela para Cálculo de Média");

        txtNota01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota01ActionPerformed(evt);
            }
        });

        btnCalcularMedia.setText("Resultado");
        btnCalcularMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMediaActionPerformed(evt);
            }
        });

        lblResultadoAprovacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblResultadoAprovacao.setText("---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTituloTela)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNota01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(txtNota02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCalcularMedia)
                    .addComponent(lblResultadoAprovacao))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblTituloTela)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnCalcularMedia)
                .addGap(32, 32, 32)
                .addComponent(lblResultadoAprovacao)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        lblResultadoAprovacao.getAccessibleContext().setAccessibleName("---");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNota01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota01ActionPerformed

    private void btnCalcularMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMediaActionPerformed
        // TODO add your handling code here:
        // Get - Pegar alguma informação
        // Set - Alterar alguma informação
        String nota01 = txtNota01.getText();
        Double nota01Convertida = Double.valueOf(nota01);

        Double nota02Convertida = Double.valueOf(txtNota02.getText());

        Double resultadoNota = (nota01Convertida * 0.4)
                + (nota02Convertida * 0.6);

        if (resultadoNota >= 6) {
            String resultadoFormatado = String.format("%.2f", resultadoNota);
            lblResultadoAprovacao.setText("APROVADO " + resultadoFormatado);
            lblResultadoAprovacao.setForeground(Color.GREEN);
        } else {
            lblResultadoAprovacao.setText("REPROVADO " + resultadoNota.toString());
            lblResultadoAprovacao.setForeground(Color.RED);
        }
    }//GEN-LAST:event_btnCalcularMediaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularMedia;
    private javax.swing.JLabel lblResultadoAprovacao;
    private javax.swing.JLabel lblTituloTela;
    private javax.swing.JTextField txtNota01;
    private javax.swing.JTextField txtNota02;
    // End of variables declaration//GEN-END:variables
}
