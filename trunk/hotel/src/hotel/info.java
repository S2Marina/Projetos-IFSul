package hotel;
public class info {
    String nome, localizacao;
    Double valor;
    int telefone, fundacao;
    
    void atribuirInfo (String xnome, String local, Double xvalor, int tel, int fund){
        nome = xnome;
        localizacao = local;
        valor = xvalor;
        telefone = tel;
        fundacao = fund;    
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public Double getValor() {
        return valor;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getFundacao() {
        return fundacao;
    }
    
     
}

    
