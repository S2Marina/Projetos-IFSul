package howard;
public class Roupas {
    private String tipo, descricao, cor;
    private boolean preferida;

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

  public String retornoRoupa(){
      String retorno = " ";
      retorno = this.descricao + " - " + this.tipo + " - " + this.cor + " - " + roupaPreferida();
      return retorno;
  }
}
