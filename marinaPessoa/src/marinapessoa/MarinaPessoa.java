package marinapessoa;
import Modelo.Pessoa;
import javax.swing.JOptionPane;

public class MarinaPessoa {
    public static void main(String[] args) { 
       Pessoa p = new Pessoa(); 

       
       //tratamento de erros inesperados...
        while(p.getCod() == null){     
            try{
                 p.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o código:")));
                 
            }//o q eu estou executando
            catch(Exception ex){// ex guarda o erro
                JOptionPane.showMessageDialog(null, " Informe um código numérico!!!");
            }//  o que fazer quando der erro
        }
        
        p.setNome(JOptionPane.showInputDialog("Informe o nome:"));
        p.setSexo(JOptionPane.showInputDialog("Informe o sexo:"));
     
       JOptionPane.showMessageDialog(null, p.getCod() + "....." + p.getNome() + "   " + p.getSexo());
    }  
}
 