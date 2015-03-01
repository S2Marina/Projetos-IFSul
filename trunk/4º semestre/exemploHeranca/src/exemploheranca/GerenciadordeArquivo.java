package exemploheranca;
public class GerenciadordeArquivo {
    private String sistemaOperacional;

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    
    public String visualizarArquivo(Arquivo exibir){
        String retorno;
        retorno = this.sistemaOperacional + "Arquivo: " + exibir.retornarInformacao();
        return retorno;
    }
}
