
package projappacademia.model;

import java.sql.SQLException;
import projappacademia.dao.AlunoDAO;
import projappacademia.dao.UsuarioDAO;

public class Usuario {
    private String nome, login, senha;

    public Usuario(String login, String senha) {
       
        this.login = login;
        this.senha = senha;
    }

  public Usuario(){}

   public void verificaLogin(Usuario usuario){
       
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       usuarioDAO.autenticacaoUsuario(usuario);
   }
   
   public void editarSenha(Usuario usuario) throws SQLException
   {
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       usuarioDAO.editarSenha(usuario);
   }
   
  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
