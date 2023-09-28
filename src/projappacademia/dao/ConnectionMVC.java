
package projappacademia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMVC {
    
    public Connection getConnection(){
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            //Conexão com o banco de dados utilizado para testes
            //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/appacademia1teste", "root", "");
            
            //Conexão com o banco de dados
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/appacademia1", "root", "");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    
}


