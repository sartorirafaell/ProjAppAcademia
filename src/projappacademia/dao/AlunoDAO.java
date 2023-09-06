
package projappacademia.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import projappacademia.model.Aluno;

public class AlunoDAO {
 
    public void cadastrarAluno (Aluno aluno) throws ExceptionMVC{
        String sql = "insert into aluno (nome, cpf, email, tel, dataNascimento, endereco, cep, plano, formaPagamento) values (?,?,?,?,?,?,?,?,?)";
       
        PreparedStatement pStatement = null;
        Connection connection = null;

        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, aluno.getNome());
            pStatement.setString(2, aluno.getCpf());
            pStatement.setString(3, aluno.getEmail());
            pStatement.setString(4, aluno.getTel());
            pStatement.setString(5, aluno.getDataNascimento());
            pStatement.setString(6, aluno.getEndereco());
            pStatement.setString(7, aluno.getCep());
            pStatement.setString(8, aluno.getPlano());
            pStatement.setString(9, aluno.getFormaPagamento()); 
            pStatement.execute();
        
            
        }catch(SQLException e){
            throw new ExceptionMVC("Erro ao cadastrar Aluno: " + e);
        } finally {
            try{
                if (pStatement != null) {pStatement.close();}
            } catch(SQLException e){
                throw new ExceptionMVC("Erro ao fechar o Statement: " + e);
            }
            try{
                if(connection != null) {connection.close();}
            }catch(SQLException e){
                throw new ExceptionMVC("Erro ao fechar a conexão: " + e);
            }
        
            
    }
    }
    
    public Aluno listarAluno(String cpf) throws ExceptionMVC {
    String sql = "select * from aluno where cpf =  '" + cpf + "'";
    
    Connection connection = null;
    PreparedStatement pStatement = null;
    Aluno aluno = null; // Inicialize como nulo
    
    try {
        connection = new ConnectionMVC().getConnection();
        pStatement = connection.prepareStatement(sql);
        ResultSet rs = pStatement.executeQuery(sql);
        
        if (rs != null && rs.next()) {
            aluno = new Aluno();
            aluno.setNome(rs.getString("nome"));
            aluno.setCpf(rs.getString("cpf"));
            aluno.setEmail(rs.getString("email"));
            aluno.setTel(rs.getString("tel"));
            aluno.setDataNascimento(rs.getString("dataNascimento"));
            aluno.setEndereco(rs.getString("endereco"));
            aluno.setCep(rs.getString("cep"));
            aluno.setPlano(rs.getString("plano"));
            aluno.setFormaPagamento(rs.getString("formaPagamento"));
        }
    } catch (SQLException e) {
        throw new ExceptionMVC("Erro ao consultar aluno: " + e);
    } finally {
        try {
            if (pStatement != null) {
                pStatement.close();
            }
        } catch (SQLException e) {
            throw new ExceptionMVC("Erro ao fechar o statement: " + e);
        }
        
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new ExceptionMVC("Erro ao fechar a conexão: " + e);
        }
    }
    
    return aluno;
}
    
    public void editarAluno(Aluno aluno) throws ExceptionMVC{
        String sql = "UPDATE aluno SET nome=?, cpf=?, email=?, tel=?, dataNascimento=?, endereco=?, cep=?, plano=?, formaPagamento=?" +" WHERE cpf = '" +aluno.getCpf() +"'" ;
    
    Connection connection = null;
    PreparedStatement pStatement = null;
    
    try {
        connection = new ConnectionMVC().getConnection();
        pStatement = connection.prepareStatement(sql);
        pStatement.setString(1, aluno.getNome());
        pStatement.setString(2, aluno.getCpf());
        pStatement.setString(3, aluno.getEmail());
        pStatement.setString(4, aluno.getTel());
        pStatement.setString(5, aluno.getDataNascimento());
        pStatement.setString(6, aluno.getEndereco());
        pStatement.setString(7, aluno.getCep());
        pStatement.setString(8, aluno.getPlano());
        pStatement.setString(9, aluno.getFormaPagamento()); 
        pStatement.execute();
    } catch(SQLException e) {
        throw new ExceptionMVC("Erro ao editar Aluno: " + e);
    
        } finally {
            try{
                if (pStatement != null) {pStatement.close();}
            } catch(SQLException e){
                throw new ExceptionMVC("Erro ao fechar o Statement: " + e);
            }
            try{
                if(connection != null) {connection.close();}
            }catch(SQLException e){
                throw new ExceptionMVC("Erro ao fechar a conexão: " + e);
            }
        
            
    }
        
               
             }
        
    public void excluirAluno(String cpf)throws ExceptionMVC
    {
        String sql= "DELETE FROM aluno WHERE cpf = '" + cpf + "'";
        
        PreparedStatement pStatement = null;
        Connection connection = null;

        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.executeUpdate();
        }catch(SQLException e){
            throw new ExceptionMVC("Erro ao fechar o plano do Aluno: " + e);
        } finally {
            try{
                if (pStatement != null) {pStatement.close();}
            } catch(SQLException e){
                throw new ExceptionMVC("Erro ao fechar o Statement: " + e);
            }
            try{
                if(connection != null) {connection.close();}
            }catch(SQLException e){
                throw new ExceptionMVC("Erro ao fechar a conexão: " + e);
            }
        
          }
    }
   
     public void inscreverAlunoEmModalidades(int alunoId, ArrayList<Integer> modalidadeIds) throws SQLException {
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    try {
        connection = new ConnectionMVC().getConnection();

        String sql = "INSERT INTO aluno_has_modalidade (aluno_codigo, modalidade_codigo) VALUES (?, ?)";
        preparedStatement = connection.prepareStatement(sql);

        // Inserir as modalidades
        for (int modalidadeId : modalidadeIds) {
            preparedStatement.setInt(1, alunoId);
            preparedStatement.setInt(2, modalidadeId);
            preparedStatement.executeUpdate();
            
        }
    } catch (SQLException e) {
        throw new SQLException("Erro ao inscrever aluno nas modalidades: " + e.getMessage());
    } finally {
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}
     
     public int buscaIdAluno (String cpf) throws ExceptionMVC{
    String sql = "SELECT codigo from aluno where cpf = ?";
     Connection connection = null;
    PreparedStatement pStatement = null;
    int codAluno = 0;
    
    try {
        connection = new ConnectionMVC().getConnection();
        pStatement = connection.prepareStatement(sql);
        pStatement.setString(1, cpf);
        ResultSet rs = pStatement.executeQuery();
        
        //if (rs != null && rs.next()) {
        if(rs.next()){
            codAluno = rs.getInt("codigo");
            
            
        }
    } catch (SQLException e) {
        throw new ExceptionMVC("Erro ao consultar aluno: " + e);
    }
        System.out.println("esse é o cod aluno:" +codAluno);
    return codAluno;
    }

   
   
}
