package marinalivros;

import javax.swing.JOptionPane;

public class MarinaLivros {
    public static void main(String[] args) {
        Livro l = new Livro();
        Autor a = new Autor();
        
        int m, x = 0;
        
        //atributos da classe livro:
        String titulo, ano, autor, imp;
        int tiragem, vendidos;
        Double preco, vtotal;
        boolean importado;
        
        //atributos da classe autor:
        String nome, sobrenome, nascimento;
        int qlivros;
        
        //entrada e saída:
        do{
            m = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n 1-Inserir informações do livro\n 2-Exibir informações do livro\n 3-Inserir informações do autor\n 4-Exibir informações do autor\n 0-Sair"));
            switch(m){
                case 1:{
                    titulo = JOptionPane.showInputDialog(" Informe o título do livro:");
                    autor = JOptionPane.showInputDialog(" Informe o nome do autor do livro");
                    ano = JOptionPane.showInputDialog(" Informe o ano de publicação do livro");
                    preco = Double.parseDouble(JOptionPane.showInputDialog(" Informe o preço do exemplar:"));
                    tiragem = Integer.parseInt(JOptionPane.showInputDialog(" Informe a tiragem inicial do livro:"));
                    vendidos = Integer.parseInt(JOptionPane.showInputDialog(" Informe o total de livros vendidos:"));
                    do{
                        imp = JOptionPane.showInputDialog(" O livro é importado? (s/n)");
                       }while (!imp.equals("s") && !imp.equals("n"));
                    
                    if (imp.equals("s")){
                        importado = true;
                    }
                    else{
                        importado = false;
                    }
                    
                    l.setTitulo(titulo);
                    l.setAutor(autor);
                    l.setAno(ano);
                    l.setPreco(preco);
                    l.setTiragem(tiragem);
                    l.setVendidos(vendidos);
                    l.setImportado(importado);
                    
                    x = 0;
                    break;
                }
                case 2:{
                    importado = l.isImportado();
                    if (importado = true){
                         imp = "\n O livro é importado!";   
                    }
                    else{
                        imp = "\n O livro NÃO é importado!"; 
                    }
                    JOptionPane.showMessageDialog(null, "Informações do livro:\n Título: " + l.getTitulo() + "\n Nome do autor: " + l.getAutor() + "\n Ano de publicação: " + l.getAno() + "\n Preço: " + l.getPreco() + "\n Tiragem inicial: " + l.getTiragem() + "\n Total de exmplares vendidos: " + l.getVendidos() + imp);
                    JOptionPane.showMessageDialog(null, "Esse livro foi: \n " + l.getSucesso(l.getVendidos()) + "\n O valor rendido por ele foi de R$ " + (vtotal = l.getValor(l.getVendidos(),l.getPreco())) + "\n O autor ganhou R$ " + l.ganhosAutor(vtotal, importado));
                    
                    x = 0;
                    break;
                }
                case 3:{
                   nome = JOptionPane.showInputDialog(" Informe o nome do autor:");
                   sobrenome = JOptionPane.showInputDialog(" Informe o sobrenome do autor:");
                   nascimento = JOptionPane.showInputDialog(" Informe a data de nascimento do autor:");
                   qlivros = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de livros que ele publicou:"));
                    
                   a.setNome(nome);
                   a.setSobrenome(sobrenome);
                   a.setNascimento(nascimento);
                   a.setQlivros(qlivros);
                    
                   x = 0;
                   break;
                }
              case 4:{
                   JOptionPane.showMessageDialog(null, a.infoAutor(a.getNome(), a.getSobrenome(), a.getQlivros()));
                   
                   x = 0;
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
