/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projappacademia.controller;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projappacademia.dao.ExceptionMVC;
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
        
        String nome = "Rafael";
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
        
        String cpf = "036.552.650-93";
        Aluno aluno = alunoControlTest.listarAluno(cpf);
        assertNotNull(aluno);
       
        assertEquals("Rafael", aluno.getNome());
    }

    /**
     * Test of editarAluno method, of class AlunoController.
     */
    @Test
    public void testEditarAluno() throws Exception {
        System.out.println("editarAluno");
        String nome = "";
        String cpf = "";
        String email = "";
        String tel = "";
        String dataNascimento = "";
        String endereco = "";
        String cep = "";
        String plano = "";
        String formaPagamento = "";
        AlunoController instance = new AlunoController();
        instance.editarAluno(nome, cpf, email, tel, dataNascimento, endereco, cep, plano, formaPagamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirAluno method, of class AlunoController.
     */
    @Test
    public void testExcluirAluno() throws Exception {
        System.out.println("excluirAluno");
        String cpf = "";
        int id = 0;
        AlunoController instance = new AlunoController();
        instance.excluirAluno(cpf, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCPF method, of class AlunoController.
     */
    @Test
    public void testValidarCPF() {
        System.out.println("validarCPF");
        String cpf = "";
        AlunoController instance = new AlunoController();
        boolean expResult = false;
        boolean result = instance.validarCPF(cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarData method, of class AlunoController.
     */
    @Test
    public void testValidarData() {
        System.out.println("validarData");
        String data = "";
        AlunoController instance = new AlunoController();
        boolean expResult = false;
        boolean result = instance.validarData(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornaModalidadesAluno method, of class AlunoController.
     */
    @Test
    public void testRetornaModalidadesAluno() throws Exception {
        System.out.println("retornaModalidadesAluno");
        int aluno_codigo = 0;
        AlunoController instance = new AlunoController();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.retornaModalidadesAluno(aluno_codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarModalidade method, of class AlunoController.
     */
    @Test
    public void testEditarModalidade() throws Exception {
        System.out.println("editarModalidade");
        int codAluno = 0;
        ArrayList<Integer> modalidadeIds = null;
        AlunoController instance = new AlunoController();
        instance.editarModalidade(codAluno, modalidadeIds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
