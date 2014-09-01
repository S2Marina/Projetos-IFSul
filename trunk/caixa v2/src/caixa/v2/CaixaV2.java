package caixa.v2;

import javax.swing.JOptionPane;

public class CaixaV2 {
    public static void main(String[] args) {
       Conta c = new Conta();
       Cliente cl = new Cliente();
       Banco b = new Banco();
               
        int op = 0, x = 0, num, agencia, n;
        String nome, emprestimo, emprestimo1, banco, numero, end, nasc = "", cpf;
        double valor = 0, saldo = 0;
        Boolean saque, carro, imovel,deposito, ativa = true, pend;
        
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog(" Menu:\n(1) Abrir conta\n(2) Sacar\n(3) Depositar\n(4) Saldo\n(5) Fechar conta\n(6) Banco\n(0) Sair"));
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
            case 6:{
                banco = JOptionPane.showInputDialog(" Informe o nome do banco:");
                b.setNome(banco);
                numero = JOptionPane.showInputDialog(" Informe o número do banco:");
                b.setNum(numero);
                emprestimo = JOptionPane.showInputDialog(" O Banco oferece empréstimo - Carro (s/n):"); 
                
                if (emprestimo.equals("s")){
                    carro = true;
                }
                else{
                    carro = false;
                }
                
                b.setCarro(carro);
                emprestimo1 = (JOptionPane.showInputDialog(" O Banco oferece empréstimo - Imovél (s/n):"));
                
                if (emprestimo1.equals("s")){
                    imovel = true;
                }
                else{
                    imovel = false;
                }
                
                b.setImovel(imovel);
                b.isCarro();
                b.isImovel();
                
                if (carro == true){
                    emprestimo = " oferece empréstimos - Carro e ";
                }
                else{
                    emprestimo = " não oferece empréstimos - Carro e ";
                }
                
                if (imovel == true){
                    emprestimo1 = "oferece empréstimos - Imóvel.";
                }
                else{
                    emprestimo1 = "não oferece empréstimos - Imóvel.";
                }
                
                JOptionPane.showMessageDialog(null, " O banco " + b.getNome() + " , nº " + b.getNum() + emprestimo + emprestimo1);
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