package mcdonalds;

import java.util.ArrayList;
import java.util.List;

public class Filial {
       private String cidade;
       private Double preco_m, quantidade;
       private Gerente gerente;
       private List <Cozinheiro> cozinheiro;
       private List <Caixa> caixa;

    public Filial(){
        this.gerente = new Gerente();
        this.cozinheiro = new ArrayList<Cozinheiro>();
        this.caixa = new ArrayList<Caixa>();
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getPreco_m() {
        return preco_m;
    }

    public void setPreco_m(Double preco_m) {
        this.preco_m = preco_m;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public List<Cozinheiro> getCozinheiro() {
        return cozinheiro;
    }

    public void setCozinheiro(List<Cozinheiro> cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Caixa> getCaixa() {
        return caixa;
    }

    public void setCaixa(List<Caixa> caixa) {
        this.caixa = caixa;
    }
       
    public Double retFaturamento(){
        Double faturamento;
        faturamento = quantidade * preco_m;
        return faturamento;
    }
}
