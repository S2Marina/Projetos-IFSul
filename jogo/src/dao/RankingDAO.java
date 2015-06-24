package dao;

import dao.Conexao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jogador;
import modelo.Ranking;

public class RankingDAO {

    public Boolean inserir(Ranking r) {
        Boolean retorno;
        String sql = "INSERT INTO ranking(login, pontos, data) VALUES (?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setString(1, r.getJogador().getLogin());
            pst.setInt(2, r.getPontos());
            pst.setDate(3, new Date(r.getData().getTime()));
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;

    }

    public List<Ranking> listar() {
        List<Ranking> lista = new ArrayList<Ranking>();
        String sql = "SELECT * FROM ranking ORDER BY pontos DESC";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                Ranking r = new Ranking();
                r.getJogador().setLogin(res.getString("login"));
                r.setPontos(res.getInt("pontos"));
                r.setData(res.getDate("data"));
                /*Jogador j = new Jogador();
                 j.setLogin(res.getString("login"));
                 r.setJogador(j);*/
                lista.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RankingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
