/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projappacademia.view;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import projappacademia.controller.AlunoController;
import projappacademia.model.Aluno;
/**
 *
 * @author 771900057
 */
public class janelaAlunoModalidade extends javax.swing.JFrame {
     ArrayList<Integer> modalidadeIds = new ArrayList<Integer>();
    
    
      
    public janelaAlunoModalidade(Aluno aluno) {
        initComponents();
        
        jTfCpfAluno.setText(aluno.getCpf());
        jTfPlanoAluno.setText(aluno.getPlano());
        
     
    
        
    }

    public janelaAlunoModalidade() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics t){

                ImageIcon im = new ImageIcon("src/fotos/fundoInfoAluno.jpg");
                Image i =im.getImage();

                t.drawImage(i,0,0, this.getSize().width,this.getSize().height,this);
            }
        };
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtEnviar = new javax.swing.JButton();
        jBtVoltar = new javax.swing.JButton();
        jTfCpfAluno = new javax.swing.JTextField();
        jTfPlanoAluno = new javax.swing.JTextField();
        jCbAcademia = new javax.swing.JCheckBox();
        jCbNatacao = new javax.swing.JCheckBox();
        jCbCrossfit = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 673));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Plano:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modalidades:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aqui o texto muda de acordo com o plano escolhido");

        jBtEnviar.setText("Enviar");
        jBtEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEnviarActionPerformed(evt);
            }
        });

        jBtVoltar.setText("Voltar");
        jBtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtVoltarActionPerformed(evt);
            }
        });

        jTfCpfAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfCpfAlunoActionPerformed(evt);
            }
        });

        jTfPlanoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfPlanoAlunoActionPerformed(evt);
            }
        });

        jCbAcademia.setForeground(new java.awt.Color(255, 255, 255));
        jCbAcademia.setText("Academia");
        jCbAcademia.setContentAreaFilled(false);
        jCbAcademia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbAcademiaActionPerformed(evt);
            }
        });

        jCbNatacao.setForeground(new java.awt.Color(255, 255, 255));
        jCbNatacao.setText("Natacao");
        jCbNatacao.setContentAreaFilled(false);
        jCbNatacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbNatacaoActionPerformed(evt);
            }
        });

        jCbCrossfit.setForeground(new java.awt.Color(255, 255, 255));
        jCbCrossfit.setText("Crossfit");
        jCbCrossfit.setContentAreaFilled(false);
        jCbCrossfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbCrossfitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(jBtEnviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jBtVoltar)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(jCbAcademia)
                                .addGap(18, 18, 18)
                                .addComponent(jCbNatacao)
                                .addGap(18, 18, 18)
                                .addComponent(jCbCrossfit))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTfCpfAluno)
                                    .addComponent(jTfPlanoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                        .addContainerGap(300, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTfCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTfPlanoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCbAcademia)
                    .addComponent(jCbNatacao)
                    .addComponent(jCbCrossfit))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtEnviar)
                    .addComponent(jBtVoltar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEnviarActionPerformed
       
        Aluno aluno = new Aluno();
        
        
         if (!modalidadeIds.isEmpty()) 
         {
            try {
                 
                 int alunoId = aluno.buscaIdAluno(jTfCpfAluno.getText());
                 
                AlunoController alunoController = new AlunoController();
                alunoController.inscreverEmModalidades(alunoId, modalidadeIds);
                JOptionPane.showMessageDialog(null, "O cadastro da modalidade foi realizado com sucesso.");
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
         } else {
        JOptionPane.showMessageDialog(null, "Selecione pelo menos uma modalidade.");
    }
    }//GEN-LAST:event_jBtEnviarActionPerformed

    private void jTfCpfAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfCpfAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfCpfAlunoActionPerformed

    private void jBtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtVoltarActionPerformed

    private void jTfPlanoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfPlanoAlunoActionPerformed
       
    }//GEN-LAST:event_jTfPlanoAlunoActionPerformed

    private void jCbAcademiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbAcademiaActionPerformed
     String plano = jTfPlanoAluno.getText();
     
     if (plano.equals("Basico")) {
        if (jCbAcademia.isSelected()) {
            modalidadeIds.add(1);
            jCbNatacao.setEnabled(false);
            jCbCrossfit.setEnabled(false);
        }
        
     } else if (plano.equals("Intermediario")) {
        
         if (jCbAcademia.isSelected() && jCbNatacao.isSelected()) {
            modalidadeIds.add(1);
            modalidadeIds.add(2);
            jCbCrossfit.setEnabled(false);
        } else if (jCbAcademia.isSelected() && jCbCrossfit.isSelected()) {
            modalidadeIds.add(1);
            modalidadeIds.add(3);
            jCbNatacao.setEnabled(false);
        }
     }
    }//GEN-LAST:event_jCbAcademiaActionPerformed

    private void jCbNatacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbNatacaoActionPerformed
     escolheMetodos();
    }//GEN-LAST:event_jCbNatacaoActionPerformed

    private void jCbCrossfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbCrossfitActionPerformed
    escolheMetodos();
    }//GEN-LAST:event_jCbCrossfitActionPerformed
    
    private void escolheMetodos() {
    String plano = jTfPlanoAluno.getText();
    
    
    if (plano.equals("Basico")) {
        if (jCbAcademia.isSelected()) {
            modalidadeIds.add(1);
            jCbNatacao.setEnabled(false);
            jCbCrossfit.setEnabled(false);
        } else if (jCbNatacao.isSelected()) {
            modalidadeIds.add(2);
            jCbAcademia.setEnabled(false);
            jCbCrossfit.setEnabled(false);
        } else if (jCbCrossfit.isSelected()) {
            modalidadeIds.add(3);
            jCbAcademia.setEnabled(false);
            jCbNatacao.setEnabled(false);
        } else {modalidadeIds.clear(); jCbAcademia.setEnabled(true); jCbNatacao.setEnabled(true); jCbCrossfit.setEnabled(true); }
        
    } else if (plano.equals("Intermediario")) {
        if (jCbAcademia.isSelected() && jCbNatacao.isSelected()) {
            modalidadeIds.add(1);
            modalidadeIds.add(2);
            jCbCrossfit.setEnabled(false);
        } else if (jCbAcademia.isSelected() && jCbCrossfit.isSelected()) {
            modalidadeIds.add(1);
            modalidadeIds.add(3);
            jCbNatacao.setEnabled(false);
        } else if (jCbNatacao.isSelected() && jCbCrossfit.isSelected()) {
            modalidadeIds.add(2);
            modalidadeIds.add(3);
            jCbAcademia.setEnabled(false);
        }
        else {modalidadeIds.clear(); jCbAcademia.setEnabled(true); jCbNatacao.setEnabled(true); jCbCrossfit.setEnabled(true); }
    }
}
    
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
            java.util.logging.Logger.getLogger(janelaAlunoModalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janelaAlunoModalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janelaAlunoModalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janelaAlunoModalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janelaAlunoModalidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtEnviar;
    private javax.swing.JButton jBtVoltar;
    private javax.swing.JCheckBox jCbAcademia;
    private javax.swing.JCheckBox jCbCrossfit;
    private javax.swing.JCheckBox jCbNatacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTfCpfAluno;
    private javax.swing.JTextField jTfPlanoAluno;
    // End of variables declaration//GEN-END:variables
}
