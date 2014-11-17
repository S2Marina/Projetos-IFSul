package mcdonalds;

public class Caixa extends Gerente{
     private String hora;


    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
     
    public Double retSalario(){
        Double salario = 1200.0;
        return salario;
    }
}
