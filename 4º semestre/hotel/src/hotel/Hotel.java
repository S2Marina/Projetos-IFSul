package hotel;

import javax.swing.JOptionPane;

public class Hotel {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        String nome, localizacao;
        Double diaria = 0.0 , valor;
        int telefone, fundacao, dias, x = 0, m;
        
        Info h = new Info();
        
        do{
            m = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n  (1)Informações sobre o hotel\n  (2)Calcular valor da hospedagem\n  (3)Sair"));
            switch (m){
                case 1:{
                    nome = JOptionPane.showInputDialog(" Informe o nome do hotel:");
                    localizacao = JOptionPane.showInputDialog(" Informe o endereço do hotel:");
                    diaria = Double.parseDouble(JOptionPane.showInputDialog(" Informe o valor da diária:"));
                    telefone = Integer.parseInt(JOptionPane.showInputDialog(" Informe o telefone do hotel:"));
                    fundacao = Integer.parseInt(JOptionPane.showInputDialog(" Informe o ano de fundação do hotel:"));

                    h.atribuirInfo(nome, localizacao, diaria, telefone, fundacao);

                    JOptionPane.showMessageDialog(null, " Nome do hotel: " + h.getNome() + "\n Endereço: " + h.getLocalizacao() + "\n Valor da diária: " + h.getValor() + "\n Telefone: " + h.getTelefone() + "\n Ano de fundação: " + h.getFundacao());
                    break;
                }
                case 2:{
                    dias = Integer.parseInt(JOptionPane.showInputDialog(" Informe por quanto tempo você deseja se hospedar neste hotel:"));
                    valor = h.calcHospedagem(dias, diaria);

                    JOptionPane.showMessageDialog(null, " O preço da hospedagem por " + dias + " dias é de:\n  " + valor + " reais. \n  " +  h.calcEuro(valor)+ " euros.\n  " + h.calcDolar(valor) + " dólares");
                    break;
                }
                default:{
                    x = 13;
                    break;
                }
            }
        }while (x == 0);
    }   
}
