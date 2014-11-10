package mcdonalds;

public class Gerente {
    private String nome_g, nasc_g, cpf_g;

    public String getNome_g() {
        return nome_g;
    }

    public void setNome_g(String nome_g) {
        this.nome_g = nome_g;
    }

    public String getNasc_g() {
        return nasc_g;
    }

    public void setNasc_g(String nasc_g) {
        this.nasc_g = nasc_g;
    }

    public String getCpf_g() {
        return cpf_g;
    }

    public void setCpf_g(String cpf_g) {
        this.cpf_g = cpf_g;
    }
    
    public Double retSalario(){
        Double salario = 3500.0;
        return salario;
    }
}
