
package projappacademia.controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import projappacademia.model.Usuario;

public class UsuarioController {
    
    
    public boolean verificaLogin(String login, String senha){
        if(login != null || senha != null){
           Usuario usuario = new Usuario(login, senha);
            usuario.verificaLogin(usuario);
         return true;   
        }
        else {
            JOptionPane.showMessageDialog(null, "Verifique o login e senha");
        }
        return false;
    }
    
     public void editarSenha(String login, String senha, String repeteSenha) throws SQLException
     {
         if(login !=null && senha != null && repeteSenha != null)
         {
             Usuario usuario = new Usuario(login, senha);
             usuario.editarSenha(usuario);
         }
     }
    
     
}
