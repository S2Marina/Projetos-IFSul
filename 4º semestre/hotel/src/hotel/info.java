package hotel;
public class Info {
    private String nome, localizacao;
    private Double valor;
    private int telefone, fundacao;
    
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
    
    public Double calcHospedagem (int dias, double tarifa){
        Double valor;
        if (dias <= 6){
            valor = dias * tarifa;
        }
        else if (dias <= 10){
            valor = 0.9 * (dias * tarifa);
        }
        else{
            valor = 0.7 * (dias * tarifa);
        }
        return valor;
    }
    
    public Double calcEuro (Double valor){
        valor = valor * 3;
        return valor;
    }
    
    public Double calcDolar (Double valor){
        valor = valor * 2;
        return valor;
    }
     
}

    
