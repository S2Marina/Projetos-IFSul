package caixa.v2;
public class Conta {
    private String agencia, nome;
    private Double saldo, saque, deposito;
    private int num;
    private Boolean ativa = true;

    //gets e sets:
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaque() {
        return saque;
    }

    public void setSaque(Double saque) {
        this.saque = saque;
    }

    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
    
    // meus métodos:
    
    public void abrirConta (String nome, Integer num, Integer agencia){
        ativa = true;
        saldo = 0.0 ;
    }
    
    public Boolean Sacar (Double saque){
        if (ativa == true && saldo >= saque){
            saldo = saldo - saque;
            return true;
        }
         else{
            return false;
        }
    }
    
    public Boolean Depositar (Double deposito){
          if (ativa == true){
            saldo += deposito;
            return true;
        }
         else{
            return false;
        }
        }
    
    public Double retornarSaldo (){
        return saldo;
    }
    
    public void fecharConta (){
        ativa = false;
    }
}
