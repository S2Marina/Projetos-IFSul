package exemploheranca;

import javax.swing.JOptionPane;

public class ExemploHeranca {
    public static void main(String[] args) {
        
        ArquivoVideo v = new ArquivoVideo();
        
        v.setNome("Trabalho de Inglês");
        v.setTipo("mp4");
        v.setTamanho("120mb");
        v.setDuracao("4 minutos");
        v.setAutor("Tiffany, Marina e Rafaella");
        
        Arquivo a = new Arquivo();
        
        a.setNome("Poeminha");
        a.setTipo("txt");
        a.setTamanho("1kb");
        
        GerenciadordeArquivo g = new GerenciadordeArquivo();
        
        g.setSistemaOperacional("Windows 7 - ");
        
        System.out.println(g.visualizarArquivo(a));
        
        System.out.println(g.visualizarArquivo(v));
     }  
}  
   
