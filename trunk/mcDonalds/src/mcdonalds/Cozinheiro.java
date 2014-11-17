package mcdonalds;

public class Cozinheiro extends Caixa{
        
    public Double retSalario(String turno){
        Double salario = 1300.0;
        if (turno.equalsIgnoreCase("noite")){
            salario += 400.0;
        }
        return salario;
    }
}
 