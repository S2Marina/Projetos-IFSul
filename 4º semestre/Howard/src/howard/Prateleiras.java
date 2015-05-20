package howard;

import java.util.ArrayList;
import java.util.List;

public class Prateleiras extends Roupas{
     private String prateleira;
     List<Roupas> lista = new ArrayList<Roupas> ();

    public List<Roupas> getLista() {
        return lista;
    }

    public void setLista(List<Roupas> lista) {
        this.lista = lista;
    }

    public String getPrateleira() {
        return prateleira;
    } 
     public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }
      
     public String retornoPrateleira(){
         String retorno = " ";
         for (Roupas roupas : lista) {
            retorno += "\n" + roupas.retornoRoupa();
        }

         return retorno;
     }
     
      // essa clase só é utilizada pela Tela
      public String qualPrateleira(Roupas roupa){
        if(roupa.getTipo().equalsIgnoreCase("Roupa de Astronauta")){
            this.prateleira = "A";
         }
        else if(roupa.getTipo().equalsIgnoreCase("Camisa") || roupa.getTipo().equalsIgnoreCase("Camiseta")|| roupa.getTipo().equalsIgnoreCase("Calça")){
            this.prateleira = "B";
        }
        else if(roupa.getTipo().equalsIgnoreCase("Fantasia")){
            this.prateleira = "C";
         }
        else if(roupa.getTipo().equalsIgnoreCase("Cueca") || roupa.getTipo().equalsIgnoreCase("Meia")){
            this.prateleira = "D";
        }
        else{
            this.prateleira = "E";
         }
        return prateleira;
    }
    
}
