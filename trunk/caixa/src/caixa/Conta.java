package caixa;

import javax.swing.JOptionPane;

public class Conta {
    String agencia, nome;
    Double saldo, saque, deposito;
    int num;
    Boolean ativa = true;
    
    void abrirConta (String nome, Integer num, Integer agencia){
        ativa = true;
        saldo = 0.0 ;
    }
    
    Boolean Sacar (Double saque){
        if (ativa == true && saldo >= saque){
            saldo = saldo - saque;
            return true;
        }
         else{
            return false;
        }
    }
    
    Boolean Depositar (Double deposito){
        if (ativa == true){
            saldo += deposito;
            return true;
        }
         else{
            return false;
        }
    }
    
    Double retornarSaldo (){
        return saldo;
    }
    
    void fecharConta (){
        ativa = false;
    }

    
}
