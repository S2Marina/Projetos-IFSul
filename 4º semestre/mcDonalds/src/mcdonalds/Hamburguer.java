package mcdonalds;
public class Hamburguer extends Produto {
    private boolean novo;
        
    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }
   
    public String descricaoCardapio(){
        String descricao;
        descricao  = super.descricaoCardapio() + " " + this.novo;
        return descricao;
    }
    
}
