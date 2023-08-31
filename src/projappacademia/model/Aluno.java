
package projappacademia.model;




import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projappacademia.dao.AlunoDAO;
import projappacademia.dao.ExceptionMVC;

public class Aluno {
    private int id;
    private String nome, cpf, email, tel, dataNascimento, endereco, cep, plano, formaPagamento;
    private ArrayList<String> modalidades = new ArrayList<>();

    public Aluno(String nome, String cpf, String email, String tel, String dataNascimento, String endereco, String cep, String plano, String formaPagamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tel = tel;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cep = cep;
        this.plano = plano;
        this.formaPagamento = formaPagamento;
    }
    
    public Aluno(){}
    
    public void cadastrarAluno(Aluno aluno) throws ExceptionMVC{
        
         new AlunoDAO().cadastrarAluno(aluno);
    }
    
    public void inscreverEmModalidades(List<Integer> modalidadeIds) throws ExceptionMVC {
        try {
            new AlunoDAO().inscreverAlunoEmModalidades(this.getId(), modalidadeIds);
        } catch (SQLException ex) {
            throw new ExceptionMVC("Erro ao inscrever aluno em modalidades: " + ex.getMessage());
        }
    }
    
    public Aluno listarAluno(String cpf) throws ExceptionMVC{
        return new AlunoDAO().listarAluno(cpf);
    }
    
    public void editarAluno(Aluno aluno) throws ExceptionMVC{
        new AlunoDAO().editarAluno(aluno);
    }
    /*public Aluno listarAlunoInicial(String cpf) throws ExceptionMVC{
        return new AlunoDAO().listarAlunoInicial(cpf);
    }*/
    public void excluirAluno(String cpf) throws ExceptionMVC
    {
        new AlunoDAO().excluirAluno(cpf);
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<String> getModalidades() {
        return modalidades;
    }

    public void setModalidades(ArrayList<String> modalidades) {
        this.modalidades = modalidades;
    }
    
}
