package howard;
public class Roupas {
    private String tipo, descricao, cor, personagem, codNasa, dia;
    private boolean preferida, fantasia;

    public String getCodNasa() {
        return codNasa;
    }

    public void setCodNasa(String codNasa) {
        this.codNasa = codNasa;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPreferida() {
        return preferida;
    }

    public void setPreferida(boolean preferida) {
        this.preferida = preferida;
    }

    public boolean isFantasia() {
        return fantasia;
    }

    public void setFantasia(boolean fantasia) {
        this.fantasia = fantasia;
    }
    
    public String roupaPreferida(){
        String retorno = " ";
        if (preferida == true){
            retorno = " - TÁ UM ARRASO!";
        }
        else{
            retorno = " ";
        }
        return retorno;
      }
    public String personagemFantasia(){
        String retorno = " ";
        if (fantasia ==  true){
            retorno = " / " + this.personagem;
        }
        else{
           retorno = " ";
        }
        
        return retorno;
   }
   
  public String roupaAstronauta(){
        String retorno = " ";
        if(descricao.equalsIgnoreCase("Roupa de Astronauta")){
            retorno = " | " + this.codNasa + " / " + this.dia;
        }
        return retorno;
  }
  
  public String retornoRoupa(){
      String retorno = " ";
      retorno = this.descricao + " - " + this.tipo + " - " + this.cor + " - " + roupaPreferida() + personagemFantasia() + roupaAstronauta();
      return retorno;
  }
}
