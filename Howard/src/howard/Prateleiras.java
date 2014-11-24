package howard;

public class Prateleiras extends Roupas{
     private String prateleira;
     
    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }
     
    public String qualPrateleira(Roupas roupa){
        if(roupa.getTipo().equalsIgnoreCase("Roupa de Astronauta")){
            this.prateleira = "A";
         }
        else if(roupa.getTipo().equalsIgnoreCase("Camisa") || roupa.getTipo().equalsIgnoreCase("Camiseta")){
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
    
     @Override
     public String retornoRoupa(){
         String retorno = " ";
         retorno = this.prateleira + "\n" + super.retornoRoupa();
         return retorno;
     }
}
