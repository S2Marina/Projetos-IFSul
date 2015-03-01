package caixa.v2;

import java.util.ArrayList;
import java.util.List;

public class Contas {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<Conta>();
        Conta c = new Conta();
        
        //Criar conta:
        c.abrirConta("M", "13", "0000");
        
        //adicionar na lista:
        contas.add(c);
        
        c = new Conta();//renova o valor de c
        
        c.abrirConta("x", "1", "0001");
        contas.add(c);
        
        for (Conta conta : contas) {
            System.out.println(c.getNome());
        }
    
    }
    
}
