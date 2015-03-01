package televisao;
public class Ator {
    private String nome;
    private String nasc;
    private String email;
    private String nome_art;
    private String cidade;
    private String endereco;
    private String bairro;
    private String estado;
    private Double novelas;
    private Double salario;
    private Double cache;
    private Double eventos;
    private String status;
    private Double ganhos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_art() {
        return nome_art;
    }

    public void setNome_art(String nome_art) {
        this.nome_art = nome_art;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getNovelas() {
        return novelas;
    }

    public void setNovelas(Double novelas) {
        this.novelas = novelas;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getCache() {
        return cache;
    }

    public void setCache(Double cache) {
        this.cache = cache;
    }

    public Double getEventos() {
        return eventos;
    }

    public void setEventos(Double eventos) {
        this.eventos = 1.0;
    }
            
    public String returnStatus(){
        if (novelas >=3 && salario < 5000){
            status = "Calouro";
        }
        else if(novelas <=6){
            status= "Revelação";
        }
        else if(novelas > 6 && salario > 30000){
            status = "Jóia";
        }
        else if(novelas > 9 && salario < 30000){
            status = "Elenco de apoio";
        }
        else if(salario < 100000){
            status = "Elenco principal";
        }
        else if(salario > 100000){
            status = "Estrela";
        }
        else{
            status = "Elenco regular";
        }
        return status;
}
    public Double calcularGanhos(){
        ganhos = (eventos * cache) + salario;
        return ganhos;
    }
    
    }
    

