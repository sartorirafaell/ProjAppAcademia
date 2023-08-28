
package projappacademia.view;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projappacademia.controller.UsuarioController;
import projappacademia.dao.UsuarioDAO;
import projappacademia.model.Usuario;

public class janelaLogin extends javax.swing.JFrame {

  
    public janelaLogin() {
        initComponents();
    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics t){

                ImageIcon im = new ImageIcon("src/fotos/fotoInicio.jpg");
                Image i =im.getImage();

                t.drawImage(i,0,0, this.getSize().width,this.getSize().height,this);
            }
        };
        jPanel2 = new javax.swing.JPanel() {
            public void paintComponent(Graphics t){

                ImageIcon im = new ImageIcon("src/fotos/fotoMenuInicio.jpg");
                Image i =im.getImage();

                t.drawImage(i,0,0, this.getSize().width,this.getSize().height,this);
            }
        };
        jLabelLogin = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        LabelEsqueciSenha = new javax.swing.JLabel();
        jPasswordSenha = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButtonLogin = new javax.swing.JButton();
        jLabelCanes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1000, 678));

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabelLogin.setText("Login:");

        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });

        jLabelSenha.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabelSenha.setText("Senha:");

        LabelEsqueciSenha.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        LabelEsqueciSenha.setText("esqueci minha senha");
        LabelEsqueciSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelEsqueciSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelEsqueciSenhaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelEsqueciSenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelEsqueciSenhaMouseExited(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jCheckBox1.setText("mostrar senha");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButtonLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonLogin.setText("Entrar");
        jButtonLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLogin.setContentAreaFilled(false);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSenha)
                            .addComponent(jLabelLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jPasswordSenha))
                        .addGap(9, 37, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelEsqueciSenha)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(LabelEsqueciSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogin)
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );

        jLabelCanes.setFont(new java.awt.Font("MV Boli", 0, 32)); // NOI18N
        jLabelCanes.setText("CANES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(jLabelCanes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelCanes)
                .addGap(110, 110, 110)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
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

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
          if(jCheckBox1.isSelected()){
            jPasswordSenha.setEchoChar((char)0);
        }else if(!jPasswordSenha.getText().equals("Digite a nova senha")){
            jPasswordSenha.setEchoChar('*');
        }   
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void LabelEsqueciSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelEsqueciSenhaMouseClicked
        janelaEsqueciSenha jan2 = new janelaEsqueciSenha();
        jan2.setVisible(true);
        jan2.setBounds(300,200,400,200);
        jan2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
    }//GEN-LAST:event_LabelEsqueciSenhaMouseClicked

    private void LabelEsqueciSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelEsqueciSenhaMouseEntered
       LabelEsqueciSenha.setText("<html><u><font color='blue'>esqueci minha senha</font></u></html>");
    }//GEN-LAST:event_LabelEsqueciSenhaMouseEntered

    private void LabelEsqueciSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelEsqueciSenhaMouseExited
        LabelEsqueciSenha.setText("<html><t>esqueci minha senha</t></html>");
    }//GEN-LAST:event_LabelEsqueciSenhaMouseExited

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        try{
            String login, senha;
            login= jTextFieldLogin.getText();
            senha=jPasswordSenha.getText();

            Usuario usuario = new Usuario();
            usuario.setLogin(login);
            usuario.setSenha(senha);
            
            UsuarioDAO usuarioDao = new UsuarioDAO();
            ResultSet rsUsuarioDao = usuarioDao.autenticacaoUsuario(usuario);
            
            if(rsUsuarioDao.next()){
                JOptionPane.showMessageDialog(null, "Logado com sucesso!");
                dispose();
                janelaInicial jan3 = new janelaInicial();
                jan3.setVisible(true);
                jan3.setBounds(300,300,375,300);
                jan3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jan3.recebeNome(login);
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario ou senha invalida.");
            }
        
        } catch(SQLException e){            
            JOptionPane.showMessageDialog(null, "FML" + e);
        }
        
     
        
    }//GEN-LAST:event_jButtonLoginActionPerformed
    
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
            java.util.logging.Logger.getLogger(janelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEsqueciSenha;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabelCanes;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
