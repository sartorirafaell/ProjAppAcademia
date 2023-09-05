
package projappacademia.controller;


import java.text.ParseException;
import java.util.ArrayList;

import projappacademia.dao.ExceptionMVC;

import projappacademia.model.Aluno;

public class AlunoController {
    
    public boolean cadastrarAluno(String nome,String cpf,String email,String tel,String dataNascimento,String endereco,String cep,String plano,String formaPagamento) throws ParseException, ExceptionMVC{
    
        if(nome != null && nome.length()>0 && validarCPF(cpf) && email != null && email.length()>0 && tel != null && tel.length()>0 && validarData(dataNascimento) && endereco != null 
                && endereco.length()>0 && cep != null && plano != null  && formaPagamento != null) {
        
            
            Aluno aluno = new Aluno(nome, cpf, email, tel, dataNascimento, endereco, cep, plano, formaPagamento);
            aluno.cadastrarAluno(aluno);
         return true;  
        }
        return false;
    }
    
    public void inscreverEmModalidades(int alunoId, ArrayList<Integer> modalidadeIds) throws ExceptionMVC {
        new Aluno().inscreverEmModalidades(alunoId, modalidadeIds);     
    }
    
    public int buscaIdAluno (String cpf) throws ExceptionMVC{
        return new Aluno().buscaIdAluno(cpf);
    }
    
    public Aluno listarAluno(String cpf) throws ExceptionMVC{
        return new Aluno().listarAluno(cpf);
    }
  
    
    public void editarAluno(String nome,String cpf,String email,String tel,String dataNascimento,String endereco,String cep,String plano,String formaPagamento) throws ParseException, ExceptionMVC{
         if(nome != null && nome.length()>0 && validarCPF(cpf) && email != null && email.length()>0 && tel != null && tel.length()>0 && validarData(dataNascimento) && endereco != null 
                && endereco.length()>0 && cep != null && plano != null  && formaPagamento != null) {
        
            
            Aluno aluno = new Aluno(nome, cpf, email, tel, dataNascimento, endereco, cep, plano, formaPagamento);
            aluno.editarAluno(aluno);
          
        }

    
    }
     public void excluirAluno(String cpf) throws ExceptionMVC
     {
         if(validarCPF(cpf))
         {
           Aluno aluno = new Aluno();
            aluno.excluirAluno(cpf);  
         }    
     }
     
    
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
}
