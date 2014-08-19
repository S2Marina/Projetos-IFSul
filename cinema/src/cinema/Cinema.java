package cinema;

import javax.swing.JOptionPane;

public class Cinema {
    public static void main(String[] args) {
        Filme f = new Filme();
        String nome, ator, ator2, gen = null;
        int classific, tempo = 0, idade = 0;
        
        nome = JOptionPane.showInputDialog(" Informe o nome do filme:"); // entrada de dados com janelinha\o/
        f.atribuirNome (nome);
       
        classific = Integer.parseInt(JOptionPane.showInputDialog(" Informe a duração do filme (em minutos): ")); 
        f.atribuirDuracao (tempo);
        
        classific = Integer.parseInt( JOptionPane.showInputDialog(" Informe a classificação indicativa do filme: ")); 
        f.atribuirClassificacao (idade);
        
        gen = JOptionPane.showInputDialog(" Informe o gênero do filme:");
        f.atribuirGenero (gen);
        
        ator = JOptionPane.showInputDialog(" Informe o nome dos atores:"); 
        f.atribuirAtores (ator);        
        
        JOptionPane.showMessageDialog(null, nome); // saída de dados com janelinha \o/
        
    }
   
}
