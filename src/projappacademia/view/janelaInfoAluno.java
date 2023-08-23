/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projappacademia.view;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projappacademia.model.Aluno;
/**
 *
 * @author 771900057
 */
public class janelaInfoAluno extends javax.swing.JFrame {

    /**
     * Creates new form janelaInfoAluno
     */
    public janelaInfoAluno(Aluno aluno) {
        initComponents();
        
         try {
        jTextNome.setText(aluno.getNome());
        jTextEmail.setText(aluno.getEmail());
        jFormattedTextCPF.setText(aluno.getCpf());
        jFormattedTextTel.setText(aluno.getTel());
        jTextEnd.setText(aluno.getEndereco());
        jFormattedTextCEP.setText(aluno.getCep());
        jFormattedTextDtNasc.setText(aluno.getDataNascimento());
        jComboBoxPlano.setSelectedItem(aluno.getPlano());
        if(aluno.getFormaPagamento().equals("Crédito")){jRbCredito.setSelected(true);}
        else {jRbDebito.setSelected(true);}
} catch (NullPointerException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(this, "Erro ao definir valores nos campos de texto: " + ex.getMessage());
}
    }

    private janelaInfoAluno() {
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFormPag = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics t){

                ImageIcon im = new ImageIcon("src/fotos/fundoInfoAluno.jpg");
                Image i =im.getImage();

                t.drawImage(i,0,0, this.getSize().width,this.getSize().height,this);
            }
        };
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jFormattedTextCPF = new javax.swing.JFormattedTextField();
        jLabelTel = new javax.swing.JLabel();
        jFormattedTextTel = new javax.swing.JFormattedTextField();
        jLabelEnd = new javax.swing.JLabel();
        jTextEnd = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jFormattedTextCEP = new javax.swing.JFormattedTextField();
        jLabelDataNasc = new javax.swing.JLabel();
        jFormattedTextDtNasc = new javax.swing.JFormattedTextField();
        jLabelPlano = new javax.swing.JLabel();
        jComboBoxPlano = new javax.swing.JComboBox<>();
        jLabelModalidade = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jLabelFormPagamento = new javax.swing.JLabel();
        jRbCredito = new javax.swing.JRadioButton();
        jRbDebito = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInfoAluno = new javax.swing.JTable();
        jButtonVolta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(899, 603));

        jButton1.setBackground(new java.awt.Color(36, 36, 36));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar aluno");

        jButton2.setBackground(new java.awt.Color(36, 36, 36));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Fechar plano");

        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome:");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail:");

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        jLabelCPF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPF.setText("CPF:");

        try {
            jFormattedTextCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelTel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTel.setText("Telefone:");

        try {
            jFormattedTextTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelEnd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEnd.setText("Endereço:");

        jTextEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEndActionPerformed(evt);
            }
        });

        jLabelCEP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCEP.setText("CEP:");

        try {
            jFormattedTextCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelDataNasc.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataNasc.setText("Data de nascimento:");

        try {
            jFormattedTextDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelPlano.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlano.setText("Plano:");

        jComboBoxPlano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Básico", "Intermediario", "Completo" }));
        jComboBoxPlano.setRequestFocusEnabled(false);
        jComboBoxPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPlanoActionPerformed(evt);
            }
        });

        jLabelModalidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModalidade.setText("Modalidades:");

        jRadioButton11.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setText("Academia");
        jRadioButton11.setContentAreaFilled(false);

        jRadioButton12.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setText("Natação");
        jRadioButton12.setContentAreaFilled(false);

        jRadioButton13.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton13.setText("Crossfit");
        jRadioButton13.setContentAreaFilled(false);

        jLabelFormPagamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFormPagamento.setText("Forma de pagamento:");

        buttonGroupFormPag.add(jRbCredito);
        jRbCredito.setForeground(new java.awt.Color(255, 255, 255));
        jRbCredito.setText("Crédito");
        jRbCredito.setContentAreaFilled(false);

        buttonGroupFormPag.add(jRbDebito);
        jRbDebito.setForeground(new java.awt.Color(255, 255, 255));
        jRbDebito.setText("Débito");
        jRbDebito.setContentAreaFilled(false);

        jTableInfoAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mensalidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableInfoAluno.setEnabled(false);
        jScrollPane1.setViewportView(jTableInfoAluno);

        jButtonVolta.setBackground(new java.awt.Color(36, 36, 36));
        jButtonVolta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolta.setText("Voltar");
        jButtonVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTel)
                                    .addComponent(jLabelEnd)
                                    .addComponent(jLabelCEP)
                                    .addComponent(jLabelDataNasc))
                                .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabelCPF))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jFormattedTextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(jFormattedTextTel, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(jFormattedTextCPF))
                            .addComponent(jFormattedTextDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonVolta))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelPlano)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelModalidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton12)
                                        .addGap(26, 26, 26)
                                        .addComponent(jRadioButton13)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelFormPagamento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRbDebito)
                                        .addComponent(jRbCredito))
                                    .addGap(142, 142, 142)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTel)
                            .addComponent(jFormattedTextTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEnd)
                            .addComponent(jTextEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCEP)
                            .addComponent(jFormattedTextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPlano)
                            .addComponent(jComboBoxPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelModalidade)
                            .addComponent(jRadioButton11)
                            .addComponent(jRadioButton12)
                            .addComponent(jRadioButton13))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFormPagamento)
                            .addComponent(jRbCredito))
                        .addGap(18, 18, 18)
                        .addComponent(jRbDebito)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataNasc)
                            .addComponent(jFormattedTextDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButtonVolta))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jTextEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEndActionPerformed

    private void jButtonVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonVoltaActionPerformed

    private void jComboBoxPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPlanoActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTableInfoAluno.getModel();
            tableModel.setRowCount(0); // Limpa todas as linhas da tabela
        if(jComboBoxPlano.getSelectedItem().equals("Básico")){

             for (int i = 1; i <= 12; i++) {
            tableModel.addRow(new Object[] { i, "R$ 100"});
        }
        }
        else if(jComboBoxPlano.getSelectedItem().equals("Intermediario")){

                for (int i = 1; i <= 12; i++) {
            tableModel.addRow(new Object[] { i, "R$ 150"});
        }
            }
        else if(jComboBoxPlano.getSelectedItem().equals("Completo")){
             
                 for (int i = 1; i <= 12; i++) {
            tableModel.addRow(new Object[] { i, "R$ 200"});
        }
            }

    }//GEN-LAST:event_jComboBoxPlanoActionPerformed

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
            java.util.logging.Logger.getLogger(janelaInfoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janelaInfoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janelaInfoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janelaInfoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janelaInfoAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFormPag;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonVolta;
    private javax.swing.JComboBox<String> jComboBoxPlano;
    private javax.swing.JFormattedTextField jFormattedTextCEP;
    private javax.swing.JFormattedTextField jFormattedTextCPF;
    private javax.swing.JFormattedTextField jFormattedTextDtNasc;
    private javax.swing.JFormattedTextField jFormattedTextTel;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEnd;
    private javax.swing.JLabel jLabelFormPagamento;
    private javax.swing.JLabel jLabelModalidade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPlano;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRbCredito;
    private javax.swing.JRadioButton jRbDebito;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInfoAluno;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEnd;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
