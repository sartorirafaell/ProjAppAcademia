
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
    
}
