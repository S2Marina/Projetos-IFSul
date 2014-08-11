package obj;
import java.util.Scanner;
public class Calc {
    Scanner e = new Scanner(System.in);
    double a, b; // atributos
    
    void atribuirA(Double valor){ // método
        System.out.println(" Informe um número:");
        valor = e.nextDouble();
        a = valor;
    }
    
    void atribuirB(Double valor){ 
        System.out.println(" Informe um número:");
        valor = e.nextDouble();
        b = valor;
    }
    
    Double soma (){
        return a + b;
    }
    
    Double sub (){
        return a - b;
    }
    
    Double mult (){
        return a * b;
    }
    
    Double div (){
        return a / b;
    }
}
