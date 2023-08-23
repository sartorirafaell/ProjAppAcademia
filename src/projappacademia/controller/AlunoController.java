
package projappacademia.controller;


import java.text.ParseException;
import projappacademia.dao.ExceptionMVC;

import projappacademia.model.Aluno;

public class AlunoController {
    
    public boolean cadastrarAluno(String nome,String cpf,String email,String tel,String dataNascimento,String endereco,String cep,String plano,int preco,String formaPagamento) throws ParseException, ExceptionMVC{
    
        if(nome != null && nome.length()>0 && validarCPF(cpf) && email != null && email.length()>0 && tel != null && tel.length()>0 && validarData(dataNascimento) && endereco != null 
                && endereco.length()>0 && cep != null && plano != null && preco !=0 && formaPagamento != null) {
        
            
            Aluno aluno = new Aluno(nome, cpf, email, tel, dataNascimento, endereco, cep, plano, preco, formaPagamento);
            aluno.cadastrarAluno(aluno);
         return true;  
        }
        return false;
    }
    
    public Aluno listarAluno(String cpf) throws ExceptionMVC{
        return new Aluno().listarAluno(cpf);
    }
   /* public Aluno listarAlunoInicial(String cpf) throws ExceptionMVC{
        return new Aluno().listarAlunoInicial(cpf);
    }*/
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
