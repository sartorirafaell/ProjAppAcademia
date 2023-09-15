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
import javax.swing.table.DefaultTableModel;
import projappacademia.controller.AlunoController;
import projappacademia.dao.AlunoDAO;
import projappacademia.model.Aluno;

public class janelaInfoAluno extends javax.swing.JFrame {
    String tipoPagamento;   
    ArrayList<Integer> modalidadeIds = new ArrayList<Integer>();
   
    public janelaInfoAluno(Aluno aluno) {
        initComponents();
        
        ArrayList<Integer> modalidadesAluno = new ArrayList<>();
        
         try {
        jTextNome.setText(aluno.getNome());
        jTextEmail.setText(aluno.getEmail());
        jFormattedTextCPF.setText(aluno.getCpf());
        jFormattedTextTel.setText(aluno.getTel());
        jTextEnd.setText(aluno.getEndereco());
        jFormattedTextCEP.setText(aluno.getCep());
        jFormattedTextDtNasc.setText(aluno.getDataNascimento());
        jComboBoxPlano.setSelectedItem(aluno.getPlano());
        if(aluno.getFormaPagamento().equals("Credito")){jRbCredito.setSelected(true);}
        else if(aluno.getFormaPagamento().equals("Debito")){jRbDebito.setSelected(true);}
        
        
            try {
                AlunoController alunocont = new AlunoController();
                int codAluno =  alunocont.buscaIdAluno(jFormattedTextCPF.getText());
                modalidadesAluno = alunocont.retornaModalidadesAluno(codAluno);
                
                for(int i : modalidadesAluno){
                    if(i == 1){jCbAcademia.setSelected(true);}
                    if(i == 2){jCbNatacao.setSelected(true);}
                    if(i == 3){jCbCrossfit.setSelected(true);}
                }
               
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Erro ao retornar a modalidade do aluno: "+ ex);
            }
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
        jBtEditarAluno = new javax.swing.JButton();
        jBtFecharPlano = new javax.swing.JButton();
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
        jLabelFormPagamento = new javax.swing.JLabel();
        jRbCredito = new javax.swing.JRadioButton();
        jRbDebito = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInfoAluno = new javax.swing.JTable();
        jButtonVolta = new javax.swing.JButton();
        jCbAcademia = new javax.swing.JCheckBox();
        jCbNatacao = new javax.swing.JCheckBox();
        jCbCrossfit = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(899, 603));

        jBtEditarAluno.setBackground(new java.awt.Color(36, 36, 36));
        jBtEditarAluno.setForeground(new java.awt.Color(255, 255, 255));
        jBtEditarAluno.setText("Editar aluno");
        jBtEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEditarAlunoActionPerformed(evt);
            }
        });

        jBtFecharPlano.setBackground(new java.awt.Color(36, 36, 36));
        jBtFecharPlano.setForeground(new java.awt.Color(255, 255, 255));
        jBtFecharPlano.setText("Fechar plano");
        jBtFecharPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtFecharPlanoActionPerformed(evt);
            }
        });

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

        jComboBoxPlano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basico", "Intermediario", "Completo" }));
        jComboBoxPlano.setRequestFocusEnabled(false);
        jComboBoxPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPlanoActionPerformed(evt);
            }
        });

        jLabelModalidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModalidade.setText("Modalidades:");

        jLabelFormPagamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFormPagamento.setText("Forma de pagamento:");

        buttonGroupFormPag.add(jRbCredito);
        jRbCredito.setForeground(new java.awt.Color(255, 255, 255));
        jRbCredito.setText("Credito");
        jRbCredito.setContentAreaFilled(false);
        jRbCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbCreditoActionPerformed(evt);
            }
        });

        buttonGroupFormPag.add(jRbDebito);
        jRbDebito.setForeground(new java.awt.Color(255, 255, 255));
        jRbDebito.setText("Debito");
        jRbDebito.setContentAreaFilled(false);
        jRbDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbDebitoActionPerformed(evt);
            }
        });

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
                                .addComponent(jBtEditarAluno)
                                .addGap(18, 18, 18)
                                .addComponent(jBtFecharPlano)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonVolta))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelPlano)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelModalidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCbAcademia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCbNatacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCbCrossfit))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelFormPagamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRbDebito)
                                    .addComponent(jRbCredito)))))
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
                            .addComponent(jCbAcademia)
                            .addComponent(jCbNatacao)
                            .addComponent(jCbCrossfit))
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
                            .addComponent(jBtEditarAluno)
                            .addComponent(jBtFecharPlano)
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
        if(jComboBoxPlano.getSelectedItem().equals("Basico")){

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

    private void jBtEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEditarAlunoActionPerformed
        if(jRbCredito.isSelected()){tipoPagamento = "Credito";}
        else if(jRbDebito.isSelected()){tipoPagamento = "Debito";}
        
        String nome = jTextNome.getText();
        String cpf = jFormattedTextCPF.getText();
        String email = jTextEmail.getText();
        String tel = jFormattedTextTel.getText();
        String dataNascimento = jFormattedTextDtNasc.getText();
        String endereco = jTextEnd.getText();
        String cep = jFormattedTextCEP.getText();
        String plano = String.valueOf(jComboBoxPlano.getSelectedItem());
        
        if (!modalidadeIds.isEmpty()){
        try{
        AlunoController alunoController = new AlunoController();
        int codAluno= alunoController.buscaIdAluno(cpf);
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.obterModalidadesAtuaisDoAluno(codAluno);
        alunoController.editarModalidade(codAluno, modalidadeIds);
        alunoController.editarAluno(nome, cpf, email, tel, dataNascimento, endereco, cep, plano, tipoPagamento);
        
            JOptionPane.showMessageDialog(null, "Informações do aluno atualizadas com sucesso!");
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, "Não foi possível atualizar as informações do aluno");
            JOptionPane.showMessageDialog(null, "erro aqui:"+ e);
        }
        }
    }//GEN-LAST:event_jBtEditarAlunoActionPerformed

    private void jRbCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbCreditoActionPerformed
       
    }//GEN-LAST:event_jRbCreditoActionPerformed

    private void jRbDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbDebitoActionPerformed
       
    }//GEN-LAST:event_jRbDebitoActionPerformed

    private void jBtFecharPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtFecharPlanoActionPerformed
       String cpf = jFormattedTextCPF.getText();
        try 
        {
            AlunoController alunoController = new AlunoController();
           int id = alunoController.buscaIdAluno(cpf);
            alunoController.excluirAluno(cpf, id);
                        JOptionPane.showMessageDialog(null, "Plano fechado com sucesso!");
            dispose();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jBtFecharPlanoActionPerformed

    private void jCbCrossfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbCrossfitActionPerformed
         String plano = (String) jComboBoxPlano.getSelectedItem();
         
         
         if(!jCbAcademia.isSelected() && !jCbNatacao.isSelected() && !jCbCrossfit.isSelected()){
            modalidadeIds.clear(); 
            jCbAcademia.setEnabled(true); 
            jCbNatacao.setEnabled(true); 
            jCbCrossfit.setEnabled(true); 
        }
          if (plano.equals("Basico") && jCbCrossfit.isSelected()) {
            
                modalidadeIds.add(3);
                jCbAcademia.setEnabled(false);
                jCbNatacao.setEnabled(false);
            
        }
        else if (plano.equals("Intermediario")) {
            if (jCbCrossfit.isSelected() && jCbAcademia.isSelected()) {
                modalidadeIds.add(1);
                modalidadeIds.add(3);
                jCbNatacao.setEnabled(false);

            } else if (jCbCrossfit.isSelected() && jCbNatacao.isSelected()) {
                modalidadeIds.add(2);
                modalidadeIds.add(3);
                jCbAcademia.setEnabled(false);
            }
        }
            else if (plano.equals("Completo")){
            if(jCbAcademia.isSelected() && jCbNatacao.isSelected() && jCbCrossfit.isSelected()){
            modalidadeIds.add(1);
            modalidadeIds.add(2);
            modalidadeIds.add(3);}
        }    
            
    }//GEN-LAST:event_jCbCrossfitActionPerformed

    private void jCbAcademiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbAcademiaActionPerformed
        String plano = (String) jComboBoxPlano.getSelectedItem();
     
        if(!jCbAcademia.isSelected() && !jCbNatacao.isSelected() && !jCbCrossfit.isSelected()){
            modalidadeIds.clear(); 
            jCbAcademia.setEnabled(true); 
            jCbNatacao.setEnabled(true); 
            jCbCrossfit.setEnabled(true); 
        }
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
      else if (plano.equals("Completo")){
            if(jCbAcademia.isSelected() && jCbNatacao.isSelected() && jCbCrossfit.isSelected()){
            modalidadeIds.add(1);
            modalidadeIds.add(2);
            modalidadeIds.add(3);}
        }    
        
         
         
    }//GEN-LAST:event_jCbAcademiaActionPerformed

    private void jCbNatacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbNatacaoActionPerformed
        String plano = (String) jComboBoxPlano.getSelectedItem();
        
        if(!jCbAcademia.isSelected() && !jCbNatacao.isSelected() && !jCbCrossfit.isSelected()){
            modalidadeIds.clear(); 
            jCbAcademia.setEnabled(true); 
            jCbNatacao.setEnabled(true); 
            jCbCrossfit.setEnabled(true); 
        }
        if (plano.equals("Basico") && jCbNatacao.isSelected()) {

                modalidadeIds.add(2);
                jCbAcademia.setEnabled(false);
                jCbCrossfit.setEnabled(false);
               
        }
        else if (plano.equals("Intermediario")) {
        if (jCbAcademia.isSelected() && jCbNatacao.isSelected()) {
            modalidadeIds.add(1);
            modalidadeIds.add(2);
            jCbCrossfit.setEnabled(false);
            
        }  else if (jCbNatacao.isSelected() && jCbCrossfit.isSelected()) {
            modalidadeIds.add(2);
            modalidadeIds.add(3);
            jCbAcademia.setEnabled(false);
           }
        }
         else if (plano.equals("Completo")){
            if(jCbAcademia.isSelected() && jCbNatacao.isSelected() && jCbCrossfit.isSelected()){
            modalidadeIds.add(1);
            modalidadeIds.add(2);
            modalidadeIds.add(3);}
        }    
        
    }//GEN-LAST:event_jCbNatacaoActionPerformed

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
    private javax.swing.JButton jBtEditarAluno;
    private javax.swing.JButton jBtFecharPlano;
    private javax.swing.JButton jButtonVolta;
    private javax.swing.JCheckBox jCbAcademia;
    private javax.swing.JCheckBox jCbCrossfit;
    private javax.swing.JCheckBox jCbNatacao;
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
    private javax.swing.JRadioButton jRbCredito;
    private javax.swing.JRadioButton jRbDebito;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInfoAluno;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEnd;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
