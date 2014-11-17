package mcdonalds;
public class Bebida extends Produto{
    private String quantidade, unidadeMedia;

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidadeMedia() {
        return unidadeMedia;
    }

    public void setUnidadeMedia(String unidadeMedia) {
        this.unidadeMedia = unidadeMedia;
    }
    
    public String descricaoCardapio(){
        String descricao;
        descricao  = super.descricaoCardapio() + " " + this.quantidade + " " + this.unidadeMedia;
        return descricao;
    }
    
}
