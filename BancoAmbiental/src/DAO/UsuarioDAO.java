/**
 * @author Felipe  
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import model.banco;

public class UsuarioDAO  implements DAO.persistencia<Usuario> {
    
     private static UsuarioDAO dao = null;
    
    public UsuarioDAO(){
        
    }
    
    public static UsuarioDAO getInstance(){
        if (dao == null) dao = new UsuarioDAO();
        return dao;
    }
    //INSERT NO BANCO
    @Override
    public int create (Usuario u){
        int id = 0;
        Connection con = ConnectionFactory.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sq1 = "INSERT INTO usuario (Login, Senha) VALUES (?,?)";
        try{
            pst = con.prepareStatement(sq1, PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, u.getLogin());
            pst.setString(2, u.getSenha());
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
        
    //SELECT NO BANCO
    @Override
    public Usuario findByCodigo(int id) {
        Connection con = ConnectionFactory.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        Usuario u = null;
        String sql = "SELECT * FROM usuario where Codigo = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()){
                String login = rs.getString("Login");
                String senha=  rs.getString("Senha");
                
                u = new Usuario(login, senha);
            }
            
        }catch (SQLException ex){
            throw new RuntimeException ("Erro Select");
            
        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        
        return u;
    }
    //DELETE NO BANCO
    @Override
    public void delete(int id) {
        Connection con = ConnectionFactory.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "DELETE from usuario where Codigo = ?";
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

    @Override
    public List<Usuario> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
