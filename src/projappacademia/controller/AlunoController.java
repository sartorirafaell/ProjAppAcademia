
package projappacademia.controller;


import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import projappacademia.dao.ExceptionMVC;

import projappacademia.model.Aluno;

public class AlunoController {
    
    //Método que após verificar se todos os campos estão preenchidos e valida o CPF
    public boolean cadastrarAluno(String nome,String cpf,String email,String tel,String dataNascimento,String endereco,String cep,String plano,String formaPagamento) throws ParseException, ExceptionMVC{
    
       if(nome != null && nome.length()>0 && validarCPF(cpf) && email != null && email.length()>0 && tel != null && tel.length()>0 && validarData(dataNascimento) && endereco != null 
                && endereco.length()>0 && cep != null && plano != null  && formaPagamento != null) {
        
            
            Aluno aluno = new Aluno(nome, cpf, email, tel, dataNascimento, endereco, cep, plano, formaPagamento);
            aluno.cadastrarAluno(aluno);
         return true;  
       }
       return false;
    }
    
    //Método para inscrever o Aluno em uma modalidade
    public void inscreverEmModalidades(int alunoId, ArrayList<Integer> modalidadeIds) throws ExceptionMVC {
        new Aluno().inscreverEmModalidades(alunoId, modalidadeIds);     
    }
    
    //Método para buscar o ID do aluno no banco de dados
    public int buscaIdAluno (String cpf) throws ExceptionMVC{
        return new Aluno().buscaIdAluno(cpf);
    }
    
    //Método que verifica o CPF do aluno no DB e lista seus dados
    public Aluno listarAluno(String cpf) throws ExceptionMVC{
        return new Aluno().listarAluno(cpf);
    }
  
    //Método para inserir novos dados no aluno já cadastrado
    public void editarAluno(String nome,String cpf,String email,String tel,String dataNascimento,String endereco,String cep,String plano,String formaPagamento) throws ParseException, ExceptionMVC{
         if(nome != null && nome.length()>0 && validarCPF(cpf) && email != null && email.length()>0 && tel != null && tel.length()>0 && validarData(dataNascimento) && endereco != null 
                && endereco.length()>0 && cep != null && plano != null  && formaPagamento != null) {
        
            
            Aluno aluno = new Aluno(nome, cpf, email, tel, dataNascimento, endereco, cep, plano, formaPagamento);
            aluno.editarAluno(aluno);
          
        }

    
    }
    
    //Método para fechar o plano do aluno
     public void excluirAluno(String cpf, int id) throws ExceptionMVC
     {
         if(validarCPF(cpf))
         {
           Aluno aluno = new Aluno();
            aluno.excluirAluno(cpf, id);  
         }    
     }
     
    //Método para validar o CPF
    public boolean validarCPF(String cpf){
        for(int i = 0; i<cpf.length(); i++){
            if(!Character.isDigit(cpf.charAt(i))){
                if(!(i==3 || i==7 || i==11)){
                    return false;
                }
            }
            
        }
        return true;
    }
    //Método para validar a data de nascimento 
    public boolean validarData(String data){
        for(int i = 0; i<data.length(); i++){
            if(!Character.isDigit(data.charAt(i))){
                if(!(i==2 || i==5)){
                    return false;
                }
            }
            
        }
        return true;
    }
    
    //Método para retornar a modalidade do aluno
    public ArrayList<Integer> retornaModalidadesAluno(int aluno_codigo) throws ExceptionMVC {
        return new Aluno().retornaModalidadesAluno(aluno_codigo);
    }

    //Método para editar a modalidade do aluno
    public void editarModalidade(int codAluno, ArrayList<Integer> modalidadeIds) throws SQLException {
        new Aluno().editarModalidade(codAluno, modalidadeIds); 
    }
    
}
