package caixa.v3;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        Cliente cl = new Cliente();
        
        cl.setNome(" Marina");
        cl.setCpf("03703882085");
        cl.setNasc("11/08/98");
        clientes.add(cl);        
        
        cl = new Cliente();
        
        cl.setNome(" Maicon");
        cl.setCpf("03759599044");
        cl.setNasc("01/10/98");
        clientes.add(cl);  
        
        cl = new Cliente();
        
        cl.setNome(" Raquel");
        cl.setCpf("1255104789");
        cl.setNasc("09/01/99");
        clientes.add(cl);  
        
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
            System.out.println(cliente.getCpf());
            System.out.println(cliente.getNasc());
        }
   
        
    
}
}
