package televisao;
public class Emissora {
    private String nome;
    private String endereco;
    private boolean aberta;
    
    public Emissora(){
    nome = null;
    endereco = null;
    aberta = false;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
}
