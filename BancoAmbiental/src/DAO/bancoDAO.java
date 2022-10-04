/**
 * @author Felipe  
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.banco;

public class bancoDAO implements DAO.persistencia<banco>  {
    
     private static bancoDAO dao = null;

    
    public bancoDAO(){
        
    }
    
    public static bancoDAO getInstance(){
        if (dao == null) dao = new bancoDAO();
        return dao;
    }
    //INSERT NO BANCO
    @Override
    public int create (banco b){
        int id = 0;
        Connection con = ConnectionFactory.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sq1 = "INSERT INTO Banco (Link, Data, Descricao) VALUES (?,?,?)";
        try{
            pst = con.prepareStatement(sq1, PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, b.getLink());
            pst.setString(2, b.getData());
            pst.setString(3, b.getDescricao());
            pst.execute();
            rs = pst.getGeneratedKeys();
            
            if (rs.next()){
                id = rs.getInt(1);
            }
        }catch (SQLException ex){
            id = 0;
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        
        return id;
    }
    
        public List<banco> read() {
        Connection con = ConnectionFactory.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String slq = "SELECT * FROM Banco";
        List lista = new ArrayList<banco>();
        try {
            pst = con.prepareStatement(slq);
            rs = pst.executeQuery();
            while (rs.next()) {
                String link = rs.getString("Link");
                String data = rs.getString("Data");
                String descricao = rs.getString("Descricao");
                lista.add(new banco(link, data, descricao));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro no SELECT");
        } finally {
            ConnectionFactory.closeConnection(con, pst, rs);
        }
       return lista; 
    }
        
    //SELECT NO BANCO
    @Override
    public banco findByCodigo(int id) {
        Connection con = ConnectionFactory.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        banco b = null;
        String sql = "SELECT * FROM Banco where Codigo = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()){
                String link = rs.getString("Link");
                String data=  rs.getString("Data");
                String descricao = rs.getString("Descricao");
                
                b = new banco(link, data, descricao);
            }
            
        }catch (SQLException ex){
            throw new RuntimeException ("Erro Select");
            
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        
        return b;
    }
    //DELETE NO BANCO
    @Override
    public void delete(int id) {
        Connection con = ConnectionFactory.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "DELETE from Banco where Codigo = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
        }catch(SQLException ex){
            throw new RuntimeException("Erro Delete");   
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
    }
    //UPDATE NO BANCO
    @Override
    public void update(banco b) {
        Connection con = ConnectionFactory.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "UPDATE Banco set Link=?, Data=?, Descricao=? where Codigo=?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, b.getLink());
            pst.setString(2, b.getData());
            pst.setString(3, b.getDescricao());
            pst.setInt(4,b.getCodigo());
            pst.execute();
        }catch(SQLException ex){
            throw new RuntimeException("Erro no update");
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
    }
    
    
 public boolean checkLogin(String login, String senha) {

        Connection con = ConnectionFactory.getConection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(bancoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
}


