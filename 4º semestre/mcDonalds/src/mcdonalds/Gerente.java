package mcdonalds;

public class Gerente {
    private String nome, nasc, cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome  = nome ;
    }

    public String getNasc () {
        return nasc ;
    }

    public void setNasc (String nasc ) {
        this.nasc  = nasc ;
    }

    public String getCpf () {
        return cpf ;
    }

    public void setCpf (String cpf ) {
        this.cpf  = cpf ;
    }
    
    public Double retSalario(){
        Double salario = 3500.0;
        return salario;
    }
}
