package Revisao;

import javax.swing.JOptionPane;

public class Revisao {
    public static void main(String[] args) {
        Professor p = new Professor();
        int m, x = 0;  
        String nome, endereco, salario, escola, tecnico, superior;
        Boolean tec, sup;

        do{          
             m = Integer.parseInt(JOptionPane.showInputDialog(" Menu:\n\n 1-Inserir informações do professor\n 2-Mostrar informações do professor\n 3-Sair\n"));
             switch(m){
                 case 1:{
                     nome=JOptionPane.showInputDialog(" Informe o nome do professor:");
                     p.setNome(nome);
                     endereco=JOptionPane.showInputDialog(" Informe o endereço do professor:");
                     p.setEndereco(endereco);
                     salario=JOptionPane.showInputDialog(" Informe o salário do professor:");
                     p.setSalario(salario);
                     escola=JOptionPane.showInputDialog(" Informe a escola onde o professor trabalha:");
                     p.setSalario(salario);
                     do{
                       tecnico = JOptionPane.showInputDialog(" O professor dá aula em curso técnico? (s/n):"); 
                     }while(!tecnico.equals("s") && !tecnico.equals("n"));

                     if (tecnico.equals("s")){
                         tec = true;
                     }
                     else{
                         tec = false;
                     }
                     p.setTecnico(tec);

                     do{
                         superior = JOptionPane.showInputDialog(" O professor dá aula em curso superior? (s/n):"); 
                     }while(!superior.equals("s") && !superior.equals("n"));

                     if (superior.equals("s")){
                         sup = true;
                     }
                     else{
                         sup = false;
                     }
                     p.setSuperior(sup);
                     break;  
                 }

                 case 2:{
                     JOptionPane.showMessageDialog(null, " Nome do professor: " + p.getNome() + "\n Endereço do professor: " + p.getEndereco() + "\n Salario do professor: " + p.getSalario() + "\n Escola: " + p.getEscola());
                     if (p.isTecnico() == true){
                         JOptionPane.showMessageDialog(null, " O professor trabalha com ensino técnico!");
                     }
                     else{
                         JOptionPane.showMessageDialog(null, " O professor não trabalha com ensino técnico!");
                     }
                      if (p.isSuperior() == true){
                         JOptionPane.showMessageDialog(null, " O professor trabalha com ensino superior!");
                     }
                     else{
                         JOptionPane.showMessageDialog(null, " O professor não trabalha com ensino superior!");
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
