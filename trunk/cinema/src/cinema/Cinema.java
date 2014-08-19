package cinema;

import javax.swing.JOptionPane;

public class Cinema {
    public static void main(String[] args) {
        Filme f = new Filme();
        String nome, ator, gen;
        int tempo = 0, idade = 0, id;
        boolean classific = false;
        
        nome = JOptionPane.showInputDialog(" Informe o nome do filme:"); // entrada de dados com janelinha\o/
        f.atribuirNome (nome);
       
        tempo = Integer.parseInt(JOptionPane.showInputDialog(" Informe a duração do filme (em minutos): ")); 
        f.atribuirDuracao (tempo);
        
        idade = Integer.parseInt(JOptionPane.showInputDialog(" Informe a classificação indicativa do filme: ")); 
        f.atribuirClassificacao (idade);
        
        gen = JOptionPane.showInputDialog(" Informe o gênero do filme:");
        f.atribuirGenero (gen);
        
        ator = JOptionPane.showInputDialog(" Informe o nome dos atores:"); 
        f.atribuirAtores (ator);        
        
        JOptionPane.showMessageDialog(null, " Nome do filme: " +  nome + "\n Atores principais: " + ator + "\n Duração: " + tempo + "\n Gênero: " + gen + "\n Classificação indicativa:" + idade); // saída de dados com janelinha \o/
        
        JOptionPane.showMessageDialog(null,f.teste_duracao());                
        
        id  = Integer.parseInt(JOptionPane.showInputDialog(" Informe sua idade")); 
        classific = f.teste_idade(id);
        
        if (classific == false){
          JOptionPane.showMessageDialog(null, " Você NÃO pode assistir a esse filme!!!");  
        }
        else{
          JOptionPane.showMessageDialog(null, " Você pode assistir a esse filme!!!");  
        }
       
        
        
        
        
        
    }
   
}
