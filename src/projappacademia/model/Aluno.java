
package projappacademia.model;



import projappacademia.dao.AlunoDAO;
import projappacademia.dao.ExceptionMVC;

public class Aluno {
    private String nome, cpf, email, tel, dataNascimento, endereco, cep, plano, formaPagamento;
    private int preco;

    public Aluno(String nome, String cpf, String email, String tel, String dataNascimento, String endereco, String cep, String plano,int preco, String formaPagamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tel = tel;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cep = cep;
        this.plano = plano;
        this.preco = preco;
        this.formaPagamento = formaPagamento;
    }
    
    public Aluno(){}
    
    public void cadastrarAluno(Aluno aluno) throws ExceptionMVC{
        
         new AlunoDAO().cadastrarAluno(aluno);
    }
    
    public Aluno listarAluno(String cpf) throws ExceptionMVC{
        return new AlunoDAO().listarAluno(cpf);
    }
    
    /*public Aluno listarAlunoInicial(String cpf) throws ExceptionMVC{
        return new AlunoDAO().listarAlunoInicial(cpf);
    }*/

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
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
    
}
