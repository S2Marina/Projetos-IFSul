package caixa.v3;

import java.util.ArrayList;
import java.util.List;

public class Bancos {
    public static void main(String[] args) {
        List<Banco> bancos = new ArrayList<Banco>();
        Banco b = new Banco();
        
        b.setNome("Banco X");
        b.setNum("0000");
        bancos.add(b);
        
        b = new Banco();
        
        b.setNome("Banco Y");
        b.setNum("0001");
        bancos.add(b);
        
        b = new Banco();
        
        b.setNome("Banco Z");
        b.setNum("0002");
        bancos.add(b);
        
        for (Banco banco : bancos) {
            System.out.println(banco.getNome());
            System.out.println(banco.getNum());
        }
       
    }
    
}
