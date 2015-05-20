package televisao;
public class Apresentador {
    private String nome;
    private String nasc;
    private String prog;
    private String email;
    private String nome_art;
    private String cidade;
    private String endereco;
    private String bairro;
    private String estado;
    private Double salario;
    private Double cache;
    private Double merch;
    private Double ganhos;
    private Double eventos;

    public Apresentador(){
        nome = null;
        nasc = null;
        prog = null;
        email = null;
        nome_art = null;
        cidade = null;
        endereco = null;
        bairro = null;
        estado = null;
        salario = 0.0;
        cache = 0.0;
        merch = 0.0;
    }
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

    public String getProg() {
        return prog;
    }

    public void setProg(String prog) {
        this.prog = prog;
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

    public Double getMerch() {
        return merch;
    }

    public void setMerch(Double merch) {
        this.merch = merch;
    }

    public Double getEventos() {
        return eventos;
    }

    public void setEventos(Double eventos) {
        this.eventos = eventos;
    }
    
    public Double calcularGanhos(Double eventos){
        ganhos = (eventos * cache) + salario + merch;
        return ganhos;
    }
    
}
