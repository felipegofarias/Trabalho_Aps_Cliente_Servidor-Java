/**
 * @author Felipe  
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    
     private static final String URL = "jdbc:sqlite:C:/Users/windows/OneDrive/Área de Trabalho/BancoAmbiental/db/BancoAmbiental.db";
    
    public static Connection getConection(){
        try{
            return DriverManager.getConnection(URL);
        }catch (SQLException e){
            throw new RuntimeException ("Erro na conexão");
        }
    }
    
    public static void closeConnection (Connection con){
        try{
            if (con !=null) con.close();
        }catch (SQLException e){
            throw new RuntimeException ("Erro no fechamento da conexão");
        }
    }

    public static void closeConnection(Connection con, PreparedStatement pst){
        try{
            if (pst != null) pst.close();
            closeConnection(con);
        }catch (SQLException e){
            throw new RuntimeException ("Erro no fechamento da conexão");
        }
    }

    public static void closeConnection(Connection con, PreparedStatement pst, ResultSet rs){
        try{
            if (rs != null) rs.close();
            closeConnection(con);
        }catch (SQLException e){
            throw new RuntimeException ("Erro no fechamento da conexão");
        }
    }

}
