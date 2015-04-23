package dao;

import Modelo.Cidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CidadeDAO {
  public boolean inserir(Cidade c){
      Boolean retorno;
      String sql = "INSERT INTO cidade(NOME)VALUES(?)";
      PreparedStatement pst = Conexao.getPreparedStatement(sql);
      
      try {
          pst.setString(1, c.getNome());
          pst.executeUpdate();
          retorno = true;
          
      } catch (SQLException ex) {
          ex.printStackTrace();
          retorno = false;
      }
      return retorno;
  }   
  
  public List<Cidade> listar(){
      List<Cidade> lista = new ArrayList<Cidade>(); 
      String sql = "SELECT * FROM cidade";
      PreparedStatement pst = Conexao.getPreparedStatement(sql);

      try {
          ResultSet res = pst.executeQuery();
          while(res.next()){
            Cidade c = new Cidade();
            c.setCod(res.getInt("cod"));
            c.setNome(res.getString("nome"));

            lista.add(c);
      }
          } catch (SQLException ex) {
          Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      
      return lista;
}
  
  public boolean excluir(Cidade c){
      Boolean retorno;
      String sql = "DELETE FROM cidade WHERE cod = ?";
      PreparedStatement pst = Conexao.getPreparedStatement(sql);
      try {
          pst.setInt(1, c.getCod());
          pst.executeUpdate();
          retorno = true;   
          
      } catch (SQLException ex) {
          ex.printStackTrace();
          retorno = false;
      }
      return retorno;
  }
}

