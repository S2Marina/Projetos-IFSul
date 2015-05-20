package mcdonalds;
public class McOferta extends Produto{
        Hamburguer h;
        BatataFrita bt;
        Bebida b;
        
        public String valorEconomia(){
            String retorno;
            double valor, oferta;
            valor = h.getPreco() + bt.getPreco() + b.getPreco();
            oferta = valor - this.getPreco();
            retorno = "Comprando esta oferta você economiza R$ " + oferta;
            return retorno;
        }
                
        public String descricaoOferta(){
        String retorno;
        retorno = h.descricaoCardapio() + " \n" + bt.descricaoCardapio() + "\n" + b.descricaoCardapio(); 
        return retorno;
    }
}
