import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Jogador;

public class Teste {
   public static void main(String[] args) throws SQLException {
        inserir();
        List<Jogador> lista = listar();
        for (Jogador jogador : lista) {
            System.out.println(jogador.getLogin() + "\n");
       }
   }
   
   public static List<Jogador> listar(){
       
       List<Jogador> jogadores = new ArrayList<Jogador>();
       try{
            
         String sql = "SELECT * FROM jogador";
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         ResultSet res = pst.executeQuery(); // faz uma ação no banco e retorna alguma coisa
         while(res.next())//enquanto tiver alguma coisa na tabela
         {
             //pega a estrutura do ResultSet e relaciona a jogador
             Jogador j = new Jogador();
             j.setLogin(res.getString("login"/*nome da coluna*/));
             j.setSenha(res.getString("senha"));
             j.setEmail(res.getString("email"));   
             jogadores.add(j);//adiciona na lista
         }
       
        }catch (SQLException ex){
          Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }   
         return jogadores;
   }   
   
   public static void inserir() throws SQLException{
       String sql, login, senha, email;
       login = JOptionPane.showInputDialog("Informe o login:");
       senha = JOptionPane.showInputDialog("Informe a senha:");
       email = JOptionPane.showInputDialog("Informe o email:");
       
       sql = "INSERT INTO jogador(login, senha, email) VALUES(?, ?, ?)";
       
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       
       pst.setString(1, login);
       pst.setString(2, senha);
       pst.setString(3, email);
       
       pst.executeUpdate();//manda pro banco(faz uma ação no banco mas não retorna nada)
   }
    
}

