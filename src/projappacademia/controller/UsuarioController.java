
package projappacademia.controller;

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
}
