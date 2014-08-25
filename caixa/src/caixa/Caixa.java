package caixa;

import javax.swing.JOptionPane;

public class Caixa {
    public static void main(String[] args) {
        Conta c = new Conta();
        int op = 0, x = 0, num, agencia;
        String nome;
        double valor, saldo = 0;
        Boolean saque, deposito, ativa = true;
        
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog(" Menu:\n(1) Abrir conta\n(2) Sacar\n(3) Depositar\n(4) Saldo\n(5) Fechar conta\n(0) Sair"));
        switch (op){
            case 1:{
              nome = JOptionPane.showInputDialog(" Informe seu nome:");
              num = Integer.parseInt(JOptionPane.showInputDialog(" Informe o número da conta:"));
              agencia = Integer.parseInt(JOptionPane.showInputDialog(" Informe o número da agência:"));
              c.abrirConta(nome, num, agencia);  
              JOptionPane.showMessageDialog(null, " Sua conta foi criada com sucesso!!!");
              break;
            }
            case 2:{
                valor = Double.parseDouble(JOptionPane.showInputDialog(" Informe o valor do saque:"));
                saque = c.Sacar(valor);
                if (saque == false){
                  JOptionPane.showMessageDialog(null, " Você precisa ter uma conta ativa e saldo suficiente para realizar um saque!!!");
                }
                else{
                  JOptionPane.showMessageDialog(null, " Saque realizado com sucesso!!!"); 
                }
                break;
            }
            case 3:{
                valor = Double.parseDouble(JOptionPane.showInputDialog(" Informe o valor do depósito:"));
                deposito = c.Sacar(valor);
                if (deposito == false){
                  JOptionPane.showMessageDialog(null, " Você precisa ter uma conta ativa para realizar um depósito!!!");
                }
                else{
                  JOptionPane.showMessageDialog(null, " Depósito realizado com sucesso!!!");    
                }
                break;
            }
            case 4:{
                c.retornarSaldo();
                JOptionPane.showMessageDialog(null, " Seu saldo é de R$" + saldo);   
                break;
            }
            case 5:{
                JOptionPane.showMessageDialog(null, " Sua conta foi desativada com sucesso!!!");
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
