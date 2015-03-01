package exemploString;

import javax.swing.JOptionPane;

public class NewMain {
            public static void main(String[] args) {
             String escalacao  = " Júlio César, D. Alves, D. Luiz, T. Silva, Maxwell, L. Gustavo, Paulinho, Oscar, Neymar, Fred, Hulk ";
              String ronaldinho;
              int x;
              boolean r;

              escalacao = escalacao.replace("Fred", "Jô");//troca fred por jo
              r = escalacao.contains("Ronaldinho"); //vê se o ronaldinho tá jogando
              if (r ==true){
                  ronaldinho = " Ronaldinho está no time!!!";
              }
              else{
                  ronaldinho = " Ronaldinho não está no time!!!";
              }
               x = escalacao.length(); //tamanho da string
              escalacao = escalacao.trim();//tira espaços
              String[] esc = escalacao.split(",");

              JOptionPane.showMessageDialog(null, " A escalação possui " + x + " letras.\n" + ronaldinho + "\n" + escalacao);           
              JOptionPane.showMessageDialog(null, esc);
    }
}
