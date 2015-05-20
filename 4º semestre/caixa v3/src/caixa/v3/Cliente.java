package caixa.v3;
public class Cliente {
    private String nome, end, nasc, cpf;
    private boolean spc = false, serasa = false;

    //get e set:
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isSpc() {
        return spc;
    }

    public void setSpc(boolean spc) {
        this.spc = spc;
    }

    public boolean isSerasa() {
        return serasa;
    }

    public void setSerasa(boolean serasa) {
        this.serasa = serasa;
    }
    
    //meus métodos:
    
    public boolean verificaPendencias(){
        boolean retorno = false;
        if (spc == true){
            retorno = true;
        }
        else if (serasa = true){
            retorno = true;
        }
        else{
            retorno = false;
        }
        return retorno;
    }
}