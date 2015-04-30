package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pergunta;

public class PerguntaDAO {
    public boolean inserir(Pergunta pergunta){
        Boolean retorno;
        String sql = "INSERT INTO pergunta(enunciado, a, b, c, d, certa, nivel) VALUES(?,?,?,?,?,?,?)"; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            pst.setString(1, pergunta.getEnunciado());
            pst.setString(2, pergunta.getA());
            pst.setString(3, pergunta.getB());
            pst.setString(4, pergunta.getC());
            pst.setString(5, pergunta.getD());
            pst.setString(6, pergunta.getCerta());
            pst.setInt(7, pergunta.getNivel());
            
            pst.executeUpdate();//executa o sql no banco
            retorno = true;         

        } catch (SQLException ex) {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
    
    public List<Pergunta> listar(){
        List<Pergunta> lista = new ArrayList<Pergunta>(); 
        String sql = "SELECT * FROM pergunta";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            ResultSet res = pst.executeQuery();
            while(res.next()){ 
                Pergunta p = new Pergunta();
                p.setId(res.getInt("id"));
                p.setEnunciado(res.getString("enunciado"));
                p.setA(res.getString("a"));
                p.setB(res.getString("b"));
                p.setC(res.getString("c"));
                p.setD(res.getString("d"));
                p.setCerta(res.getString("certa"));                
                p.setNivel(res.getInt("nivel"));
                lista.add(p);
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return lista;
    }
    
    public boolean excluir(Pergunta pergunta){
        Boolean retorno;
        String sql = "DELETE FROM pergunta WHERE id = ?"; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            pst.setInt(1, pergunta.getId());
            pst.executeUpdate();
            retorno = true;         

        } catch (SQLException ex) {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
    
    public boolean atualizar(Pergunta pergunta){
       Boolean retorno;
       String sql = "UPDATE pergunta SET enunciado = ?, a = ?, b = ?, c = ?, d = ?, certa = ?, nivel = ? WHERE id = ?";
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       try {
           pst.setString(1, pergunta.getEnunciado());
           pst.setString(2, pergunta.getA());
           pst.setString(3, pergunta.getB());
           pst.setString(4, pergunta.getC());
           pst.setString(5, pergunta.getD());
           pst.setString(6, pergunta.getCerta());
           pst.setInt(7, pergunta.getNivel());
           pst.setInt(8, pergunta.getId());
           
           pst.executeUpdate();
           retorno = true;
           
       } catch (SQLException ex) {
           ex.printStackTrace();
           retorno = false;
       }
              
       return retorno;      
   }
}
