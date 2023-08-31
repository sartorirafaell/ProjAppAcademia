/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projappacademia.view;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import projappacademia.controller.AlunoController;
import projappacademia.model.Aluno;
/**
 *
 * @author 771900057
 */
public class janelaAlunoModalidade extends javax.swing.JFrame {
     List<Integer> modalidadeIds;
    
    /**
     * Creates new form janelaAlunoModalidade
     */
    public janelaAlunoModalidade(Aluno aluno) {
        initComponents();
        
        jLbCpfAluno.setText(aluno.getCpf());
        jLbPlanoEscolhido.setText(aluno.getPlano());
        
        
    }

    public janelaAlunoModalidade() {
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
        jLbCpfAluno = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLbPlanoEscolhido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRbAcademia = new javax.swing.JRadioButton();
        jRbNatacao = new javax.swing.JRadioButton();
        jRbCrossfit = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jBtEnviar = new javax.swing.JButton();
        jBtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 673));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");

        jLbCpfAluno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLbCpfAluno.setForeground(new java.awt.Color(255, 255, 255));
        jLbCpfAluno.setText("aqui o cpf do aluno");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Plano:");

        jLbPlanoEscolhido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLbPlanoEscolhido.setForeground(new java.awt.Color(255, 255, 255));
        jLbPlanoEscolhido.setText("aqui o plano escolhido");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modalidades:");

        jRbAcademia.setForeground(new java.awt.Color(255, 255, 255));
        jRbAcademia.setText("Academia");

        jRbNatacao.setForeground(new java.awt.Color(255, 255, 255));
        jRbNatacao.setText("Natacao");

        jRbCrossfit.setForeground(new java.awt.Color(255, 255, 255));
        jRbCrossfit.setText("Crossfit");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aqui o texto muda de acordo com o plano escolhido");

        jBtEnviar.setText("Enviar");
        jBtEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEnviarActionPerformed(evt);
            }
        });

        jBtVoltar.setText("Voltar");

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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(jLbPlanoEscolhido))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLbCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(jRbAcademia)
                                .addGap(18, 18, 18)
                                .addComponent(jRbNatacao)
                                .addGap(18, 18, 18)
                                .addComponent(jRbCrossfit)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLbCpfAluno))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLbPlanoEscolhido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRbAcademia)
                    .addComponent(jRbNatacao)
                    .addComponent(jRbCrossfit))
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
                .addContainerGap(58, Short.MAX_VALUE))
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
        modalidadeIds = new ArrayList<>();
        Aluno aluno = new Aluno();
        modalidadeIds.clear();
        //////////////////// CRIAR UM METODO PARA BUSCAR O CODIGO DO ALUNO NO BANCO ////////////////////
        if(aluno.getPlano().equals("Basico"))
        {  
            if(jRbAcademia.isSelected()) { jRbCrossfit.setEnabled(false); jRbNatacao.setEnabled(false); modalidadeIds.add(1); }
            else if(jRbNatacao.isSelected()) { jRbAcademia.setEnabled(false); jRbCrossfit.setEnabled(false); modalidadeIds.add(2); }
            else if(jRbCrossfit.isSelected()) { jRbAcademia.setEnabled(false); jRbNatacao.setEnabled(false); modalidadeIds.add(3); }
            
        }
        else if(aluno.getPlano().equals("Intermediario"))
        {
            if(jRbAcademia.isSelected() && jRbCrossfit.isSelected()) { jRbNatacao.setEnabled(false); modalidadeIds.add(1); modalidadeIds.add(3); }
            else if(jRbAcademia.isSelected() && jRbNatacao.isSelected()) { jRbCrossfit.setEnabled(false); modalidadeIds.add(1); modalidadeIds.add(2);}
            else if(jRbNatacao.isSelected() && jRbCrossfit.isSelected()) { jRbAcademia.setEnabled(false); modalidadeIds.add(2); modalidadeIds.add(3);}
        }
        else if(aluno.getPlano().equals("Completo")) { modalidadeIds.add(1); modalidadeIds.add(2); modalidadeIds.add(3);  }
        
         if (!modalidadeIds.isEmpty()) 
         {
            try {
                AlunoController alunoController = new AlunoController();
                alunoController.inscreverEmModalidades(modalidadeIds);
                JOptionPane.showMessageDialog(null, "O cadastro da modalidade foi realizado com sucesso.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
         } else {
        JOptionPane.showMessageDialog(null, "Selecione pelo menos uma modalidade.");
    }
    }//GEN-LAST:event_jBtEnviarActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLbCpfAluno;
    private javax.swing.JLabel jLbPlanoEscolhido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRbAcademia;
    private javax.swing.JRadioButton jRbCrossfit;
    private javax.swing.JRadioButton jRbNatacao;
    // End of variables declaration//GEN-END:variables
}
