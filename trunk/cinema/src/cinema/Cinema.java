package cinema;

import javax.swing.JOptionPane;

public class Cinema {
    public static void main(String[] args) {
        Filme f = new Filme();
        Ator a = new Ator();
        String nome, ator, gen, data, nac;
        int tempo = 0, idade = 0, id, x = 0, m, filme, ano;
        double cache;
        boolean classific = false;
        
        do{
        m = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n (1)Adicionar e Visualizar informações do filme\n (2)Adicionar e Visualizar informações do ator\n (3) Teste se você tem idade para ver esse filme\n (4)Sair"));
        
        switch(m){
            case 1:{
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
                break;
            }
            case 2:{
                ator = JOptionPane.showInputDialog(" Informe o nome do ator:");
                a.atribuirNome(ator);
                
                data = JOptionPane.showInputDialog(" Informe a data de nascimento do ator:");
                a.atribuirData(data);
                
                nac = JOptionPane.showInputDialog(" Informe a nacionalidade do ator:");
                a.atribuirNac(nac);
                
                cache = Double.parseDouble(JOptionPane.showInputDialog(" Informe o cache do ator:"));
                a.atribuirCache(cache);
                
                filme = Integer.parseInt(JOptionPane.showInputDialog(" Informe quantos filmes " + ator + " fez:"));
                a.atribuirCache(cache);
                
                ano = Integer.parseInt(JOptionPane.showInputDialog(" Informe quantos filmes " + ator + " fez neste ano:"));
                a.atribuirFilme_ano(ano);      
                
                JOptionPane.showMessageDialog(null, " Nome do ator: " + ator + "\n Data de nascimento:" + data + "\n Nacionalidade: " + nac + "\n Cache: " + cache + "\n Filmes: " + filme + "\n Filmes neste ano: " + ano);
                break;       
            }
            case 3:{
                id  = Integer.parseInt(JOptionPane.showInputDialog(" Informe sua idade")); 
                classific = f.teste_idade(id);
        
                if (classific == false){
                    JOptionPane.showMessageDialog(null, " Você NÃO pode assistir a esse filme!!!");  
                }
                else{
                     JOptionPane.showMessageDialog(null, " Você pode assistir a esse filme!!!");  
                }
                break;
            }
            default:{
                x = 13;
                break;
            }
        }
        }while(x == 0);      
    }  
}
