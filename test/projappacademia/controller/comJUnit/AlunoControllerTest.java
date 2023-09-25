/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projappacademia.controller.comJUnit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import projappacademia.controller.AlunoController;
import static org.junit.Assert.*;

import projappacademia.model.Aluno;

/**
 *
 * @author 771900057
 */
public class AlunoControllerTest {
    AlunoController alunoControlTest;
    public AlunoControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        alunoControlTest = new AlunoController();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarAluno method, of class AlunoController.
     */
    @Test
    public void testCadastrarAluno() throws Exception {
        
        String nome = "";
        String cpf = "036.552.650-93";
        String email = "rafael@gmail.com";
        String tel = "(51) 9 8160-8853";
        String dataNascimento = "17/05/1995";
        String endereco = "Rua Eudoro Berlink 495";
        String cep = "90450-030";
        String plano = "Completo";
        String formaPagamento = "Credito";
        
        assertTrue(alunoControlTest.cadastrarAluno(nome, cpf, email, tel, dataNascimento, endereco, cep, plano, formaPagamento));
    }


    /**
     * Test of buscaIdAluno method, of class AlunoController.
     */
    @Test
    public void testBuscaIdAluno() throws Exception {
        String cpf = "036.552.650-93";
        assertEquals(54,alunoControlTest.buscaIdAluno(cpf));
    }

    /**
     * Test of listarAluno method, of class AlunoController.
     */
    @Test
    public void testListarAluno() throws Exception {
        
        String cpf = "036.552.650-9";
        Aluno aluno = alunoControlTest.listarAluno(cpf);
        assertNotNull(aluno);
       
        assertEquals("Rafael", aluno.getNome());
    }

   
     
}
