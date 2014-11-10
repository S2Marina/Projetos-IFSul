package mcdonalds;

public class Cozinheiro {
    
    private String nome_coz, nasc_coz, cpf_coz, hora_coz;

    public String getNome_coz() {
        return nome_coz;
    }

    public void setNome_coz(String nome_coz) {
        this.nome_coz = nome_coz;
    }

    public String getNasc_coz() {
        return nasc_coz;
    }

    public void setNasc_coz(String nasc_coz) {
        this.nasc_coz = nasc_coz;
    }

    public String getCpf_coz() {
        return cpf_coz;
    }

    public void setCpf_coz(String cpf_coz) {
        this.cpf_coz = cpf_coz;
    }

    public String getHora_coz() {
        return hora_coz;
    }

    public void setHora_coz(String hora_coz) {
        this.hora_coz = hora_coz;
    } 
    
    public Double retSalario(String turno){
        Double salario = 1300.0;
        if (turno.equalsIgnoreCase("noite")){
            salario += 400.0;
        }
        return salario;
    }
}
 