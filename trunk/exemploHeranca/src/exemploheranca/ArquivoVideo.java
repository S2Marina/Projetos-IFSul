package exemploheranca;
public class ArquivoVideo extends Arquivo{
    private String duracao, autor;

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String retornarInformacao(){
        String retorno;
        retorno = super.retornarInformacao() + " - " + this.duracao + "//" + this.autor;
        return retorno;
    }
}

//super pega informações da Classe anterior(arquivo)