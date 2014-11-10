package mcdonalds;

public class Caixa {
     private String nome_cai, nasc_cai, cpf_cai, hora_cai;

    public String getNome_cai() {
        return nome_cai;
    }

    public void setNome_cai(String nome_cai) {
        this.nome_cai = nome_cai;
    }

    public String getNasc_cai() {
        return nasc_cai;
    }

    public void setNasc_cai(String nasc_cai) {
        this.nasc_cai = nasc_cai;
    }

    public String getCpf_cai() {
        return cpf_cai;
    }

    public void setCpf_cai(String cpf_cai) {
        this.cpf_cai = cpf_cai;
    }

    public String getHora_cai() {
        return hora_cai;
    }

    public void setHora_cai(String hora_cai) {
        this.hora_cai = hora_cai;
    }
     
    public Double retSalario(){
        Double salario = 1200.0;
        return salario;
    }
}
