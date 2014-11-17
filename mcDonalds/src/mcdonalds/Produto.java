package mcdonalds;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome, cod;
    private double preco;
    private List<Hamburguer> hamburguer;
    private List<BatataFrita> batata;
    private List<Bebida> bebida;
    private List<McOferta> oferta;
    
    public Produto(){
        hamburguer = new ArrayList <Hamburguer>();
        batata = new ArrayList <BatataFrita>();
        bebida = new ArrayList <Bebida>();
        oferta = new ArrayList <McOferta>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String descricaoCardapio(){
        String descricao;
        descricao  = this.cod + " " + this.nome + " - R$ " + this.preco;
        return descricao;
    }
}
