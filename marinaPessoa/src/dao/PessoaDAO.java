package dao;
import Modelo.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaDAO {
 
   public boolean inserir(Pessoa p){
       Boolean retorno;
       String sql = "INSERT INTO pessoa(NOME,SEXO)VALUES(?,?)";
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       try {
          // pst.setInt(1, p.getCod());
           pst.setString(1, p.getNome());
           pst.setString(2, p.getSexo());
           
           pst.executeUpdate();
           retorno = true;
           
       } catch (SQLException ex) {
           ex.printStackTrace();
           retorno = false;
       }
              
       return retorno;      
   }
   
   public List<Pessoa> listar(){
      List<Pessoa> lista = new ArrayList<Pessoa>();
      String sql ="SELECT * FROM pessoa";
      PreparedStatement pst = Conexao.getPreparedStatement(sql);
      
      
       try {
           ResultSet res = pst.executeQuery();
           while(res.next()){
           Pessoa p = new Pessoa();
           p.setCod(res.getInt("cod"));
           p.setNome(res.getString("nome"));
           p.setSexo(res.getString("sexo"));

           lista.add(p);
       }
       } catch (SQLException ex) {
           Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
      
      return lista;
   }
   
   public boolean excluir(Pessoa p){
       Boolean retorno;
       String sql = "DELETE FROM pessoa WHERE cod = ?";
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       try {
           pst.setInt(1, p.getCod());
           pst.executeUpdate();
           retorno = true;
       } catch (SQLException ex) {
           ex.printStackTrace();
           retorno = false;
       }

       return retorno;
   }
}
