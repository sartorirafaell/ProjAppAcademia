
package projappacademia.controller.semJUnit;

import java.text.ParseException;
import projappacademia.controller.AlunoController;
import projappacademia.dao.ExceptionMVC;

public class AlunoControllerTeste {
    
    private AlunoController testeAlunoController;
    
    public void testeCadastrarAluno() throws ExceptionMVC, ParseException{
        testeAlunoController = new AlunoController();
        
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
           System.out.println("Teste concluído com sucesso");
       }
       else {   System.out.println("Falha em teste"); } 
    }
    
    public void testeListarAluno(){}
    
    
    
    public static void main(String[] args) {
        AlunoControllerTeste teste = new AlunoControllerTeste();
        try {
            teste.testeCadastrarAluno();
        } catch (ExceptionMVC | ParseException e) {
            e.printStackTrace();
        }
    }
}
