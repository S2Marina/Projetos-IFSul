package cinema;

import javax.swing.JOptionPane;

public class Ator {
   String ator, data, nac;
   Double cache;
   int filme, ano;
   boolean oscar;
   
    void atribuirNome (String valor)
    {
        ator = valor;
    }
    String retornarNome()
    {
        return ator;
    }
    
     void atribuirData (String valor)
    {
        data = valor;
    }
    String retornarData()
    {
        return data;
    }
    
     void atribuirNac (String valor)
    {
        nac = valor;
    }
    String retornarNac()
    {
        return nac;
    }
    
     void atribuirCache (Double valor)
    {
        cache = valor;
    }
    Double retornarCache()
    {
        return cache;
    }
    
     void atribuirFilme (Integer valor)
    {
        filme = valor;
    }
    Integer retornarFilme()
    {
        return filme;
    }
    
    void atribuirFilme_ano (Integer valor)
    {
        ano = valor;
    }
    Integer retornarFilme_ano()
    {
        return ano;
    }
    
    Boolean teste_oscar (){
        oscar = Boolean.parseBoolean(JOptionPane.showInputDialog(nome + " ganhou o oscar? ")); 
        return oscar;
    }
    
    
    
    
    
}
