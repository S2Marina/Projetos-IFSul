package howard;
public class Astronauta extends Roupas{
    private String codNasa, dia;
    
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

    public String roupaAstronauta(){
        String retorno = " ";
        if(getDescricao().equalsIgnoreCase("Roupa de Astronauta")){
            retorno = " | " + this.codNasa + " / " + this.dia;
        }
        return retorno;
    }
    
    public String retornoRoupa(){
            String retorno = " ";
            retorno = super.retornoRoupa() + roupaAstronauta();
            return retorno;
        }
}
