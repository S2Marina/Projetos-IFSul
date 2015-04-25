package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Voo;

public class VooDAO {
      public boolean inserir(Voo v){
       Boolean retorno;
       String sql = "INSERT INTO voo(numero,origem,destino,paradas)VALUES(?,?,?,?)";
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       try {
           pst.setInt(1, v.getNumero());
           pst.setString(2, v.getOrigem());
           pst.setString(3, v.getDestino());
           pst.setInt(4, v.getParadas());
           
           pst.executeUpdate();
           retorno = true;
           
       } catch (SQLException ex) {
           ex.printStackTrace();
           retorno = false;
       }
              
       return retorno;      
   }
      
      public List<Voo> listar(){
      List<Voo> lista = new ArrayList<Voo>();
      String sql ="SELECT * FROM voo";
      PreparedStatement pst = Conexao.getPreparedStatement(sql);
      
      
       try {
           ResultSet res = pst.executeQuery();
           while(res.next()){
           Voo v = new Voo();
           v.setNumero(res.getInt("numero"));
           v.setOrigem(res.getString("origem"));
           v.setDestino(res.getString("destino"));
           v.setParadas(res.getInt("paradas"));
            
           lista.add(v);
       }
       } catch (SQLException ex) {
           Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
      
      return lista;
   }
     
    public boolean excluir(Voo v){
       Boolean retorno;
       String sql = "DELETE FROM voo WHERE numero = ?";
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       try {
           pst.setInt(1, v.getNumero());
           pst.executeUpdate();
           retorno = true;
       } catch (SQLException ex) {
           ex.printStackTrace();
           retorno = false;
       }

       return retorno;
   }
}
