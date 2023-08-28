
package projappacademia.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projappacademia.model.Usuario;


public class UsuarioDAO {
    
     Connection connection;
    
    public ResultSet autenticacaoUsuario(Usuario usuario){
        connection = new ConnectionMVC().getConnection();
        
        try{
            String sql = "select * from usuario where login = ? and senha = ?";
            PreparedStatement pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, usuario.getLogin());
            pStatement.setString(2, usuario.getSenha());
            
            ResultSet rs = pStatement.executeQuery();
            return rs;
            
            
        }catch(SQLException e){
            //throw new ExceptionMVC("Erro ao logar o usuario: "+ e);
            JOptionPane.showMessageDialog(null, "Usuario: " + e);
            return null;
        }
    }
    
    public void editarSenha(Usuario usuario) throws SQLException {
    String sql = "UPDATE usuario SET senha = ? WHERE login = ?";

    Connection connection = null;
    PreparedStatement pStatement = null;

    try {
        connection = new ConnectionMVC().getConnection();
        pStatement = connection.prepareStatement(sql);
        pStatement.setString(1, usuario.getSenha());
        pStatement.setString(2, usuario.getLogin());

        
        // Executa a atualização apenas se o login existir no banco de dados
        int rowsAffected = pStatement.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Senha do usuário alterada com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Login não encontrado. A senha não foi alterada.");
        }
    } catch(SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao trocar senha de usuário: " + e.getMessage());
    } finally {
        if (pStatement != null) {
            pStatement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}
   
    
    }
