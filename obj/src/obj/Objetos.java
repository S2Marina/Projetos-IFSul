package obj;

import java.util.Scanner;

public class Objetos {
    public static void main(String[] args) {
        Calc x = new Calc(); //criar objeto da classe calc
        Scanner e = new Scanner(System.in);
        double res = 0, valor = 0;
        int op;
        
        x.atribuirA(valor);// atribuir valores
        x.atribuirB(valor); 
        
        System.out.println(" Informe uma operação::\n  (1) Soma\n  (2) Subtração\n  (3) Multiplicação\n  (4) Divisão");
        op = e.nextInt();
        
        switch(op){
            case 1:{
              res = x.soma();// chamar o metodo soma
              break;
            }
            case 2:{
              res = x.sub();// chamar o metodo sub
              break;
            }
            case 3:{
              res = x.mult();// chamar o metodo mult
              break;
            }
            case 4:{
              res = x.div();// chamar o metodo div
              break;
            }
            default:{
              System.out.println(" Opção inválida!!!");
              break;
              }
        }
        
        System.out.println("O resultado é: " + res);
    }
    
}
