/**
 * @author Felipe  
 */
package model;

import DAO.bancoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class banco {

    private int codigo = 0;
    private String link = null;
    private String data = null;
    private String descricao = null;

    public banco(String link, String data, String descricao, int codigo) {
        this.codigo = codigo;
        this.link = link;
        this.data = data;
        this.descricao = descricao;
    }
    
        public banco(String link, String data, String descricao) {
        this.link = link;
        this.data = data;
        this.descricao = descricao;
        
        gravar();
    }

    public banco() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        String ret = "";        
        ret = ret + "[Link: " + getLink() + " ]\n" +  
                    "[Data: " + getDescricao() + " ]\n" + 
                    "[Descrição:   " + getData()+ " ]";
        return ret;
        
        
    }
    
        //METODO PARA GRAVAR DB
    private void gravar(){
        bancoDAO dao = new bancoDAO();
        int codigo = dao.create(this);
        if (codigo > 0) setCodigo (codigo);
    }
    
    public static DefaultTableModel getTableModel(){
        List<banco> lista = bancoDAO.getInstance().read();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Link");
        modelo.addColumn("Data");
        modelo.addColumn("Descrição");
        for(banco b: lista){
            String[] reg = {b.getLink(), b.getData(), b.getDescricao()};
            modelo.addRow(reg);
        }
        return modelo;
    }
}
