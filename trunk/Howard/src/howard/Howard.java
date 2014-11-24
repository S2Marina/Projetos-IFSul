package howard;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Howard {
    public static void main(String[] args) {
        List<Roupas> listaA = new ArrayList<Roupas> ();
        List<Roupas> listaB = new ArrayList<Roupas> ();
        List<Roupas> listaC = new ArrayList<Roupas> ();
        List<Roupas> listaD = new ArrayList<Roupas> ();
        List<Roupas> listaE = new ArrayList<Roupas> ();
        
        String retorno = " ", tipo, descricao, cor, personagem, codNasa, dia, preferida, fantasia;
        int posicao = 0, x = 1,menu = 1;
        
        Roupas r = new Roupas();
        Prateleiras p = new Prateleiras();
        
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
                        listaA.add(r);
                    }
                    else if(p.qualPrateleira(r).equals("B")){
                        listaB.add(r);
                    }     
                    else if(p.qualPrateleira(r).equals("C")){
                        listaC.add(r);
                    }
                    else if(p.qualPrateleira(r).equals("D")){
                        listaD.add(r);
                    }
                    else if(p.qualPrateleira(r).equals("E")){
                        listaE.add(r);
                    }
                    break;

          }
             case 2:{
                 JOptionPane.showMessageDialog(null, "Prateleira A:");
                 do{
                     Roupas a = listaA.get(posicao);
                     retorno +=  a.retornoRoupa();
                 }while(posicao <= listaA.size());
                 JOptionPane.showMessageDialog(null, retorno);
                 
                 JOptionPane.showMessageDialog(null, "Prateleira B:");
                 do{
                     Roupas b = listaB.get(posicao);
                     retorno +=  b.retornoRoupa();
                 }while(posicao <= listaB.size());
                 JOptionPane.showMessageDialog(null, retorno);
                 
                 JOptionPane.showMessageDialog(null, "Prateleira C:");
                 do{
                     Roupas c = listaC.get(posicao);
                     retorno +=  c.retornoRoupa();
                 }while(posicao <= listaC.size());
                 JOptionPane.showMessageDialog(null, retorno);
                 
                 JOptionPane.showMessageDialog(null, "Prateleira D:");
                 do{
                     Roupas d = listaD.get(posicao);
                     retorno +=  d.retornoRoupa();
                 }while(posicao <= listaD.size());
                 JOptionPane.showMessageDialog(null, retorno);
                 
                 JOptionPane.showMessageDialog(null, "Prateleira E:");
                 do{
                     Roupas e = listaE.get(posicao);
                     retorno +=  e.retornoRoupa();
                 }while(posicao <= listaE.size());
                 JOptionPane.showMessageDialog(null, retorno);
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
