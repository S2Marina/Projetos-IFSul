package howard;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Howard {
    public static void main(String[] args) {
        
        Roupas r = new Roupas();
        Fantasias f = new Fantasias();
        Astronauta a = new Astronauta();
        Prateleiras p = new Prateleiras();
            
        a.setDescricao("Camisa Oficial da missão Marte Ataca");
        a.setTipo("Camisa");
        a.setCor("Branca");
        a.setCodNasa("1AXBC5");
        a.setPreferida(true);
        p.getLista().add(a);
        
        JOptionPane.showMessageDialog(null, "Prateleira A:"  + p.retornoPrateleira());
        
        p = new Prateleiras();
        
        r.setDescricao("Camiseta Xadrez");
        r.setCor("Azul");
        r.setTipo("Camisa");
        r.setPreferida(false);
        p.getLista().add(r);
        
        r = new Roupas();
        
        r.setDescricao("Camiseta Xadrez");
        r.setCor("Verde");
        r.setTipo("Camisa");
        r.setPreferida(false);
        p.getLista().add(r);
        
        r = new Roupas();
        
        r.setDescricao("Camiseta Xadrez");
        r.setCor("Rosa");
        r.setTipo("Camisa");
        r.setPreferida(false);
        p.getLista().add(r);
        
        r = new Roupas();
        
        r.setDescricao("Camiseta Nova");
        r.setCor("Azul");
        r.setTipo("Camiseta");
        r.setPreferida(false);
        p.getLista().add(r);
        
        r = new Roupas();
        
        r.setDescricao("Camiseta Gola Polo");
        r.setCor("Azul");
        r.setTipo("Camiseta");
        r.setPreferida(false);
        p.getLista().add(r);
        
        r = new Roupas();
                
        r.setDescricao("Calça");
        r.setCor("Roxa");
        r.setTipo("Calça");
        r.setPreferida(false);
        p.getLista().add(r);
        
        r = new Roupas();
        
        JOptionPane.showMessageDialog(null, "Prateleira B:"  + p.retornoPrateleira());
         
        p = new Prateleiras();
        
        f.setDescricao("Camisa");
        f.setTipo("Camisa");
        f.setCor("Azul");
        f.setPersonagem("Superman");
        f.setPreferida(false);
        p.getLista().add(f);
        
        f = new Fantasias();
        
        f.setDescricao("Bermuda");
        f.setTipo("Bermuda");
        f.setCor("Verde");
        f.setPersonagem("Coringa");
        f.setPreferida(false);
        p.getLista().add(f);
        
        f = new Fantasias();
        
        JOptionPane.showMessageDialog(null, "Prateleira C:"  + p.retornoPrateleira());
 
}
}