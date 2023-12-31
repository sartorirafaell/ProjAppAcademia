
package projappacademia.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import projappacademia.model.Aluno;

public class AlunoDAO {
 
    //Cadastra o aluno no banco de dados
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
    
   
    //Busca os dados do aluno no banco de dados
    public Aluno listarAluno(String cpf) throws ExceptionMVC {
    String sql = "select * from aluno where cpf =  '" + cpf + "'";
    
    Connection connection = null;
    PreparedStatement pStatement = null;
    Aluno aluno = null; 
    
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
   //Edita as modalidades do aluno já cadastrado
   public void editarModalidade(int codAluno, ArrayList<Integer> modalidadeIds) throws SQLException {
    Connection connection = null;
    PreparedStatement pStatement = null;

    try {
        connection = new ConnectionMVC().getConnection();
        
 
        //Executa a instrução DELETE para as modalidades antigas do aluno
        String sqlDeletaModalidade = "DELETE FROM aluno_has_modalidade WHERE aluno_codigo = ?";
        pStatement = connection.prepareStatement(sqlDeletaModalidade);
        pStatement.setInt(1, codAluno);
        pStatement.execute();

        
        // Executa a instrução para Inserir novas modalidades ao aluno
        String sqlModalidade = "INSERT INTO aluno_has_modalidade (aluno_codigo, modalidade_codigo) VALUES (?, ?)";
        pStatement = connection.prepareStatement(sqlModalidade);

        // Insere as modalidades adicionais
        for (int modalidadeId : modalidadeIds) {
            pStatement.setInt(1, codAluno);
            pStatement.setInt(2, modalidadeId);
            pStatement.executeUpdate();
        }

    } catch (SQLException e) {
        if (connection != null) {
            try {
                connection.rollback(); // Desfaz a transação em caso de erro
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        }
        throw new SQLException("Erro ao inscrever aluno nas modalidades: " + e.getMessage());
    } finally {
        if (pStatement != null) {
            pStatement.close();
        }
        if (connection != null) {
            connection.setAutoCommit(true); // Ativa o commit automático novamente
            connection.close();
        }
    }
}
    //Insere novos dados do aluno já registrado no banco
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
        
    //Exclui o aluno do banco
    public void excluirAluno(String cpf, int aluno_codigo)throws ExceptionMVC
    {
        String sql= "DELETE FROM aluno WHERE cpf = '" + cpf + "'";
        String sqlModalidade = "DELETE FROM aluno_has_modalidade WHERE aluno_codigo = " +aluno_codigo+"";
        PreparedStatement pStatement = null;
        Connection connection = null;

        try{
            connection = new ConnectionMVC().getConnection();
             pStatement = connection.prepareStatement(sqlModalidade);
            pStatement.executeUpdate();
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
   
    //Insere as modalidades do plano do aluno na tabela muitos para muitos do banco
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
     
     //Retorna as modalidades que o aluno está inscrito
      public ArrayList<Integer> retornaModalidadesAluno (int aluno_codigo) throws ExceptionMVC {
    ArrayList<Integer>modalidadeIds = new ArrayList<>();
    
    String sql = "select modalidade_codigo from aluno_has_modalidade where aluno_codigo = ? ";
    
    Connection connection = null;
    PreparedStatement pStatement = null;
    
    
    try{connection = new ConnectionMVC().getConnection();
        pStatement = connection.prepareStatement(sql);
        pStatement.setInt(1, aluno_codigo);
        ResultSet rs = pStatement.executeQuery();
        
        while(rs.next()){
            int modalidadeAluno = rs.getInt("modalidade_codigo");
            modalidadeIds.add(modalidadeAluno);
        }
    } catch(SQLException e){ 
        throw new ExceptionMVC("Erro ao buscar modalidade do aluno: " + e);
    }
    return modalidadeIds;
}
      
     //Busca o codigo do aluno no banco de dados via CPF
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
        
    return codAluno;
    }

   
   
}
