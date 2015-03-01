package exemploheranca;
public class Arquivo {
    private String nome, tipo, tamanho;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String retornarInformacao(){
        String retorno;
        retorno = this.nome + ", " + this.tipo + ", " + this.tamanho;
        return retorno;
    }
}
