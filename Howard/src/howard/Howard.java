package howard;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Howard {
    public static void main(String[] args) {
        List<Roupas> lista = new ArrayList<Roupas> ();
        
        String tipo, descricao, cor, personagem, codNasa, dia, preferida;
        int posicao = 0, x = 1,menu = 1;
        
        Roupas r = new Roupas();
        Prateleiras p = new Prateleiras();
        Fantasias f = new Fantasias();
        Astronauta a = new Astronauta();
        
         do{        
         menu = Integer.parseInt(JOptionPane.showInputDialog(" (1) Cadastrar uma roupa\n (2) Exibir roupas cadastradas\n (0)  Sair"));
        
         switch(menu){
             case 1:{
                    descricao = JOptionPane.showInputDialog(" Descrição da roupa:");
                    if(descricao.equalsIgnoreCase("Roupa de Astronauta")){
                       codNasa = JOptionPane.showInputDialog(" Informe o código da NASA:");
                       r.setCodNasa(codNasa);
                       dia = JOptionPane.showInputDialog(" Qual a data em que ganhou essa roupa?");
                       r.setDia(dia);
                    }

                    tipo = JOptionPane.showInputDialog(" Tipo de roupa:");
                    cor = JOptionPane.showInputDialog(" Cor da roupa:");
                    preferida = JOptionPane.showInputDialog(" Essa roupa é uma das preferidas?");
                    fantasia = JOptionPane.showInputDialog(" Essa roupa é uma fantasia?");

                    r.setDescricao(descricao);
                    r.setTipo(tipo);
                    r.setCor(cor);

                    if(fantasia.equalsIgnoreCase("Sim")){
                        personagem = JOptionPane.showInputDialog(" Qual personagem ela representa?");
                        r.setFantasia(true);
                        r.setPersonagem(personagem);
                     }
                    else{
                        r.setFantasia(false);
                    }

                    if(p.qualPrateleira(r).equals("A")){
                        
                    }
                    else if(p.qualPrateleira(r).equals("B")){
                        
                    }     
                    else if(p.qualPrateleira(r).equals("C")){
                      
                    }
                    else if(p.qualPrateleira(r).equals("D")){
                     
                    }
                    else if(p.qualPrateleira(r).equals("E")){
                       
                    }
                    break;

          }
             case 2:{
                                
                 break;
             }
             
             case 0:{
                 x = 0;
                 break;
             }
             default:{
                 JOptionPane.showMessageDialog(null, " Opção inválida!!!");
                 break;
             }  
    }

}while(x != 0);
}
}
