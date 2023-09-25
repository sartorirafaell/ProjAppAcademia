
package projappacademia.controller.semJUnit;

import java.text.ParseException;
import projappacademia.controller.AlunoController;
import projappacademia.dao.ExceptionMVC;
import projappacademia.model.Aluno;

public class AlunoControllerTeste {
    
    private AlunoController testeAlunoController = new AlunoController();
    
    //Testa o metodo de cadastrar o Aluno criado na classe AlunoController
    public void testeCadastrarAluno() throws ExceptionMVC, ParseException{
        
        
        String nome = "Rafael";
        String cpf = "036.552.650-93";
        String email = "rafael@gmail.com";
        String tel = "(51) 9 8160-8853";
        String dataNascimento = "17/05/1995";
        String endereco = "Rua Eudoro Berlink 495";
        String cep = "90450-030";
        String plano = "Completo";
        String formaPagamento = "Credito";
        
       boolean sucesso = testeAlunoController.cadastrarAluno(nome, cpf, email, tel, dataNascimento, endereco, cep, plano, formaPagamento);
       
       if(sucesso) {
           System.out.println("Teste de cadastro de aluno concluido com sucesso\n");
       }
       else {   System.out.println("Falha em teste de cadastro de aluno \n"); } 
    }
    
    //Testa o metodo de listar o Aluno criado na classe AlunoController
    public void testeListarAluno() throws ExceptionMVC{
        String cpf = "036.552.650-93";
        Aluno aluno = testeAlunoController.listarAluno(cpf);
        
        if(aluno!=null){
            System.out.println("Teste de listar Aluno concluido\n");
        }
        else{  System.out.println("Falha em teste de listar Aluno\n"); }
    }
    
    public void testeBuscaIdAluno() throws ExceptionMVC{
        String cpf = "111.111.111-82";
        int idAluno = testeAlunoController.buscaIdAluno(cpf);
        
        if(idAluno !=0){
            System.out.println("Id do aluno encontrado: "+idAluno);
        }
        else{ System.out.println("Id do aluno nao encontrado"); }
    }
    
    
    
    public static void main(String[] args) throws ParseException {
        AlunoControllerTeste teste = new AlunoControllerTeste();
        try {
            teste.testeCadastrarAluno();
            teste.testeListarAluno();
            teste.testeBuscaIdAluno();
        } catch (ExceptionMVC e) {
            e.printStackTrace();
        }
    }
}
