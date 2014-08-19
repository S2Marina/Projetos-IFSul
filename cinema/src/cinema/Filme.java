package cinema;
import javax.swing.JOptionPane;
public class Filme {
    String nome, gen, ator, dur;
    int tempo, idade, id;
    boolean classific;
    
    void atribuirNome (String valor)
    {
        nome = valor;
    }
    String retornarNome()
    {
        return nome;
    }
    
    void atribuirDuracao (int valor)
    {
        tempo = valor;
    }
    int retornarDuracao()
    {
        return tempo;
    }
    
    void atribuirClassificacao (int valor)
    {
        idade = valor;
    }
    int retornarClassificacao()
    {
        return idade;
    }
    
    void atribuirGenero (String valor)
    {
        gen = valor;
    }
    String retornarGenero()
    {
        return gen;
    }
    
    void atribuirAtores (String valor)
    {   
        ator = valor;
    }
    String retornarAtores()
    {
        return ator;
    }  
    
    String teste_duracao (){
        if (tempo > 60){
            dur = " Longa Metragem"; 
        }
        else{
            dur = " Curta Metragem";
        }
        return dur;
    }
  
    boolean teste_idade (int id){
         if (id < idade){
             classific = false;
         }
         else{
             classific = true;
         }
         return classific;
    }
}

