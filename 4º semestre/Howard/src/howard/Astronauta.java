package howard;
public class Astronauta extends Prateleiras{
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
   
    public String retornoRoupa(){
            String retorno = " ";
            retorno = super.retornoRoupa() + " | " + this.codNasa;
            return retorno;
        }
}
