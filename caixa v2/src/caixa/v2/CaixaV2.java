package caixa.v2;

import javax.swing.JOptionPane;

public class CaixaV2 {
    public static void main(String[] args) {
       Conta c = new Conta();
       Cliente cl = new Cliente();
        int op = 0, x = 0, num, agencia, n;
        String nome, end, nasc = "", cpf;
        double valor = 0, saldo = 0;
        Boolean saque, deposito, ativa = true, pend;
        
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog(" Menu:\n(1) Abrir conta\n(2) Sacar\n(3) Depositar\n(4) Saldo\n(5) Fechar conta\n(0) Sair"));
        switch (op){
            case 1:{
              nome = JOptionPane.showInputDialog(" Informe seu nome:");
              end = JOptionPane.showInputDialog(" Informe seu endereço:");
              nasc = JOptionPane.showInputDialog(" Informe sua data de nascimento:");
              cpf = JOptionPane.showInputDialog(" Informe seu cpf:");
              num = Integer.parseInt(JOptionPane.showInputDialog(" Informe o número da conta:"));
              agencia = Integer.parseInt(JOptionPane.showInputDialog(" Informe o número da agência:"));
              
              c.abrirConta(nome, num, agencia);  
              cl.setNome(nome);
              cl.setEnd(end);
              cl.setNasc(nasc);
              cl.setCpf(cpf);
              cl.setSerasa(false);
              cl.setSpc(false);
              JOptionPane.showMessageDialog(null, " Sua conta foi criada com sucesso!!!");
              break;
            }
            case 2:{
                valor = Double.parseDouble(JOptionPane.showInputDialog(" Informe o valor do saque:"));
                saque = c.Sacar(valor);
                if (saque == true){
                    JOptionPane.showMessageDialog(null, " Saque realizado com sucesso!!!"); 
                }
                else{
                    JOptionPane.showMessageDialog(null, " Você precisa ter uma conta ativa e saldo suficiente para realizar um saque!!!");
                }
                break;
            }
            case 3:{
                valor = Double.parseDouble(JOptionPane.showInputDialog(" Informe o valor do depósito:"));
                deposito = c.Depositar(valor);
                if (deposito == true){
                  JOptionPane.showMessageDialog(null, " Depósito realizado com sucesso!!!");  
                }
                else{
                  JOptionPane.showMessageDialog(null, " Você precisa ter uma conta ativa para realizar um depósito!!!");    
                }
                break;
            }
            case 4:{
                saldo = c.retornarSaldo();
                pend = cl.verificaPendencias();
                if (pend = true){
                    JOptionPane.showMessageDialog(null, " Você está negativado!!! ");
                }
                JOptionPane.showMessageDialog(null, " Seu saldo é de R$ " + saldo);   
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
