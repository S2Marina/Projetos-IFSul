package caixa.v2;
public class Banco {
    private String nome, num;
    private Boolean imovel, carro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Boolean isImovel() {
        return imovel;
    }

    public void setImovel(Boolean imovel) {
        this.imovel = imovel;
    }

    public Boolean isCarro() {
        return carro;
    }

    public void setCarro(Boolean carro) {
        this.carro = carro;
    }
}
